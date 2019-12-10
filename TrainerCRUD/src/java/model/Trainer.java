/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gpapa
 */
@Entity
@Table(name = "trainer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trainer.findAll", query = "SELECT t FROM Trainer t")
    , @NamedQuery(name = "Trainer.findByIdTrainer", query = "SELECT t FROM Trainer t WHERE t.idTrainer = :idTrainer")
    , @NamedQuery(name = "Trainer.findByFirstName", query = "SELECT t FROM Trainer t WHERE t.firstName = :firstName")
    , @NamedQuery(name = "Trainer.findByLastName", query = "SELECT t FROM Trainer t WHERE t.lastName = :lastName")
    , @NamedQuery(name = "Trainer.findBySubject", query = "SELECT t FROM Trainer t WHERE t.subject = :subject")})
public class Trainer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTrainer")
    private Integer idTrainer;
    @Basic(optional = false)
    @Column(name = "firstName")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "subject")
    private String subject;

    public Trainer() {
    }

    public Trainer(Integer idTrainer) {
        this.idTrainer = idTrainer;
    }

    public Trainer(Integer idTrainer, String firstName, String lastName) {
        this.idTrainer = idTrainer;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getIdTrainer() {
        return idTrainer;
    }

    public void setIdTrainer(Integer idTrainer) {
        this.idTrainer = idTrainer;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTrainer != null ? idTrainer.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trainer)) {
            return false;
        }
        Trainer other = (Trainer) object;
        if ((this.idTrainer == null && other.idTrainer != null) || (this.idTrainer != null && !this.idTrainer.equals(other.idTrainer))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Trainer[ idTrainer=" + idTrainer + " ]";
    }
    
}
