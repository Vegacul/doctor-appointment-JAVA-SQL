/*
 * Groupe 4 
 * ANTHEA LATRUBESSE 
 * AURELIEN KOHL
 *  
 */
package fonctionPSY;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aurel
 */
public class ListeConsultationX extends javax.swing.JFrame {
    
    int IDPatient;

    java.sql.Connection conn = null;

    String url = "jdbc:mysql://localhost/ProjetData30avrilV2";
    String login = "root";
    String passwd = "";
    Connection cn = null;
    Statement st = null;
    ResultSet rs = null;

    /**
     * Creates new form ListeConsultationX
     */
    public ListeConsultationX() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        ProjetData30avrilV2PUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ProjetData30avrilV2PU").createEntityManager();
        patientQuery = java.beans.Beans.isDesignTime() ? null : ProjetData30avrilV2PUEntityManager.createQuery("SELECT p FROM Patient p");
        patientList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : patientQuery.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePatient = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableConsult = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTablePatient.setFont(new java.awt.Font("Yu Gothic Light", 0, 11)); // NOI18N

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, patientList, jTablePatient);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${identifiantPatient}"));
        columnBinding.setColumnName("Identifiant Patient");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nomPatient}"));
        columnBinding.setColumnName("Nom Patient");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${prenomPatient}"));
        columnBinding.setColumnName("Prenom Patient");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${loginPatient}"));
        columnBinding.setColumnName("Login Patient");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTablePatient);

        jTableConsult.setFont(new java.awt.Font("Yu Gothic Light", 0, 11)); // NOI18N
        jTableConsult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Patient", "Nom", "Prenom", "ID RDV", "Type ", "Date", "Heure", "Durée", "ID Consult", "Notes", "Anxiété", "Prix", "Paiement"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableConsult);

        jButton1.setBackground(new java.awt.Color(153, 255, 204));
        jButton1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jButton1.setText("Afficher les rendez vous du patient selectionné");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Voir les consultation d'un patient : ");

        jLabel2.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        jLabel2.setText("Choisissez un patient en cliquant sur sa ligne : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1067, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        jTableConsult.removeAll();
        int ligne1 = jTablePatient.getSelectedRow();//ligne du patient
        int colonne1 = 0;//colone identifiant
        int IDpatient = (int) jTablePatient.getValueAt(ligne1, colonne1);
        System.out.println("l'identifiant du patient selectionné est : " + IDpatient);
        this.IDPatient = IDpatient;
        afficherList();
    }//GEN-LAST:event_jButton1ActionPerformed

    public ArrayList<ConsultList> CONSULTlist() {
        ArrayList<ConsultList> CONSULTlist = new ArrayList<>();
        try {

            conn = DriverManager.getConnection(url, login, passwd);
            st = (Statement) conn.createStatement();
            rs = st.executeQuery("SELECT  A.identifiant_patient, A.nom_patient, A.prenom_patient, C.identifiant_RendezVous, C.Type_RendezVous, D.Date_Consultation, D.Heure_Consultation, D.Duree_Consultation, D.identifiant_Consultation, D.Notes_Consultation, D.Anxiete_Consultation, D.Prix_Consultation, D.Paiement_Consultation\n"
                    + "FROM patient A, concerner B, rendezvous C, consultation D\n"
                    + "WHERE A.identifiant_patient=B.identifiant_patient\n"
                    + "AND B.identifiant_RendezVous=C.identifiant_RendezVous\n"
                    + "AND C.identifiant_consultation = D.identifiant_consultation\n"
                    + "AND A.identifiant_patient="+IDPatient+";");


            ConsultList CONSULTLIST;  //CONSULTLIST

            while (rs.next()) {
                CONSULTLIST = new ConsultList(rs.getInt("Identifiant_patient"), rs.getInt("Identifiant_RendezVous"), rs.getInt("Identifiant_Consultation"), rs.getString("Nom_patient"), rs.getString("Prenom_patient"), rs.getString("Type_RendezVous"), rs.getString("Date_Consultation"), rs.getString("Heure_Consultation"), rs.getString("Duree_Consultation"), rs.getString("Notes_Consultation"), rs.getString("Anxiete_Consultation"), rs.getString("Prix_Consultation"), rs.getString("Paiement_Consultation"));
                CONSULTlist.add(CONSULTLIST);

            }

        } catch (SQLException ex) {
            Logger.getLogger(ListeConsultationX.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CONSULTlist;

    }

    public void afficherList() {
        ArrayList<ConsultList> list = CONSULTlist();
        DefaultTableModel model = (DefaultTableModel) jTableConsult.getModel();
        Object[] row = new Object[13];
        while (model.getRowCount()!=0) model.removeRow(0);
        for (int i = 0; i < list.size(); i++) {

            row[0] = list.get(i).getIdentifiant_patient(); //rs.getInt("Identifiant_patient")
            row[1] = list.get(i).getNom_patient(); //rs.getString("Nom_patient")
            row[2] = list.get(i).getPrenom_patient(); //rs.getString("Prenom_patient")
            row[3] = list.get(i).getIdentifiant_RendezVous(); //rs.getInt("Identifiant_RendezVous")
            row[4] = list.get(i).getType_RendezVous(); //rs.getString("Type_RendezVous")
            row[5] = list.get(i).getDate_Consultation(); //rs.getString("Date_Consultation")
            row[6] = list.get(i).getHeure_Consultation(); //rs.getString("Heure_Consultation"), rs.getString("Duree_Consultation"), rs.getInt("Identifiant_Consultation"), rs.getString("Notes_Consultation"),rs.getString("Anxiete_Consultation"),rs.getString("Prix_Consultation"),rs.getString("Paiement_Consultation")
            row[7] = list.get(i).getDuree_Consultation();
            row[8] = list.get(i).getIdentifiant_Consultation(); //rs.getInt("Identifiant_Consultation")
            row[9] = list.get(i).getNotes_Consultation(); //rs.getString("Notes_Consultation")
            row[10] = list.get(i).getAnxiete_Consultation(); //rs.getString("Anxiete_Consultation")
            row[11] = list.get(i).getPrix_Consultation(); //rs.getString("Prix_Consultation")
            row[12] = list.get(i).getPaiement_Consultation(); //rs.getString("Paiement_Consultation")

            model.addRow(row);

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
            java.util.logging.Logger.getLogger(ListeConsultationX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListeConsultationX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListeConsultationX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListeConsultationX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListeConsultationX().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager ProjetData30avrilV2PUEntityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableConsult;
    private javax.swing.JTable jTablePatient;
    private java.util.List<DATA.Patient> patientList;
    private javax.persistence.Query patientQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
