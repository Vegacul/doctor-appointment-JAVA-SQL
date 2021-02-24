/*
 * Groupe 4 
 * ANTHEA LATRUBESSE 
 * AURELIEN KOHL
 *  
 */
package fonctionPatient;

import java.util.ArrayList;

import java.sql.Connection;

import java.sql.ResultSet;

import java.sql.Statement;

import javax.swing.JFrame;

//import com.sun.jndi.ldap.Connection;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aurel
 */
public class MesRDV extends javax.swing.JFrame {

    java.sql.Connection conn = null;

    String url = "jdbc:mysql://localhost/ProjetData30avrilV2";
    String login = "root";
    String passwd = "";
    Connection cn = null;
    Statement st = null;
    ResultSet rs = null;
    String Username = "Utilisateur";
    LocalDate Today = (LocalDate.now());

    /**
     * Creates new form MesRDV2
     */
    public MesRDV() {
        initComponents();
        afficherListAncien();
        afficherListFutur();
    }

    public MesRDV(String username) {
        this.Username = username;
        initComponents();
        afficherListAncien();
        afficherListFutur();
    }

    public ArrayList<rdvX> rdvListAncien() {
        ArrayList<rdvX> rdvList = new ArrayList<>();
        try {

            conn = DriverManager.getConnection(url, login, passwd);
            st = (Statement) conn.createStatement();
            rs = st.executeQuery("SELECT  C.identifiant_RendezVous,c.Date_RendezVous,c.Heure_RendezVous,c.Type_RendezVous,c.identifiant_Consultation\n"
                    + "FROM patient A, concerner B, rendezvous C\n"
                    + "WHERE A.identifiant_patient=B.identifiant_patient\n"
                    + "AND B.identifiant_RendezVous=C.identifiant_RendezVous\n"
                    + "AND A.login_patient='" + Username + "' "
                    + "AND Date_RendezVous < '" + Today + "' "
                    + "ORDER BY `Date_RendezVous` ASC ;");
            rdvX rdvx;

            while (rs.next()) {
                rdvx = new rdvX(rs.getInt("identifiant_RendezVous"), rs.getInt("identifiant_Consultation"), rs.getString("Date_RendezVous"), rs.getString("Heure_RendezVous"), rs.getString("Type_RendezVous"));
                rdvList.add(rdvx);
            }

        } catch (SQLException ex) {
            Logger.getLogger(MesRDV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rdvList;

    }

    public void afficherListAncien() {
        ArrayList<rdvX> list = rdvListAncien();
        DefaultTableModel model = (DefaultTableModel) jTableRDVAncien.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getIdentifiant_RendezVous();
            row[1] = list.get(i).getIdentifiant_Consultation();
            row[2] = list.get(i).getDate_RendezVous();
            row[3] = list.get(i).getHeure_RendezVous();
            row[4] = list.get(i).getType_RendezVous();
            model.addRow(row);

        }
    }

    public ArrayList<rdvX> rdvListFutur() {
        ArrayList<rdvX> rdvList = new ArrayList<>();
        try {

            conn = DriverManager.getConnection(url, login, passwd);
            st = (Statement) conn.createStatement();
            rs = st.executeQuery("SELECT  C.identifiant_RendezVous,c.Date_RendezVous,c.Heure_RendezVous,c.Type_RendezVous,c.identifiant_Consultation\n"
                    + "FROM patient A, concerner B, rendezvous C\n"
                    + "WHERE A.identifiant_patient=B.identifiant_patient\n"
                    + "AND B.identifiant_RendezVous=C.identifiant_RendezVous\n"
                    + "AND A.login_patient='" + Username + "' "
                    + "AND Date_RendezVous >= '" + Today + "' "
                    + "ORDER BY `Date_RendezVous` ASC ;");
            rdvX rdvx;

            while (rs.next()) {
                rdvx = new rdvX(rs.getInt("identifiant_RendezVous"), rs.getInt("identifiant_Consultation"), rs.getString("Date_RendezVous"), rs.getString("Heure_RendezVous"), rs.getString("Type_RendezVous"));
                rdvList.add(rdvx);
            }

        } catch (SQLException ex) {
            Logger.getLogger(MesRDV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rdvList;

    }

    public void afficherListFutur() {
        ArrayList<rdvX> list = rdvListFutur();
        DefaultTableModel model = (DefaultTableModel) jTableRDVFutur.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getIdentifiant_RendezVous();
            row[1] = list.get(i).getIdentifiant_Consultation();
            row[2] = list.get(i).getDate_RendezVous();
            row[3] = list.get(i).getHeure_RendezVous();
            row[4] = list.get(i).getType_RendezVous();
            model.addRow(row);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButtonModifier = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButtonSupprimer = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRDVFutur = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableRDVAncien = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion des rendez vous");
        setBackground(new java.awt.Color(0, 204, 0));
        setMaximumSize(new java.awt.Dimension(1008, 450));
        setMinimumSize(new java.awt.Dimension(1008, 450));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 0, 11)); // NOI18N
        jLabel3.setText("Modifier le RDV selectionné :  (vous devez redonner le jour et la date meme si un seul change, merci)");

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        jLabel4.setText("Date :");

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        jLabel5.setText("Heure :");

        jDateChooser1.setFont(new java.awt.Font("Yu Gothic Light", 0, 11)); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Yu Gothic Light", 0, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00:00", "08:30:00", "09:00:00", "09:30:00", "10:00:00", "10:30:00", "11:00:00", "11:30:00", "12:00:00", "12:30:00", "13:00:00", "13:30:00", "14:00:00", "14:30:00", "15:00:00", "15:30:00", "16:00:00", "16:30:00", "17:00:00", "17:30:00", "18:00:00", "18:30:00", "19:00:00", "19:30:00", "20:00:00" }));

        jButtonModifier.setBackground(new java.awt.Color(102, 255, 204));
        jButtonModifier.setFont(new java.awt.Font("Yu Gothic Medium", 3, 24)); // NOI18N
        jButtonModifier.setText("Appliquer les modifications");
        jButtonModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonModifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonModifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Vous voulez annuler le rendez vous selectionné ?");

        jButtonSupprimer.setBackground(new java.awt.Color(255, 102, 102));
        jButtonSupprimer.setFont(new java.awt.Font("Yu Gothic Medium", 3, 24)); // NOI18N
        jButtonSupprimer.setText("Annuler !");
        jButtonSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSupprimerActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic Light", 0, 11)); // NOI18N
        jLabel8.setText("Seulement les futur RDV !");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSupprimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSupprimer)
                .addContainerGap())
        );

        jTableRDVFutur.setFont(new java.awt.Font("Yu Gothic Light", 0, 11)); // NOI18N
        jTableRDVFutur.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rendez-Vous N°", "Consultation N°", "Date ", "Heure", "Type"
            }
        ));
        jScrollPane1.setViewportView(jTableRDVFutur);

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mes Rendez Vous :");

        jTableRDVAncien.setFont(new java.awt.Font("Yu Gothic Light", 0, 11)); // NOI18N
        jTableRDVAncien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rendez-Vous N°", "Consultation N°", "Date ", "Heure", "Type"
            }
        ));
        jScrollPane2.setViewportView(jTableRDVAncien);

        jLabel6.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel6.setText("Vos prochain RDV :");

        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel7.setText("Vos ancien RDV :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifierActionPerformed

        int ligne1 = jTableRDVFutur.getSelectedRow();//ligne du patient
        int colonne1 = 0;//colone identifiant
        int IDrdv = (int) jTableRDVFutur.getValueAt(ligne1, colonne1);
        System.out.println("l'identifiant du rdv selectionné est : " + IDrdv);

        //String Date =(String) jTableRDV.getValueAt(ligne1, 2);
        //String Heure = (String) jTableRDV.getValueAt(ligne1, 3);
        DateFormat sdfB = new SimpleDateFormat("yyy-MM-dd");
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyy-MM-dd");
        String Date = sdfB.format(jDateChooser1.getDate());
        System.out.println("la date selectionnée est : " + Date);

        String Heure = (String) jComboBox1.getSelectedItem();
        System.out.println("l'heure selectionnée est : " + Heure);

        //verifier le jour selectionné pas dimanche 
        Date Date2 = null;
        String joursemaine = null;

        try {
            Date2 = sdfB.parse(Date);

        } catch (ParseException ex) {
            Logger.getLogger(MesRDV.class.getName()).log(Level.SEVERE, null, ex);
        }

        sdfB = new SimpleDateFormat("EEEE");
        joursemaine = sdfB.format(Date2);

        System.out.println(joursemaine);

        if (joursemaine.equals("dimanche")) {
            JOptionPane.showMessageDialog(null, "Désolé, le dimanche c'est sacré ! ", "Erreur", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {

            conn = DriverManager.getConnection(url, login, passwd);
            st = (Statement) conn.createStatement();
            rs = st.executeQuery("SELECT * FROM `rendezvous`");

            while (rs.next()) {
                if ((rs.getString("Date_RendezVous").equals(Date)) && (rs.getString("Heure_RendezVous").equals(Heure))) {
                    JOptionPane.showMessageDialog(null, "Désolé, le creneau n'est plus disponible ! ", "Erreur", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(MesRDV.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            conn = DriverManager.getConnection(url, login, passwd);
            st = (Statement) conn.createStatement();
            //UPDATE `rendezvous` SET `Date_RendezVous` = '2020-05-20' WHERE `rendezvous`.`identifiant_RendezVous` = 11;
            //UPDATE `rendezvous` SET `Heure_RendezVous` = '10:00:00' WHERE `rendezvous`.`identifiant_RendezVous` = 11;
            st.executeUpdate("UPDATE `rendezvous` SET `Date_RendezVous` = '" + Date + "' WHERE `identifiant_RendezVous` =" + IDrdv + " ;");
            st.executeUpdate("UPDATE `rendezvous` SET `Heure_RendezVous` = '" + Heure + "' WHERE `identifiant_RendezVous` =" + IDrdv + " ;");

            JOptionPane.showMessageDialog(null, "Modification RDV Réussi ", "Modifier RDV", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            Logger.getLogger(MesRDV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonModifierActionPerformed

    private void jButtonSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupprimerActionPerformed
        int ligne1 = jTableRDVFutur.getSelectedRow();//ligne du patient
        int colonne1 = 5;//colone identifiant
        int IDrdv = (int) jTableRDVFutur.getValueAt(ligne1, colonne1);
        System.out.println("l'identifiant du rdv selectionné est : " + IDrdv);
        String DateduRDV = (String) jTableRDVFutur.getValueAt(ligne1, 0);

        try {
            conn = DriverManager.getConnection(url, login, passwd);
            st = (Statement) conn.createStatement();

            st.executeUpdate("DELETE FROM `concerner` WHERE `concerner`.`identifiant_RendezVous` = " + IDrdv + " ;");
            st.executeUpdate("DELETE FROM `rendezvous` WHERE `identifiant_RendezVous` = " + IDrdv + " ;");

            JOptionPane.showMessageDialog(null, "Suppression RDV Réussi ", "suppression RDV", JOptionPane.WARNING_MESSAGE);

        } catch (SQLException ex) {
            Logger.getLogger(MesRDV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSupprimerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MesRDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MesRDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MesRDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MesRDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MesRDV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonModifier;
    private javax.swing.JButton jButtonSupprimer;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableRDVAncien;
    private javax.swing.JTable jTableRDVFutur;
    // End of variables declaration//GEN-END:variables
}
