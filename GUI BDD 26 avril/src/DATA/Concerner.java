/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author aurel
 */
@Entity
@Table(name = "concerner", catalog = "ProjetData30avrilV2", schema = "")
@NamedQueries({
    @NamedQuery(name = "Concerner.findAll", query = "SELECT c FROM Concerner c")
    , @NamedQuery(name = "Concerner.findByIdentifiantRendezVous", query = "SELECT c FROM Concerner c WHERE c.concernerPK.identifiantRendezVous = :identifiantRendezVous")
    , @NamedQuery(name = "Concerner.findByIdentifiantPatient", query = "SELECT c FROM Concerner c WHERE c.concernerPK.identifiantPatient = :identifiantPatient")})
public class Concerner implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ConcernerPK concernerPK;

    public Concerner() {
    }

    public Concerner(ConcernerPK concernerPK) {
        this.concernerPK = concernerPK;
    }

    public Concerner(int identifiantRendezVous, int identifiantPatient) {
        this.concernerPK = new ConcernerPK(identifiantRendezVous, identifiantPatient);
    }

    public ConcernerPK getConcernerPK() {
        return concernerPK;
    }

    public void setConcernerPK(ConcernerPK concernerPK) {
        this.concernerPK = concernerPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (concernerPK != null ? concernerPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Concerner)) {
            return false;
        }
        Concerner other = (Concerner) object;
        if ((this.concernerPK == null && other.concernerPK != null) || (this.concernerPK != null && !this.concernerPK.equals(other.concernerPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fonctionPatient.Concerner[ concernerPK=" + concernerPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
