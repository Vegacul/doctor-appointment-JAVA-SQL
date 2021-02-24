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
public class ConsultList {
    int identifiant_patient,identifiant_RendezVous, identifiant_Consultation;
    String nom_patient, prenom_patient, Type_RendezVous, Date_Consultation, Heure_Consultation, Duree_Consultation, Notes_Consultation, Anxiete_Consultation, Prix_Consultation, Paiement_Consultation;

    public ConsultList(int identifiant_patient, int identifiant_RendezVous, int identifiant_Consultation, String nom_patient, String prenom_patient, String Type_RendezVous, String Date_Consultation, String Heure_Consultation, String Duree_Consultation, String Notes_Consultation, String Anxiete_Consultation, String Prix_Consultation, String Paiement_Consultation) {
        this.identifiant_patient = identifiant_patient;
        this.identifiant_RendezVous = identifiant_RendezVous;
        this.identifiant_Consultation = identifiant_Consultation;
        this.nom_patient = nom_patient;
        this.prenom_patient = prenom_patient;
        this.Type_RendezVous = Type_RendezVous;
        this.Date_Consultation = Date_Consultation;
        this.Heure_Consultation = Heure_Consultation;
        this.Duree_Consultation = Duree_Consultation;
        this.Notes_Consultation = Notes_Consultation;
        this.Anxiete_Consultation = Anxiete_Consultation;
        this.Prix_Consultation = Prix_Consultation;
        this.Paiement_Consultation = Paiement_Consultation;
    }

    public int getIdentifiant_patient() {
        return identifiant_patient;
    }

    public void setIdentifiant_patient(int identifiant_patient) {
        this.identifiant_patient = identifiant_patient;
    }

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

    public String getType_RendezVous() {
        return Type_RendezVous;
    }

    public void setType_RendezVous(String Type_RendezVous) {
        this.Type_RendezVous = Type_RendezVous;
    }

    public String getDate_Consultation() {
        return Date_Consultation;
    }

    public void setDate_Consultation(String Date_Consultation) {
        this.Date_Consultation = Date_Consultation;
    }

    public String getHeure_Consultation() {
        return Heure_Consultation;
    }

    public void setHeure_Consultation(String Heure_Consultation) {
        this.Heure_Consultation = Heure_Consultation;
    }

    public String getDuree_Consultation() {
        return Duree_Consultation;
    }

    public void setDuree_Consultation(String Duree_Consultation) {
        this.Duree_Consultation = Duree_Consultation;
    }

    public String getNotes_Consultation() {
        return Notes_Consultation;
    }

    public void setNotes_Consultation(String Notes_Consultation) {
        this.Notes_Consultation = Notes_Consultation;
    }

    public String getAnxiete_Consultation() {
        return Anxiete_Consultation;
    }

    public void setAnxiete_Consultation(String Anxiete_Consultation) {
        this.Anxiete_Consultation = Anxiete_Consultation;
    }

    public String getPrix_Consultation() {
        return Prix_Consultation;
    }

    public void setPrix_Consultation(String Prix_Consultation) {
        this.Prix_Consultation = Prix_Consultation;
    }

    public String getPaiement_Consultation() {
        return Paiement_Consultation;
    }

    public void setPaiement_Consultation(String Paiement_Consultation) {
        this.Paiement_Consultation = Paiement_Consultation;
    }

}
