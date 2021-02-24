/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "consultation", catalog = "ProjetData30avrilV2", schema = "")
@NamedQueries({
    @NamedQuery(name = "Consultation.findAll", query = "SELECT c FROM Consultation c")
    , @NamedQuery(name = "Consultation.findByIdentifiantConsultation", query = "SELECT c FROM Consultation c WHERE c.identifiantConsultation = :identifiantConsultation")
    , @NamedQuery(name = "Consultation.findByIdentifiantRendezVous", query = "SELECT c FROM Consultation c WHERE c.identifiantRendezVous = :identifiantRendezVous")
    , @NamedQuery(name = "Consultation.findByDateConsultation", query = "SELECT c FROM Consultation c WHERE c.dateConsultation = :dateConsultation")
    , @NamedQuery(name = "Consultation.findByHeureConsultation", query = "SELECT c FROM Consultation c WHERE c.heureConsultation = :heureConsultation")
    , @NamedQuery(name = "Consultation.findByDureeConsultation", query = "SELECT c FROM Consultation c WHERE c.dureeConsultation = :dureeConsultation")
    , @NamedQuery(name = "Consultation.findByAnxieteConsultation", query = "SELECT c FROM Consultation c WHERE c.anxieteConsultation = :anxieteConsultation")
    , @NamedQuery(name = "Consultation.findByPrixConsultation", query = "SELECT c FROM Consultation c WHERE c.prixConsultation = :prixConsultation")
    , @NamedQuery(name = "Consultation.findByPaiementConsultation", query = "SELECT c FROM Consultation c WHERE c.paiementConsultation = :paiementConsultation")})
public class Consultation implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "identifiant_Consultation")
    private Integer identifiantConsultation;
    @Basic(optional = false)
    @Column(name = "identifiant_RendezVous")
    private int identifiantRendezVous;
    @Column(name = "Date_Consultation")
    @Temporal(TemporalType.DATE)
    private Date dateConsultation;
    @Column(name = "Heure_Consultation")
    @Temporal(TemporalType.TIME)
    private Date heureConsultation;
    @Column(name = "Duree_Consultation")
    @Temporal(TemporalType.TIME)
    private Date dureeConsultation;
    @Lob
    @Column(name = "Notes_Consultation")
    private String notesConsultation;
    @Column(name = "Anxiete_Consultation")
    private Integer anxieteConsultation;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Prix_Consultation")
    private BigDecimal prixConsultation;
    @Column(name = "Paiement_Consultation")
    private String paiementConsultation;

    public Consultation() {
    }

    public Consultation(Integer identifiantConsultation) {
        this.identifiantConsultation = identifiantConsultation;
    }

    public Consultation(Integer identifiantConsultation, int identifiantRendezVous) {
        this.identifiantConsultation = identifiantConsultation;
        this.identifiantRendezVous = identifiantRendezVous;
    }

    public Integer getIdentifiantConsultation() {
        return identifiantConsultation;
    }

    public void setIdentifiantConsultation(Integer identifiantConsultation) {
        Integer oldIdentifiantConsultation = this.identifiantConsultation;
        this.identifiantConsultation = identifiantConsultation;
        changeSupport.firePropertyChange("identifiantConsultation", oldIdentifiantConsultation, identifiantConsultation);
    }

    public int getIdentifiantRendezVous() {
        return identifiantRendezVous;
    }

    public void setIdentifiantRendezVous(int identifiantRendezVous) {
        int oldIdentifiantRendezVous = this.identifiantRendezVous;
        this.identifiantRendezVous = identifiantRendezVous;
        changeSupport.firePropertyChange("identifiantRendezVous", oldIdentifiantRendezVous, identifiantRendezVous);
    }

    public Date getDateConsultation() {
        return dateConsultation;
    }

    public void setDateConsultation(Date dateConsultation) {
        Date oldDateConsultation = this.dateConsultation;
        this.dateConsultation = dateConsultation;
        changeSupport.firePropertyChange("dateConsultation", oldDateConsultation, dateConsultation);
    }

    public Date getHeureConsultation() {
        return heureConsultation;
    }

    public void setHeureConsultation(Date heureConsultation) {
        Date oldHeureConsultation = this.heureConsultation;
        this.heureConsultation = heureConsultation;
        changeSupport.firePropertyChange("heureConsultation", oldHeureConsultation, heureConsultation);
    }

    public Date getDureeConsultation() {
        return dureeConsultation;
    }

    public void setDureeConsultation(Date dureeConsultation) {
        Date oldDureeConsultation = this.dureeConsultation;
        this.dureeConsultation = dureeConsultation;
        changeSupport.firePropertyChange("dureeConsultation", oldDureeConsultation, dureeConsultation);
    }

    public String getNotesConsultation() {
        return notesConsultation;
    }

    public void setNotesConsultation(String notesConsultation) {
        String oldNotesConsultation = this.notesConsultation;
        this.notesConsultation = notesConsultation;
        changeSupport.firePropertyChange("notesConsultation", oldNotesConsultation, notesConsultation);
    }

    public Integer getAnxieteConsultation() {
        return anxieteConsultation;
    }

    public void setAnxieteConsultation(Integer anxieteConsultation) {
        Integer oldAnxieteConsultation = this.anxieteConsultation;
        this.anxieteConsultation = anxieteConsultation;
        changeSupport.firePropertyChange("anxieteConsultation", oldAnxieteConsultation, anxieteConsultation);
    }

    public BigDecimal getPrixConsultation() {
        return prixConsultation;
    }

    public void setPrixConsultation(BigDecimal prixConsultation) {
        BigDecimal oldPrixConsultation = this.prixConsultation;
        this.prixConsultation = prixConsultation;
        changeSupport.firePropertyChange("prixConsultation", oldPrixConsultation, prixConsultation);
    }

    public String getPaiementConsultation() {
        return paiementConsultation;
    }

    public void setPaiementConsultation(String paiementConsultation) {
        String oldPaiementConsultation = this.paiementConsultation;
        this.paiementConsultation = paiementConsultation;
        changeSupport.firePropertyChange("paiementConsultation", oldPaiementConsultation, paiementConsultation);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identifiantConsultation != null ? identifiantConsultation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consultation)) {
            return false;
        }
        Consultation other = (Consultation) object;
        if ((this.identifiantConsultation == null && other.identifiantConsultation != null) || (this.identifiantConsultation != null && !this.identifiantConsultation.equals(other.identifiantConsultation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fonctionPatient.Consultation[ identifiantConsultation=" + identifiantConsultation + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
