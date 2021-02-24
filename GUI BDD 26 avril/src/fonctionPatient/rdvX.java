/*
 * Groupe 4 
 * ANTHEA LATRUBESSE 
 * AURELIEN KOHL
 *  
 */
package fonctionPatient;

import java.util.Date;

/**
 *
 * @author aurel
 */
class rdvX {

    private int identifiant_RendezVous;
    private int identifiant_Consultation;
    private String Date_RendezVous, Heure_RendezVous, Type_RendezVous;

    public rdvX(int identifiantRDV, int identifiantConsultation, String date, String heure, String type) {
        this.identifiant_RendezVous = identifiantRDV;
        this.identifiant_Consultation = identifiantConsultation;
        this.Date_RendezVous = date;
        this.Heure_RendezVous = heure;
        this.Type_RendezVous = type;
    }

    //identifiant_RendezVous),rs.getString(Date_RendezVous),rs.getString(Heure_RendezVous)rs.getString(Type_RendezVous),rs.getInt(identifiant_Consultation));
    public int getIdentifiant_RendezVous() {
        return identifiant_RendezVous;
    }

    public void setIdentifiant_RendezVous(int identifiant_RendezVous) {
        this.identifiant_RendezVous = identifiant_RendezVous;
    }

    public int getIdentifiant_Consultation() {
        return identifiant_Consultation;
    }

    public void setIdentifiant_Consultation(int identifiant_Consultation) {
        this.identifiant_Consultation = identifiant_Consultation;
    }

    public String getDate_RendezVous() {
        return Date_RendezVous;
    }

    public void setDate_RendezVous(String Date_RendezVous) {
        this.Date_RendezVous = Date_RendezVous;
    }

    public String getHeure_RendezVous() {
        return Heure_RendezVous;
    }

    public void setHeure_RendezVous(String Heure_RendezVous) {
        this.Heure_RendezVous = Heure_RendezVous;
    }

    public String getType_RendezVous() {
        return Type_RendezVous;
    }

    public void setType_RendezVous(String Type_RendezVous) {
        this.Type_RendezVous = Type_RendezVous;
    }

}
