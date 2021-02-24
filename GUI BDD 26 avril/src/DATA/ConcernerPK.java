/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author aurel
 */
@Embeddable
public class ConcernerPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "identifiant_RendezVous")
    private int identifiantRendezVous;
    @Basic(optional = false)
    @Column(name = "identifiant_patient")
    private int identifiantPatient;

    public ConcernerPK() {
    }

    public ConcernerPK(int identifiantRendezVous, int identifiantPatient) {
        this.identifiantRendezVous = identifiantRendezVous;
        this.identifiantPatient = identifiantPatient;
    }

    public int getIdentifiantRendezVous() {
        return identifiantRendezVous;
    }

    public void setIdentifiantRendezVous(int identifiantRendezVous) {
        this.identifiantRendezVous = identifiantRendezVous;
    }

    public int getIdentifiantPatient() {
        return identifiantPatient;
    }

    public void setIdentifiantPatient(int identifiantPatient) {
        this.identifiantPatient = identifiantPatient;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) identifiantRendezVous;
        hash += (int) identifiantPatient;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConcernerPK)) {
            return false;
        }
        ConcernerPK other = (ConcernerPK) object;
        if (this.identifiantRendezVous != other.identifiantRendezVous) {
            return false;
        }
        if (this.identifiantPatient != other.identifiantPatient) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fonctionPatient.ConcernerPK[ identifiantRendezVous=" + identifiantRendezVous + ", identifiantPatient=" + identifiantPatient + " ]";
    }
    
}
