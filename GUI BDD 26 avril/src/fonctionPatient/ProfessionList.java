/*
 * Groupe 4 
 * ANTHEA LATRUBESSE 
 * AURELIEN KOHL
 *  
 */
package fonctionPatient;

/**
 *
 * @author aurel
 */
public class ProfessionList {
    int identifiant_Profession;
    String nom_Profession,Debut_periode, Fin_periode;

    public ProfessionList(int identifiant_Profession, String nom_Profession, String Debut_periode, String Fin_periode) {
        this.identifiant_Profession = identifiant_Profession;
        this.nom_Profession = nom_Profession;
        this.Debut_periode = Debut_periode;
        this.Fin_periode = Fin_periode;
    }

    public int getIdentifiant_Profession() {
        return identifiant_Profession;
    }

    public void setIdentifiant_Profession(int identifiant_Profession) {
        this.identifiant_Profession = identifiant_Profession;
    }

    public String getNom_Profession() {
        return nom_Profession;
    }

    public void setNom_Profession(String nom_Profession) {
        this.nom_Profession = nom_Profession;
    }

    public String getDebut_periode() {
        return Debut_periode;
    }

    public void setDebut_periode(String Debut_periode) {
        this.Debut_periode = Debut_periode;
    }

    public String getFin_periode() {
        return Fin_periode;
    }

    public void setFin_periode(String Fin_periode) {
        this.Fin_periode = Fin_periode;
    }
    
}
