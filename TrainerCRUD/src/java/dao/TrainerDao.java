package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import model.Trainer;
import org.springframework.stereotype.Repository;

/**
 * @author Georgia Papavgeri
 */

@Repository
public class TrainerDao {
    
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void insert(Trainer trainer) {
        em.persist(trainer);
    }
    
    public List<Trainer> getAllTrainers(){
        List<Trainer> result = em.createNamedQuery("Trainer.findAll").getResultList();
        return result;
    }
    
    @Transactional
    public Trainer update(String id) {
        Trainer trainer = new Trainer();
        trainer = em.find(Trainer.class, id);
        return trainer;
    }
    
    @Transactional
    public void updateTrainer(Trainer trainer) {
        em.merge(trainer);
    }
    
    @Transactional
    public Trainer findById(int id) {
        Trainer trainer = em.find(Trainer.class, id);
        return trainer;
    }
    
    @Transactional
    public void delete(int id) {
        Trainer trainer = findById(id);
        em.remove(trainer);
    }
}
