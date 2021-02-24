/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;

/**
 *
 * @author aurel
 */
@Entity
@Table(name = "profession", catalog = "ProjetData30avrilV2", schema = "")
@NamedQueries({
    @NamedQuery(name = "Profession.findAll", query = "SELECT p FROM Profession p")
    , @NamedQuery(name = "Profession.findByIdentifiantProfession", query = "SELECT p FROM Profession p WHERE p.identifiantProfession = :identifiantProfession")
    , @NamedQuery(name = "Profession.findByNomProfession", query = "SELECT p FROM Profession p WHERE p.nomProfession = :nomProfession")})
public class Profession implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "identifiant_Profession")
    private Integer identifiantProfession;
    @Column(name = "nom_Profession")
    private String nomProfession;

    public Profession() {
    }

    public Profession(Integer identifiantProfession) {
        this.identifiantProfession = identifiantProfession;
    }

    public Integer getIdentifiantProfession() {
        return identifiantProfession;
    }

    public void setIdentifiantProfession(Integer identifiantProfession) {
        Integer oldIdentifiantProfession = this.identifiantProfession;
        this.identifiantProfession = identifiantProfession;
        changeSupport.firePropertyChange("identifiantProfession", oldIdentifiantProfession, identifiantProfession);
    }

    public String getNomProfession() {
        return nomProfession;
    }

    public void setNomProfession(String nomProfession) {
        String oldNomProfession = this.nomProfession;
        this.nomProfession = nomProfession;
        changeSupport.firePropertyChange("nomProfession", oldNomProfession, nomProfession);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identifiantProfession != null ? identifiantProfession.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profession)) {
            return false;
        }
        Profession other = (Profession) object;
        if ((this.identifiantProfession == null && other.identifiantProfession != null) || (this.identifiantProfession != null && !this.identifiantProfession.equals(other.identifiantProfession))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fonctionPatient.Profession[ identifiantProfession=" + identifiantProfession + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
