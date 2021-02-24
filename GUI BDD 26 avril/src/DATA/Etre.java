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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "etre", catalog = "ProjetData30avrilV2", schema = "")
@NamedQueries({
    @NamedQuery(name = "Etre.findAll", query = "SELECT e FROM Etre e")
    , @NamedQuery(name = "Etre.findByIdentifiantProfession", query = "SELECT e FROM Etre e WHERE e.etrePK.identifiantProfession = :identifiantProfession")
    , @NamedQuery(name = "Etre.findByIdentifiantPatient", query = "SELECT e FROM Etre e WHERE e.etrePK.identifiantPatient = :identifiantPatient")
    , @NamedQuery(name = "Etre.findByDebutperiode", query = "SELECT e FROM Etre e WHERE e.debutperiode = :debutperiode")
    , @NamedQuery(name = "Etre.findByFinperiode", query = "SELECT e FROM Etre e WHERE e.finperiode = :finperiode")})
public class Etre implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EtrePK etrePK;
    @Basic(optional = false)
    @Column(name = "Debut_periode")
    @Temporal(TemporalType.DATE)
    private Date debutperiode;
    @Column(name = "Fin_periode")
    @Temporal(TemporalType.DATE)
    private Date finperiode;

    public Etre() {
    }

    public Etre(EtrePK etrePK) {
        this.etrePK = etrePK;
    }

    public Etre(EtrePK etrePK, Date debutperiode) {
        this.etrePK = etrePK;
        this.debutperiode = debutperiode;
    }

    public Etre(int identifiantProfession, int identifiantPatient) {
        this.etrePK = new EtrePK(identifiantProfession, identifiantPatient);
    }

    public EtrePK getEtrePK() {
        return etrePK;
    }

    public void setEtrePK(EtrePK etrePK) {
        this.etrePK = etrePK;
    }

    public Date getDebutperiode() {
        return debutperiode;
    }

    public void setDebutperiode(Date debutperiode) {
        Date oldDebutperiode = this.debutperiode;
        this.debutperiode = debutperiode;
        changeSupport.firePropertyChange("debutperiode", oldDebutperiode, debutperiode);
    }

    public Date getFinperiode() {
        return finperiode;
    }

    public void setFinperiode(Date finperiode) {
        Date oldFinperiode = this.finperiode;
        this.finperiode = finperiode;
        changeSupport.firePropertyChange("finperiode", oldFinperiode, finperiode);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (etrePK != null ? etrePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etre)) {
            return false;
        }
        Etre other = (Etre) object;
        if ((this.etrePK == null && other.etrePK != null) || (this.etrePK != null && !this.etrePK.equals(other.etrePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fonctionPatient.Etre[ etrePK=" + etrePK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
