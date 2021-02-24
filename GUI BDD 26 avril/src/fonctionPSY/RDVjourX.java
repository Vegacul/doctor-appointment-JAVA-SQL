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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aurel
 */
public class RDVjourX extends javax.swing.JFrame {

    java.sql.Connection conn = null;

    String url = "jdbc:mysql://localhost/ProjetData30avrilV2";
    String login = "root";
    String passwd = "";
    Connection cn = null;
    Statement st = null;
    ResultSet rs = null;

    /**
     * Creates new form RDVjourX
     */
    public RDVjourX() {
        initComponents();
        afficherList();
    }

    public ArrayList<RDVlist> rdvList() {
        ArrayList<RDVlist> rdvList = new ArrayList<>();
        try {
            //recuperation de la date du jour 
            LocalDate Today = (LocalDate.now());
            System.out.println(Today);

            conn = DriverManager.getConnection(url, login, passwd);
            st = (Statement) conn.createStatement();
            rs = st.executeQuery("SELECT A.nom_patient, A.prenom_patient, c.Date_RendezVous, C.Heure_RendezVous, c.Type_RendezVous, C.identifiant_RendezVous \n"
                    + "from patient A, concerner B, rendezvous C \n"
                    + "WHERE A.identifiant_patient=B.identifiant_patient \n"
                    + "AND B.identifiant_RendezVous=C.identifiant_RendezVous "
                    + "AND Date_RendezVous = '" + Today + "' "
                    + "ORDER BY `Date_RendezVous` ASC ;");
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
        while (model.getRowCount()!=0) model.removeRow(0);
        Object[] row = new Object[6];
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

    
       public ArrayList<RDVlist> rdvList2(String Jour) {
        ArrayList<RDVlist> rdvList = new ArrayList<>();
        try {
            conn = DriverManager.getConnection(url, login, passwd);
            st = (Statement) conn.createStatement();
            rs = st.executeQuery("SELECT A.nom_patient, A.prenom_patient, c.Date_RendezVous, C.Heure_RendezVous, c.Type_RendezVous, C.identifiant_RendezVous \n"
                    + "from patient A, concerner B, rendezvous C \n"
                    + "WHERE A.identifiant_patient=B.identifiant_patient \n"
                    + "AND B.identifiant_RendezVous=C.identifiant_RendezVous "
                    + "AND Date_RendezVous = '" + Jour + "' "
                    + "ORDER BY `Date_RendezVous` ASC ;");
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

    public void afficherList2(String Jour) {
        ArrayList<RDVlist> list = rdvList2(Jour);
        DefaultTableModel model = (DefaultTableModel) jTableRDV.getModel();
        while (model.getRowCount()!=0) model.removeRow(0);
        Object[] row = new Object[6];
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRDV = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setMaximumSize(new java.awt.Dimension(950, 500));
        setMinimumSize(new java.awt.Dimension(950, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(950, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(950, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 500));

        jTableRDV.setFont(new java.awt.Font("Yu Gothic Light", 0, 11)); // NOI18N
        jTableRDV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nom", "Prenom", "Date", "Heure", "Type", "Identifiant "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableRDV);

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        jLabel1.setText("Rendez vous du Jour :");

        jLabel2.setFont(new java.awt.Font("Yu Gothic Light", 0, 11)); // NOI18N
        jLabel2.setText("Choisir une autre date : ");

        jButton1.setFont(new java.awt.Font("Yu Gothic Light", 0, 11)); // NOI18N
        jButton1.setText("Rafraichir");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DateFormat sdfB = new SimpleDateFormat("yyy-MM-dd");
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyy-MM-dd");
        String Jour = sdfB.format(jDateChooser1.getDate());
        System.out.println("la date selectionnée est : " + Jour);
        afficherList2(Jour);
  
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RDVjourX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RDVjourX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RDVjourX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RDVjourX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RDVjourX().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRDV;
    // End of variables declaration//GEN-END:variables
}
