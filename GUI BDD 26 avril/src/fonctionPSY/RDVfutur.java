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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aurel
 */
public class RDVfutur extends javax.swing.JFrame {

    java.sql.Connection conn = null;

    String url = "jdbc:mysql://localhost/ProjetData30avrilV2";
    String login = "root";
    String passwd = "";
    Connection cn = null;
    Statement st = null;
    ResultSet rs = null;

    /**
     * Creates new form RDVfutur
     */
    public RDVfutur() {
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
                    + "AND Date_RendezVous >= '" + Today + "' "
                    + "ORDER BY `Date_RendezVous` ASC ;");
            RDVlist RDVX;

            while (rs.next()) {
                RDVX = new RDVlist(rs.getString("nom_patient"), rs.getString("prenom_patient"), rs.getString("Date_RendezVous"), rs.getString("Heure_RendezVous"), rs.getString("Type_RendezVous"), rs.getInt("identifiant_RendezVous"));
                rdvList.add(RDVX);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RDVfutur.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rdvList;

    }

    public void afficherList() {
        ArrayList<RDVlist> list = rdvList();
        DefaultTableModel model = (DefaultTableModel) jTableRDV.getModel();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableRDV = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(655, 536));
        setMinimumSize(new java.awt.Dimension(655, 536));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setRequestFocusEnabled(false);

        jTableRDV.setFont(new java.awt.Font("Yu Gothic Light", 0, 11)); // NOI18N
        jTableRDV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prenom", "Nom", "Date", "Heure", "Type", "Identifiant"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableRDV.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jTableRDV);

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Prochain Rendez Vous : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(RDVfutur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RDVfutur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RDVfutur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RDVfutur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RDVfutur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableRDV;
    // End of variables declaration//GEN-END:variables
}
