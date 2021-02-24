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
public class EtrePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "identifiant_Profession")
    private int identifiantProfession;
    @Basic(optional = false)
    @Column(name = "identifiant_patient")
    private int identifiantPatient;

    public EtrePK() {
    }

    public EtrePK(int identifiantProfession, int identifiantPatient) {
        this.identifiantProfession = identifiantProfession;
        this.identifiantPatient = identifiantPatient;
    }

    public int getIdentifiantProfession() {
        return identifiantProfession;
    }

    public void setIdentifiantProfession(int identifiantProfession) {
        this.identifiantProfession = identifiantProfession;
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
        hash += (int) identifiantProfession;
        hash += (int) identifiantPatient;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EtrePK)) {
            return false;
        }
        EtrePK other = (EtrePK) object;
        if (this.identifiantProfession != other.identifiantProfession) {
            return false;
        }
        if (this.identifiantPatient != other.identifiantPatient) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fonctionPatient.EtrePK[ identifiantProfession=" + identifiantProfession + ", identifiantPatient=" + identifiantPatient + " ]";
    }
    
}
