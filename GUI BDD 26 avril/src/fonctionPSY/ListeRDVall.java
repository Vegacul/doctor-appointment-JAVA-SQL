/*
 * Groupe 4 
 * ANTHEA LATRUBESSE 
 * AURELIEN KOHL
 *  
 */
package fonctionPSY;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aurel
 */
public class ListeRDVall extends javax.swing.JFrame {

    java.sql.Connection conn = null;

    String url = "jdbc:mysql://localhost/ProjetData30avrilV2";
    String login = "root";
    String passwd = "";
    Connection cn = null;
    Statement st = null;
    ResultSet rs = null;

    /**
     * Creates new form ListeRDV
     */
    public ListeRDVall() {
        initComponents();
        afficherList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProjetData30avrilV2PUEntityManager0 = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ProjetData30avrilV2PU").createEntityManager();
        rendezvousQuery = java.beans.Beans.isDesignTime() ? null : ProjetData30avrilV2PUEntityManager0.createQuery("SELECT r FROM Rendezvous r");
        rendezvousList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : rendezvousQuery.getResultList();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jButtonTelechargerJour = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonModifier = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButtonSupprimer = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableRDV = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Liste des Rendez Vous");
        setBackground(new java.awt.Color(204, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 650));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jButtonTelechargerJour.setBackground(new java.awt.Color(204, 255, 255));
        jButtonTelechargerJour.setFont(new java.awt.Font("Yu Gothic", 3, 14)); // NOI18N
        jButtonTelechargerJour.setText("Telecharger");
        jButtonTelechargerJour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTelechargerJourActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic Light", 2, 11)); // NOI18N
        jLabel3.setText("Choisissez le jour ;");

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Telecharger les rendez-vous du ->");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonTelechargerJour, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTelechargerJour, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel9.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        jLabel9.setText("Heure :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00:00", "08:30:00", "09:00:00", "09:30:00", "10:00:00", "10:30:00", "11:00:00", "11:30:00", "12:00:00", "12:30:00", "13:00:00", "13:30:00", "14:00:00", "14:30:00", "15:00:00", "15:30:00", "16:00:00", "16:30:00", "17:00:00", "17:30:00", "18:00:00", "18:30:00", "19:00:00", "19:30:00", "20:00:00" }));

        jLabel6.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        jLabel6.setText("Date :");

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel4.setText("Modification du rendez vous selectionné : ");

        jButtonModifier.setBackground(new java.awt.Color(204, 255, 255));
        jButtonModifier.setFont(new java.awt.Font("Yu Gothic Medium", 0, 11)); // NOI18N
        jButtonModifier.setText("Appliquer les modifications");
        jButtonModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifierActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Yu Gothic Light", 0, 11)); // NOI18N
        jLabel7.setText("redonner date et heure !");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonModifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonModifier)
                .addGap(8, 8, 8))
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel8.setText("Supprimer le rendez vous selectionné : ");

        jButtonSupprimer.setBackground(new java.awt.Color(255, 153, 153));
        jButtonSupprimer.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jButtonSupprimer.setText("Supprimer le RDV");
        jButtonSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSupprimerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSupprimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 48, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSupprimer)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(462, 400));
        jPanel4.setPreferredSize(new java.awt.Dimension(462, 400));

        jTableRDV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nom", "Prénom", "Date", "Heure", "Type", "Identifiant"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableRDV);

        jLabel5.setFont(new java.awt.Font("Yu Gothic Light", 0, 11)); // NOI18N
        jLabel5.setText("Cliquez sur un rendez vous pour le modifer ou le supprimer.");

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Liste de tous les Rendez Vous");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTelechargerJourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTelechargerJourActionPerformed
        DateFormat sdfB = new SimpleDateFormat("yyy-MM-dd");
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyy-MM-dd");
        String Date = sdfB.format(jCalendar1.getDate());
        System.out.println("la date selectionnée est : " + Date);
        try {
            creerfichierJour(Date);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ListeRDVall.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ListeRDVall.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ListeRDVall.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonTelechargerJourActionPerformed

    private void jButtonSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupprimerActionPerformed
        int ligne1 = jTableRDV.getSelectedRow();//ligne du patient
        int colonne1 = 5;//colone identifiant
        int IDrdv = (int) jTableRDV.getValueAt(ligne1, colonne1);
        System.out.println("l'identifiant du rdv selectionné est : " + IDrdv);

        try {
            conn = DriverManager.getConnection(url, login, passwd);
            st = (Statement) conn.createStatement();
            //UPDATE `rendezvous` SET `Date_RendezVous` = '2020-05-20' WHERE `rendezvous`.`identifiant_RendezVous` = 11;
            //UPDATE `rendezvous` SET `Heure_RendezVous` = '10:00:00' WHERE `rendezvous`.`identifiant_RendezVous` = 11;
            //st.executeUpdate("UPDATE `rendezvous` SET `Date_RendezVous` = '"++"' WHERE `identifiant_RendezVous` ="+IDrdv+" ;");
            //st.executeUpdate("UPDATE `rendezvous` SET `Heure_RendezVous` = '"++"' WHERE `identifiant_RendezVous` ="+IDrdv+" ;");

            // DELETE FROM `concerner` WHERE `concerner`.`identifiant_RendezVous` = 14 AND `concerner`.`identifiant_patient` = 1 » ?
            st.executeUpdate("DELETE FROM `concerner` WHERE `concerner`.`identifiant_RendezVous` = " + IDrdv + " ;");
            st.executeUpdate("DELETE FROM `rendezvous` WHERE `identifiant_RendezVous` = " + IDrdv + " ;");

            JOptionPane.showMessageDialog(null, "Suppression RDV Réussi ", "suppression RDV", JOptionPane.WARNING_MESSAGE);

        } catch (SQLException ex) {
            Logger.getLogger(ListeRDVall.class.getName()).log(Level.SEVERE, null, ex);
        }
        afficherList();
    }//GEN-LAST:event_jButtonSupprimerActionPerformed

    private void jButtonModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifierActionPerformed
        int ligne1 = jTableRDV.getSelectedRow();//ligne du patient
        int colonne1 = 5;//colone identifiant
        int IDrdv = (int) jTableRDV.getValueAt(ligne1, colonne1);
        System.out.println("l'identifiant du rdv selectionné est : " + IDrdv);

        //String Date = (String) jTableRDV.getValueAt(ligne1, 2);
        //String Heure = (String) jTableRDV.getValueAt(ligne1, 3);
        DateFormat sdfB = new SimpleDateFormat("yyy-MM-dd");
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyy-MM-dd");
        String Date = sdfB.format(jDateChooser1.getDate());
        System.out.println("la date selectionnée est : " + Date);

        String Heure = (String) jComboBox1.getSelectedItem();
        System.out.println("l'heure selectionnée est : " + Heure);

        //verifier le jour selectionné 
        Date Date2 = null;
        String joursemaine = null;

        try {
            Date2 = sdfB.parse(Date);

        } catch (ParseException ex) {
            Logger.getLogger(ListeRDVall.class.getName()).log(Level.SEVERE, null, ex);
        }

        sdfB = new SimpleDateFormat("EEEE");
        joursemaine = sdfB.format(Date2);

        System.out.println(joursemaine);

        if (joursemaine.equals("dimanche")) {
            JOptionPane.showMessageDialog(null, "Désolé, le dimanche c'est sacré ! ", "Erreur", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // verification de la disponibilité du rdv
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
            Logger.getLogger(ListeRDVall.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ListeRDVall.class.getName()).log(Level.SEVERE, null, ex);
        }
        afficherList();
    }//GEN-LAST:event_jButtonModifierActionPerformed

    public ArrayList<RDVlist> rdvList() {
        ArrayList<RDVlist> rdvList = new ArrayList<>();
        try {

            conn = DriverManager.getConnection(url, login, passwd);
            st = (Statement) conn.createStatement();
            rs = st.executeQuery("SELECT A.nom_patient, A.prenom_patient, c.Date_RendezVous, C.Heure_RendezVous, c.Type_RendezVous, C.identifiant_RendezVous \n"
                    + "from patient A, concerner B, rendezvous C \n"
                    + "WHERE A.identifiant_patient=B.identifiant_patient \n"
                    + "AND B.identifiant_RendezVous=C.identifiant_RendezVous ORDER BY `Date_RendezVous` ASC");
            RDVlist RDVX;

            while (rs.next()) {
                RDVX = new RDVlist(rs.getString("nom_patient"), rs.getString("prenom_patient"), rs.getString("Date_RendezVous"), rs.getString("Heure_RendezVous"), rs.getString("Type_RendezVous"), rs.getInt("identifiant_RendezVous"));
                rdvList.add(RDVX);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ListeRDVall.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rdvList;

    }

    public void afficherList() {
        ArrayList<RDVlist> list = rdvList();
        DefaultTableModel model = (DefaultTableModel) jTableRDV.getModel();
        Object[] row = new Object[6];
        while (model.getRowCount()!=0) model.removeRow(0);
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getNom_patient();
            row[1] = list.get(i).getPrenom_patient();
            row[2] = list.get(i).getDate_RendezVous();
            row[3] = list.get(i).getHeure_RendezVous();
            row[4] = list.get(i).getType_RendezVous();
            row[5] = list.get(i).getIdentifiant_RendezVous();
            model.addRow(row);

        }
    }

    public void creerfichierJour(String Date) throws ClassNotFoundException, IOException, SQLException {
        System.out.println("téléchargement du fichier pour le " + Date);
        try {
            String sql = "SELECT A.nom_patient, A.prenom_patient, c.Date_RendezVous, C.Heure_RendezVous, c.Type_RendezVous \n"
                    + "from patient A, concerner B, rendezvous C \n"
                    + "WHERE A.identifiant_patient=B.identifiant_patient \n"
                    + "AND B.identifiant_RendezVous=C.identifiant_RendezVous "
                    + "AND Date_RendezVous = '" + Date + "'"
                    + "ORDER BY `Date_RendezVous` ASC";

            conn = DriverManager.getConnection(url, login, passwd);
            st = (Statement) conn.createStatement();
            rs = st.executeQuery(sql);
            try {
                FileWriter writer = new FileWriter("PlaningJour" + Date + ".csv", true);
                PrintWriter writer2 = new PrintWriter(new BufferedWriter(new FileWriter("PlaningJour" + Date + ".csv", true)));
                while (rs.next()) {
                    writer.append(rs.getString("nom_patient"));
                    writer.append(";");
                    writer.append(rs.getString("prenom_patient"));
                    writer.append(";");
                    writer.append(rs.getString("Date_RendezVous"));
                    writer.append(";");
                    writer.append(rs.getString("Heure_RendezVous"));
                    writer.append(";");
                    writer.append(rs.getString("Type_RendezVous"));

                    writer.append(System.lineSeparator());
                }
                writer.flush();

            } catch (FileNotFoundException ex) {
                System.err.println("Erreur de fichier non trouver " + ex.getMessage());
            }
        } catch (SQLException ex) {
            System.err.println("Erreur SQL " + ex.getMessage());
        }

    }

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
            java.util.logging.Logger.getLogger(ListeRDVall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListeRDVall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListeRDVall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListeRDVall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ListeRDVall().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager ProjetData30avrilV2PUEntityManager0;
    private javax.swing.JButton jButtonModifier;
    private javax.swing.JButton jButtonSupprimer;
    private javax.swing.JButton jButtonTelechargerJour;
    private com.toedter.calendar.JCalendar jCalendar1;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableRDV;
    private java.util.List<DATA.Rendezvous> rendezvousList;
    private javax.persistence.Query rendezvousQuery;
    // End of variables declaration//GEN-END:variables
}