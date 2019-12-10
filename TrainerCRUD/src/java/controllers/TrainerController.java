package controllers;

import dao.TrainerDao;
import java.util.ArrayList;
import java.util.List;
import model.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Georgia Papavgeri
 */

@Controller
@RequestMapping(value = "trainer")
public class TrainerController {
    
    @Autowired
    TrainerDao td;
    
    @RequestMapping(value = "insert.htm", method = RequestMethod.GET)
    public String insertTrainer(ModelMap m) {
        Trainer trainer = new Trainer();
        m.addAttribute("trainer", trainer);
        return "createForm";
    }
    
    @RequestMapping(value = "formhandling.htm", method = RequestMethod.POST)
    public String showTrainer(ModelMap m, @ModelAttribute("trainer") Trainer trainer) {
        m.addAttribute("trainer", trainer);
        td.insert(trainer);
        return "redirect:/trainer/getall.htm";
    }
    
    @RequestMapping(value = "getall.htm", method = RequestMethod.GET)
    public String getAllTrainers(ModelMap m) {
        List<Trainer> mylist = new ArrayList();
        mylist = td.getAllTrainers();
        m.addAttribute("mylist", mylist);
        return "readForm";
    }
    
    @RequestMapping(value = "update.htm", method = RequestMethod.GET)
    public String showUpdateForm(ModelMap m, @RequestParam("id") int id) {
        m.addAttribute("trainer", td.findById(id));
        return "updateForm";
    }
    
    @RequestMapping(value = "submitUpdate.htm")
    public String updateTrainer(@ModelAttribute(value = "trainer") Trainer trainer) {
        td.updateTrainer(trainer);
        return "redirect:/trainer/getall.htm";
    }
    
    @RequestMapping(value = "delete.htm", method = RequestMethod.GET)
    public String deleteTrainer(ModelMap m, @RequestParam(value = "id", required = false, defaultValue = "all") String id) {
        m.addAttribute("id", id);
        int idNumber = Integer.parseInt(id);
        td.delete(idNumber);
        return "forward:/trainer/getall.htm";
    }
}
