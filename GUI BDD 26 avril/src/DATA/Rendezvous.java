/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author aurel
 */
@Entity
@Table(name = "rendezvous", catalog = "ProjetData30avrilV2", schema = "")
@NamedQueries({
    @NamedQuery(name = "Rendezvous.findAll", query = "SELECT r FROM Rendezvous r")
    , @NamedQuery(name = "Rendezvous.findByIdentifiantRendezVous", query = "SELECT r FROM Rendezvous r WHERE r.identifiantRendezVous = :identifiantRendezVous")
    , @NamedQuery(name = "Rendezvous.findByDateRendezVous", query = "SELECT r FROM Rendezvous r WHERE r.dateRendezVous = :dateRendezVous")
    , @NamedQuery(name = "Rendezvous.findByHeureRendezVous", query = "SELECT r FROM Rendezvous r WHERE r.heureRendezVous = :heureRendezVous")
    , @NamedQuery(name = "Rendezvous.findByTypeRendezVous", query = "SELECT r FROM Rendezvous r WHERE r.typeRendezVous = :typeRendezVous")
    , @NamedQuery(name = "Rendezvous.findByIdentifiantConsultation", query = "SELECT r FROM Rendezvous r WHERE r.identifiantConsultation = :identifiantConsultation")})






public class Rendezvous implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "identifiant_RendezVous")
    private Integer identifiantRendezVous;

    @Column(name = "Date_RendezVous")
    @Temporal(TemporalType.DATE)
    private Date dateRendezVous;

    @Column(name = "Heure_RendezVous")
    private String heureRendezVous;

    @Column(name = "Type_RendezVous")
    private String typeRendezVous;

    @Column(name = "identifiant_Consultation")
    private Integer identifiantConsultation;

    public Rendezvous() {
    }

    public Rendezvous(Integer identifiantRendezVous) {
        this.identifiantRendezVous = identifiantRendezVous;
    }

    public Integer getIdentifiantRendezVous() {
        return identifiantRendezVous;
    }

    public void setIdentifiantRendezVous(Integer identifiantRendezVous) {
        Integer oldIdentifiantRendezVous = this.identifiantRendezVous;
        this.identifiantRendezVous = identifiantRendezVous;
        changeSupport.firePropertyChange("identifiantRendezVous", oldIdentifiantRendezVous, identifiantRendezVous);
    }

    public Date getDateRendezVous() {
        return dateRendezVous;
    }

    public void setDateRendezVous(Date dateRendezVous) {
        Date oldDateRendezVous = this.dateRendezVous;
        this.dateRendezVous = dateRendezVous;
        changeSupport.firePropertyChange("dateRendezVous", oldDateRendezVous, dateRendezVous);
    }

    public String getHeureRendezVous() {
        return heureRendezVous;
    }

    public void setHeureRendezVous(String heureRendezVous) {
        String oldHeureRendezVous = this.heureRendezVous;
        this.heureRendezVous = heureRendezVous;
        changeSupport.firePropertyChange("heureRendezVous", oldHeureRendezVous, heureRendezVous);
    }

    public String getTypeRendezVous() {
        return typeRendezVous;
    }

    public void setTypeRendezVous(String typeRendezVous) {
        String oldTypeRendezVous = this.typeRendezVous;
        this.typeRendezVous = typeRendezVous;
        changeSupport.firePropertyChange("typeRendezVous", oldTypeRendezVous, typeRendezVous);
    }

    public Integer getIdentifiantConsultation() {
        return identifiantConsultation;
    }

    public void setIdentifiantConsultation(Integer identifiantConsultation) {
        Integer oldIdentifiantConsultation = this.identifiantConsultation;
        this.identifiantConsultation = identifiantConsultation;
        changeSupport.firePropertyChange("identifiantConsultation", oldIdentifiantConsultation, identifiantConsultation);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identifiantRendezVous != null ? identifiantRendezVous.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rendezvous)) {
            return false;
        }
        Rendezvous other = (Rendezvous) object;
        if ((this.identifiantRendezVous == null && other.identifiantRendezVous != null) || (this.identifiantRendezVous != null && !this.identifiantRendezVous.equals(other.identifiantRendezVous))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fonctionPSY.Rendezvous[ identifiantRendezVous=" + identifiantRendezVous + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
