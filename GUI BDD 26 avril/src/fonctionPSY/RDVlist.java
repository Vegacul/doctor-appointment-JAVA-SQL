/*
 * Groupe 4 
 * ANTHEA LATRUBESSE 
 * AURELIEN KOHL
 *  
 */
package fonctionPSY;

/**
 *
 * @author aurel
 */
public class RDVlist {

    int identifiant_patient;
    String nom_patient;
    String prenom_patient;
    String Date_RendezVous;
    String Heure_RendezVous;
    String Type_RendezVous;
    int identifiant_RendezVous;

    public RDVlist(int identifiant_patient,String nom_patient, String prenom_patient, String Date_RendezVous, String Heure_RendezVous, String Type_RendezVous, int identifiant_RendezVous) {
        this.identifiant_patient= identifiant_patient;
        this.nom_patient = nom_patient;
        this.prenom_patient = prenom_patient;
        this.Date_RendezVous = Date_RendezVous;
        this.Heure_RendezVous = Heure_RendezVous;
        this.Type_RendezVous = Type_RendezVous;
        this.identifiant_RendezVous = identifiant_RendezVous;
    }
    
    public RDVlist(String nom_patient, String prenom_patient, String Date_RendezVous, String Heure_RendezVous, String Type_RendezVous, int identifiant_RendezVous) {
        this.nom_patient = nom_patient;
        this.prenom_patient = prenom_patient;
        this.Date_RendezVous = Date_RendezVous;
        this.Heure_RendezVous = Heure_RendezVous;
        this.Type_RendezVous = Type_RendezVous;
        this.identifiant_RendezVous = identifiant_RendezVous;
    }

    public int getIdentifiant_patient() {
        return identifiant_patient;
    }

    public void setIdentifiant_patient(int identifiant_patient) {
        this.identifiant_patient = identifiant_patient;
    }

    public String getNom_patient() {
        return nom_patient;
    }

    public void setNom_patient(String nom_patient) {
        this.nom_patient = nom_patient;
    }

    public String getPrenom_patient() {
        return prenom_patient;
    }

    public void setPrenom_patient(String prenom_patient) {
        this.prenom_patient = prenom_patient;
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

    public int getIdentifiant_RendezVous() {
        return identifiant_RendezVous;
    }

    public void setIdentifiant_RendezVous(int identifiant_RendezVous) {
        this.identifiant_RendezVous = identifiant_RendezVous;
    }

}
