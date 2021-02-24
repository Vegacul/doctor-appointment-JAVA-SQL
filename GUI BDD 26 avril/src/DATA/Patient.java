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
@Table(name = "patient", catalog = "ProjetData30avrilV2", schema = "")
@NamedQueries({
    @NamedQuery(name = "Patient.findAll", query = "SELECT p FROM Patient p")
    , @NamedQuery(name = "Patient.findByIdentifiantPatient", query = "SELECT p FROM Patient p WHERE p.identifiantPatient = :identifiantPatient")
    , @NamedQuery(name = "Patient.findByNomPatient", query = "SELECT p FROM Patient p WHERE p.nomPatient = :nomPatient")
    , @NamedQuery(name = "Patient.findByPrenomPatient", query = "SELECT p FROM Patient p WHERE p.prenomPatient = :prenomPatient")
    , @NamedQuery(name = "Patient.findByDatenaissancePatient", query = "SELECT p FROM Patient p WHERE p.datenaissancePatient = :datenaissancePatient")
    , @NamedQuery(name = "Patient.findByAgePatient", query = "SELECT p FROM Patient p WHERE p.agePatient = :agePatient")
    , @NamedQuery(name = "Patient.findBySexePatient", query = "SELECT p FROM Patient p WHERE p.sexePatient = :sexePatient")
    , @NamedQuery(name = "Patient.findByTypePatient", query = "SELECT p FROM Patient p WHERE p.typePatient = :typePatient")
    , @NamedQuery(name = "Patient.findByRue", query = "SELECT p FROM Patient p WHERE p.rue = :rue")
    , @NamedQuery(name = "Patient.findByCp", query = "SELECT p FROM Patient p WHERE p.cp = :cp")
    , @NamedQuery(name = "Patient.findByVille", query = "SELECT p FROM Patient p WHERE p.ville = :ville")
    , @NamedQuery(name = "Patient.findByTelPatient", query = "SELECT p FROM Patient p WHERE p.telPatient = :telPatient")
    , @NamedQuery(name = "Patient.findByDecouvertePatient", query = "SELECT p FROM Patient p WHERE p.decouvertePatient = :decouvertePatient")
    , @NamedQuery(name = "Patient.findByLoginPatient", query = "SELECT p FROM Patient p WHERE p.loginPatient = :loginPatient")
    , @NamedQuery(name = "Patient.findByMdpPatient", query = "SELECT p FROM Patient p WHERE p.mdpPatient = :mdpPatient")})
public class Patient implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "identifiant_patient")
    private Integer identifiantPatient;
    @Column(name = "nom_patient")
    private String nomPatient;
    @Column(name = "prenom_patient")
    private String prenomPatient;
    @Column(name = "datenaissance_patient")
    @Temporal(TemporalType.DATE)
    private Date datenaissancePatient;
    @Column(name = "age_patient")
    private Integer agePatient;
    @Column(name = "sexe_patient")
    private String sexePatient;
    @Column(name = "type_patient")
    private String typePatient;
    @Column(name = "rue")
    private String rue;
    @Column(name = "cp")
    private String cp;
    @Column(name = "ville")
    private String ville;
    @Column(name = "tel_patient")
    private String telPatient;
    @Column(name = "decouverte_patient")
    private String decouvertePatient;
    @Column(name = "login_patient")
    private String loginPatient;
    @Column(name = "mdp_patient")
    private String mdpPatient;

    public Patient() {
    }

    public Patient(Integer identifiantPatient) {
        this.identifiantPatient = identifiantPatient;
    }

    public Integer getIdentifiantPatient() {
        return identifiantPatient;
    }

    public void setIdentifiantPatient(Integer identifiantPatient) {
        Integer oldIdentifiantPatient = this.identifiantPatient;
        this.identifiantPatient = identifiantPatient;
        changeSupport.firePropertyChange("identifiantPatient", oldIdentifiantPatient, identifiantPatient);
    }

    public String getNomPatient() {
        return nomPatient;
    }

    public void setNomPatient(String nomPatient) {
        String oldNomPatient = this.nomPatient;
        this.nomPatient = nomPatient;
        changeSupport.firePropertyChange("nomPatient", oldNomPatient, nomPatient);
    }

    public String getPrenomPatient() {
        return prenomPatient;
    }

    public void setPrenomPatient(String prenomPatient) {
        String oldPrenomPatient = this.prenomPatient;
        this.prenomPatient = prenomPatient;
        changeSupport.firePropertyChange("prenomPatient", oldPrenomPatient, prenomPatient);
    }

    public Date getDatenaissancePatient() {
        return datenaissancePatient;
    }

    public void setDatenaissancePatient(Date datenaissancePatient) {
        Date oldDatenaissancePatient = this.datenaissancePatient;
        this.datenaissancePatient = datenaissancePatient;
        changeSupport.firePropertyChange("datenaissancePatient", oldDatenaissancePatient, datenaissancePatient);
    }

    public Integer getAgePatient() {
        return agePatient;
    }

    public void setAgePatient(Integer agePatient) {
        Integer oldAgePatient = this.agePatient;
        this.agePatient = agePatient;
        changeSupport.firePropertyChange("agePatient", oldAgePatient, agePatient);
    }

    public String getSexePatient() {
        return sexePatient;
    }

    public void setSexePatient(String sexePatient) {
        String oldSexePatient = this.sexePatient;
        this.sexePatient = sexePatient;
        changeSupport.firePropertyChange("sexePatient", oldSexePatient, sexePatient);
    }

    public String getTypePatient() {
        return typePatient;
    }

    public void setTypePatient(String typePatient) {
        String oldTypePatient = this.typePatient;
        this.typePatient = typePatient;
        changeSupport.firePropertyChange("typePatient", oldTypePatient, typePatient);
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        String oldRue = this.rue;
        this.rue = rue;
        changeSupport.firePropertyChange("rue", oldRue, rue);
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        String oldCp = this.cp;
        this.cp = cp;
        changeSupport.firePropertyChange("cp", oldCp, cp);
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        String oldVille = this.ville;
        this.ville = ville;
        changeSupport.firePropertyChange("ville", oldVille, ville);
    }

    public String getTelPatient() {
        return telPatient;
    }

    public void setTelPatient(String telPatient) {
        String oldTelPatient = this.telPatient;
        this.telPatient = telPatient;
        changeSupport.firePropertyChange("telPatient", oldTelPatient, telPatient);
    }

    public String getDecouvertePatient() {
        return decouvertePatient;
    }

    public void setDecouvertePatient(String decouvertePatient) {
        String oldDecouvertePatient = this.decouvertePatient;
        this.decouvertePatient = decouvertePatient;
        changeSupport.firePropertyChange("decouvertePatient", oldDecouvertePatient, decouvertePatient);
    }

    public String getLoginPatient() {
        return loginPatient;
    }

    public void setLoginPatient(String loginPatient) {
        String oldLoginPatient = this.loginPatient;
        this.loginPatient = loginPatient;
        changeSupport.firePropertyChange("loginPatient", oldLoginPatient, loginPatient);
    }

    public String getMdpPatient() {
        return mdpPatient;
    }

    public void setMdpPatient(String mdpPatient) {
        String oldMdpPatient = this.mdpPatient;
        this.mdpPatient = mdpPatient;
        changeSupport.firePropertyChange("mdpPatient", oldMdpPatient, mdpPatient);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identifiantPatient != null ? identifiantPatient.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patient)) {
            return false;
        }
        Patient other = (Patient) object;
        if ((this.identifiantPatient == null && other.identifiantPatient != null) || (this.identifiantPatient != null && !this.identifiantPatient.equals(other.identifiantPatient))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fonctionPSY.Patient[ identifiantPatient=" + identifiantPatient + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
