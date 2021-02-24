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
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aurel
 */
public class AjouterRendezvous extends javax.swing.JFrame {

    /**
     * Creates new form AjouterRendezvous
     */
    public AjouterRendezvous() {

        initComponents();
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
        patientQuery1 = java.beans.Beans.isDesignTime() ? null : ProjetData30avrilV2PUEntityManager.createQuery("SELECT p FROM Patient p");
        patientList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : patientQuery1.getResultList();
        concernerQuery = java.beans.Beans.isDesignTime() ? null : ProjetData30avrilV2PUEntityManager.createQuery("SELECT c FROM Concerner c");
        concernerList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : concernerQuery.getResultList();
        patientQuery2 = java.beans.Beans.isDesignTime() ? null : ProjetData30avrilV2PUEntityManager.createQuery("SELECT p FROM Patient p");
        patientList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : patientQuery2.getResultList();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel3 = new javax.swing.JPanel();
        jButtonValider = new javax.swing.JButton();
        jButtonTerminer = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePatientList1 = new javax.swing.JTable();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePatientList2 = new javax.swing.JTable();
        jCheckBox2 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePatientList3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1200, 1000));
        setPreferredSize(new java.awt.Dimension(1200, 1000));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButtonValider.setBackground(new java.awt.Color(102, 255, 102));
        jButtonValider.setFont(new java.awt.Font("Yu Gothic Medium", 3, 36)); // NOI18N
        jButtonValider.setText("Valider");
        jButtonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValiderActionPerformed(evt);
            }
        });

        jButtonTerminer.setBackground(new java.awt.Color(255, 102, 102));
        jButtonTerminer.setFont(new java.awt.Font("Yu Gothic Medium", 3, 36)); // NOI18N
        jButtonTerminer.setText("Terminer");
        jButtonTerminer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTerminerActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel2.setText("Date :");

        jLabel3.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel3.setText("Horaire : ");

        jComboBox1.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00:00", "08:30:00", "09:00:00", "09:30:00", "10:00:00", "10:30:00", "11:00:00", "11:30:00", "12:00:00", "12:30:00", "13:00:00", "13:30:00", "14:00:00", "14:30:00", "15:00:00", "15:30:00", "16:00:00", "16:30:00", "17:00:00", "17:30:00", "18:00:00", "18:30:00", "19:00:00", "19:30:00", "20:00:00" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jCalendar1.setFocusable(false);
        jCalendar1.setFont(new java.awt.Font("Yu Gothic Light", 0, 11)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jCalendar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1)
                            .addComponent(jLabel3))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 2, 14)); // NOI18N
        jLabel4.setText("Veuillez selectionner la ligne du patient choisit : ");

        jTablePatientList1.setFont(new java.awt.Font("Yu Gothic Light", 0, 11)); // NOI18N

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, patientList1, jTablePatientList1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${identifiantPatient}"));
        columnBinding.setColumnName("Identifiant Patient");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nomPatient}"));
        columnBinding.setColumnName("Nom Patient");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${prenomPatient}"));
        columnBinding.setColumnName("Prenom Patient");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(jTablePatientList1);

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 11)); // NOI18N
        jCheckBox1.setText("Ajouter un deuxieme patient");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jTablePatientList2.setFont(new java.awt.Font("Yu Gothic Light", 0, 11)); // NOI18N

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, patientList2, jTablePatientList2);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${identifiantPatient}"));
        columnBinding.setColumnName("Identifiant Patient");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nomPatient}"));
        columnBinding.setColumnName("Nom Patient");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${prenomPatient}"));
        columnBinding.setColumnName("Prenom Patient");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane3.setViewportView(jTablePatientList2);

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Ajouter un troisieme patient");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, patientList2, jTablePatientList3);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${identifiantPatient}"));
        columnBinding.setColumnName("Identifiant Patient");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nomPatient}"));
        columnBinding.setColumnName("Nom Patient");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${prenomPatient}"));
        columnBinding.setColumnName("Prenom Patient");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane1.setViewportView(jTablePatientList3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ajouter un rendez vous ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButtonValider, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addComponent(jButtonTerminer, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonTerminer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonValider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderActionPerformed

        //recuperation du id patient selctionné
        int ligne1 = jTablePatientList1.getSelectedRow();//ligne du patient
        int colonne1 = 0;//colone identifiant
        int IDpatient1 = (int) jTablePatientList1.getValueAt(ligne1, colonne1);
        System.out.println("l'identifiant selectionné est : " + IDpatient1);

        //recuperation de la date
        DateFormat sdfB = new SimpleDateFormat("yyy-MM-dd");

        //DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyy-MM-dd");
        String Date = sdfB.format(jCalendar1.getDate());
        System.out.println("la date selectionnée est : " + Date);

//verifier le jour selectionné 
        Date Date2 = null;
        String joursemaine = null;

        try {
            Date2 = sdfB.parse(Date);

        } catch (ParseException ex) {
            Logger.getLogger(AjouterRendezvous.class.getName()).log(Level.SEVERE, null, ex);
        }

        sdfB = new SimpleDateFormat("EEEE");
        joursemaine = sdfB.format(Date2);

        System.out.println(joursemaine);

        if (joursemaine.equals("dimanche")) {
            JOptionPane.showMessageDialog(null, "Désolé, le dimanche c'est sacré ! ", "Erreur", JOptionPane.ERROR_MESSAGE);
            return;
        }

///// verification disponibilité rdv
        String Heure = (String) jComboBox1.getSelectedItem();
        System.out.println("l'heure selectionnée est : " + Heure);

        // verifier si la date est pas deja prise 
        java.sql.Connection conn = null;

        String url = "jdbc:mysql://localhost/ProjetData30avrilV2";
        String login = "root";
        String passwd = "";
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;

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
            Logger.getLogger(AjouterRendezvous.class.getName()).log(Level.SEVERE, null, ex);
        }

        //choix du type
        String Type;
        if ((jCheckBox1.isSelected()) && (jCheckBox2.isSelected())) {
            Type = "Triple";
        } else if ((jCheckBox1.isSelected())) {
            Type = "Double";
        } else {
            Type = "Individuel";
        }

        //ajout du rendez vous
        ajouterRDV(Date, Heure, Type);

        //recuperation du numero appliqué 
        int IDrdv = recupIDrdv();

        //ajout du lien FPK du 1er patient
        ajouterConcerner(IDrdv, IDpatient1);

        //rendez vous double
        if (jCheckBox1.isSelected()) {
            int ligne2 = jTablePatientList2.getSelectedRow();//ligne du patient 2
            int colonne2 = 0;//colone identifiant 2

            int IDpatient2 = (int) jTablePatientList2.getValueAt(ligne2, colonne2);
            System.out.println("l'identifiant selectionné est : " + IDpatient2);

            //ajout du lien FPK du 2eme petient
            ajouterConcerner(IDrdv, IDpatient2);
        }

        // rendez vous triple
        if (jCheckBox2.isSelected()) {
            int ligne3 = jTablePatientList3.getSelectedRow();//ligne du patient 2
            int colonne3 = 0;//colone identifiant 2

            int IDpatient3 = (int) jTablePatientList3.getValueAt(ligne3, colonne3);
            System.out.println("l'identifiant selectionné est : " + IDpatient3);

            //ajout du lien FPK du 2eme petient
            ajouterConcerner(IDrdv, IDpatient3);
        }
    }//GEN-LAST:event_jButtonValiderActionPerformed

    void ajouterRDV(String Date, String Heure, String Type) {
        java.sql.Connection conn = null;

        String url = "jdbc:mysql://localhost/ProjetData30avrilV2";
        String login = "root";
        String passwd = "";
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(url, login, passwd);
            st = (Statement) conn.createStatement();
            //INSERT INTO `rendezvous` (`identifiant_RendezVous`, `Date_RendezVous`, `Heure_RendezVous`, `Type_RendezVous`, `identifiant_Consultation`) VALUES (NULL, '2020-05-20', '15:00:00', 'Individuel', NULL);
            st.executeUpdate("INSERT INTO `rendezvous` (`identifiant_RendezVous`, `Date_RendezVous`, `Heure_RendezVous`, `Type_RendezVous`, `identifiant_Consultation`) VALUES (NULL, '" + Date + "' , '" + Heure + "' , '" + Type + "' , NULL);");

            JOptionPane.showMessageDialog(null, "Creation RDV Réussi ", "Ajout RDV", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            Logger.getLogger(AjouterRendezvous.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    int recupIDrdv() {
        java.sql.Connection conn = null;
        String url = "jdbc:mysql://localhost/ProjetData30avrilV2";
        String login = "root";
        String passwd = "";
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;

        int identifiantTrouve = 999;

        try {

            conn = DriverManager.getConnection(url, login, passwd);
            st = (Statement) conn.createStatement();
            rs = st.executeQuery("SELECT * FROM `rendezvous`  \n"
                    + "ORDER BY `rendezvous`.`identifiant_RendezVous`  ASC");

            while (rs.next()) {
                //on descend a la derniere ligne ajouté
                identifiantTrouve = rs.getInt("identifiant_RendezVous");
            }

        } catch (SQLException ex) {
            Logger.getLogger(AjouterRendezvous.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("l'identifiant du rdv crée est " + identifiantTrouve);
        return identifiantTrouve;
    }

    void ajouterConcerner(int identifiantrdv, int identifiantpatient) {
        java.sql.Connection conn = null;

        String url = "jdbc:mysql://localhost/ProjetData30avrilV2";
        String login = "root";
        String passwd = "";
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(url, login, passwd);
            st = (Statement) conn.createStatement();
            //INSERT INTO `concerner` (`identifiant_RendezVous`, `identifiant_patient`) VALUES ('5', '6');
            st.executeUpdate("INSERT INTO `concerner` (`identifiant_RendezVous`, `identifiant_patient`) VALUES ('" + identifiantrdv + "', '" + identifiantpatient + "');");

            JOptionPane.showMessageDialog(null, "Creation lien RDV-Patient Réussi ", "Ajout lien", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            Logger.getLogger(AjouterRendezvous.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButtonTerminerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTerminerActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonTerminerActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(AjouterRendezvous.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjouterRendezvous.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjouterRendezvous.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjouterRendezvous.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjouterRendezvous().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager ProjetData30avrilV2PUEntityManager;
    private java.util.List<DATA.Concerner> concernerList;
    private javax.persistence.Query concernerQuery;
    private javax.swing.JButton jButtonTerminer;
    private javax.swing.JButton jButtonValider;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTablePatientList1;
    private javax.swing.JTable jTablePatientList2;
    private javax.swing.JTable jTablePatientList3;
    private java.util.List<DATA.Patient> patientList;
    private java.util.List<DATA.Patient> patientList1;
    private java.util.List<DATA.Patient> patientList2;
    private javax.persistence.Query patientQuery;
    private javax.persistence.Query patientQuery1;
    private javax.persistence.Query patientQuery2;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}