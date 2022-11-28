/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.managment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Isuranji Thamosha
 */
public final class patient_registration extends javax.swing.JFrame {

    /**
     * Creates new form patient_registration
     * @throws java.sql.SQLException
     */
    public patient_registration() throws SQLException {
        initComponents();
        connect();
            showpatienttabledata();
        
    }
     Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    
    public void connect()
    {
        try {
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysQl://localhost:3306/hospital_managment?useSSL=fales","root","Thamo@9812");
           
           }
        catch(ClassNotFoundException | SQLException ex)
        {
            Logger.getLogger(doctor_registration.class.getName()).log(Level.SEVERE,null,ex);
            
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

        d_id = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jfp_id = new javax.swing.JLabel();
        jfp_appointtime = new javax.swing.JLabel();
        jfp_appointdoctorname = new javax.swing.JLabel();
        jfp_name = new javax.swing.JLabel();
        jfp_nic = new javax.swing.JLabel();
        jfp_address = new javax.swing.JLabel();
        jfp_email = new javax.swing.JLabel();
        jfp_age = new javax.swing.JLabel();
        txtp_id = new javax.swing.JTextField();
        txtp_name = new javax.swing.JTextField();
        txtp_appointeddoctor = new javax.swing.JTextField();
        txtp_nic = new javax.swing.JTextField();
        txtp_address = new javax.swing.JTextField();
        txtp_email = new javax.swing.JTextField();
        txtp_age = new javax.swing.JTextField();
        txtp_appointtime = new javax.swing.JTextField();
        btnp_insert = new javax.swing.JButton();
        btnp_view = new javax.swing.JButton();
        btnp_exite = new javax.swing.JButton();
        jfp_contactno = new javax.swing.JLabel();
        txtp_contactno = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnp_search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        d_id.setBackground(new java.awt.Color(102, 255, 51));

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));
        jPanel2.setForeground(new java.awt.Color(255, 0, 204));

        jLabel9.setFont(new java.awt.Font("Sitka Display", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 204));
        jLabel9.setText("PATIENT   REGISTRATION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(452, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(152, 152, 152))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(21, 21, 21))
        );

        jfp_id.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jfp_id.setText("Appoint No");

        jfp_appointtime.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jfp_appointtime.setText("Appointment Time");

        jfp_appointdoctorname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jfp_appointdoctorname.setText("Appointed doctor name");

        jfp_name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jfp_name.setText("Patient Name");

        jfp_nic.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jfp_nic.setText("NIC");

        jfp_address.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jfp_address.setText("Patient address");

        jfp_email.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jfp_email.setText("Patient E-mail");

        jfp_age.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jfp_age.setText("Patient Age");

        txtp_appointeddoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtp_appointeddoctorActionPerformed(evt);
            }
        });

        txtp_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtp_addressActionPerformed(evt);
            }
        });

        btnp_insert.setBackground(new java.awt.Color(204, 204, 0));
        btnp_insert.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        btnp_insert.setText("INSERT");
        btnp_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnp_insertActionPerformed(evt);
            }
        });

        btnp_view.setBackground(new java.awt.Color(204, 204, 0));
        btnp_view.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        btnp_view.setText("VIEW");
        btnp_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnp_viewActionPerformed(evt);
            }
        });

        btnp_exite.setBackground(new java.awt.Color(204, 204, 0));
        btnp_exite.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        btnp_exite.setText("EXITE");
        btnp_exite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnp_exiteActionPerformed(evt);
            }
        });

        jfp_contactno.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jfp_contactno.setText("Patient Contact No");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Appoint_no", "Appointed_doctor_name", "Patient_name", "NIC", "Patient_address", "Patient_email", "Patient_age", "Appointment time", "Patient_contactNo"
            }
        ));
        jTable1.setName("jtablepatient"); // NOI18N
        jTable1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jTable1MouseDragged(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnp_search.setBackground(new java.awt.Color(204, 204, 0));
        btnp_search.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        btnp_search.setText("SEARCH");
        btnp_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnp_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout d_idLayout = new javax.swing.GroupLayout(d_id);
        d_id.setLayout(d_idLayout);
        d_idLayout.setHorizontalGroup(
            d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(d_idLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jfp_id)
                        .addComponent(jfp_appointdoctorname)
                        .addComponent(jfp_appointtime)
                        .addComponent(jfp_age)
                        .addComponent(jfp_address)
                        .addComponent(jfp_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jfp_nic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jfp_email))
                    .addComponent(jfp_contactno)
                    .addComponent(btnp_insert, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(37, 37, 37)
                .addGroup(d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(d_idLayout.createSequentialGroup()
                        .addComponent(btnp_view, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnp_exite, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnp_search, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(d_idLayout.createSequentialGroup()
                        .addGroup(d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtp_email)
                            .addComponent(txtp_age)
                            .addComponent(txtp_appointtime)
                            .addComponent(txtp_id, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtp_name, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(txtp_appointeddoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtp_nic)
                            .addComponent(txtp_address)
                            .addComponent(txtp_contactno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        d_idLayout.setVerticalGroup(
            d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d_idLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(d_idLayout.createSequentialGroup()
                        .addGap(0, 23, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(d_idLayout.createSequentialGroup()
                        .addGroup(d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jfp_id)
                            .addComponent(txtp_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jfp_appointdoctorname)
                            .addComponent(txtp_appointeddoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jfp_name)
                            .addComponent(txtp_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jfp_nic)
                            .addComponent(txtp_nic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jfp_address)
                            .addComponent(txtp_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jfp_email)
                            .addComponent(txtp_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)))
                .addGroup(d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jfp_age)
                    .addComponent(txtp_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jfp_appointtime)
                    .addComponent(txtp_appointtime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jfp_contactno)
                    .addComponent(txtp_contactno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnp_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnp_view, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnp_exite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnp_search))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(d_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(d_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtp_appointeddoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtp_appointeddoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtp_appointeddoctorActionPerformed

    private void btnp_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnp_insertActionPerformed
         try {                                            
             // TODO add your handling code here:
             try {
                 // TODO add your handling code here:
                 String did=txtp_id.getText();
                 String appointeddoctor=txtp_appointeddoctor.getText();
                 String pname=txtp_name.getText();
                 String pnic=txtp_nic.getText();
                 String paddress=txtp_address.getText();
                 String pemail=txtp_email.getText();
                 String page=txtp_age.getText();
                 String pappointtime=txtp_appointtime.getText();
                 String pcontactno=txtp_contactno.getText();
                 
                 pst=con.prepareStatement("insert into patient_registration(,appoint_no,appointed_doctor_name,patient_name,NIC,patient_address,patient_email,patient_age,appointment_time,patient_contactNo)values(?,?,?,?,?,?,?,?,?)");
                 
                 pst.setString(1, did);
                 pst.setString(2, appointeddoctor);
                 pst.setString(3, pname);
                 pst.setString(4, pnic);
                 pst.setString(5, paddress);
                 pst.setString(6, pemail);
                 pst.setString(7, page);
                 pst.setString(8, pappointtime);
                 pst.setString(9, pcontactno);
                 
                 int d=pst.executeUpdate();
                 
                 if(d==1)
                 {
                     JOptionPane.showMessageDialog(this,"Recorded Added");
                     txtp_id.setText("");
                     txtp_appointeddoctor.setText("");
                     txtp_name.setText("");
                     txtp_nic.setText("");
                     txtp_address.setText("");
                     txtp_email.setText("");
                     txtp_age.setText("");
                     txtp_appointtime.setText("");
                     txtp_contactno.setText("");
                 }
                 else{
                     JOptionPane.showMessageDialog(this,"Record insert failed");
                 }
             } catch (SQLException ex) {
                 Logger.getLogger(doctor_registration.class.getName()).log(Level.SEVERE, null, ex);
             }
             showpatienttabledata();
             
             
         } catch (SQLException ex) {
            Logger.getLogger(patient_registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
    }//GEN-LAST:event_btnp_insertActionPerformed

    public void showpatienttabledata() throws SQLException
    {
        try{
            String sql="select*from patient_registration";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel1(rs));
            }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    private void btnp_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnp_viewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnp_viewActionPerformed

    private void txtp_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtp_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtp_addressActionPerformed

    private void jTable1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseDragged

    private void btnp_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnp_searchActionPerformed
        // TODO add your handling code here:
         String pid;
        pid = txtp_id.getSelectedText();
        try {
            pst=con.prepareStatement("select*from patient_registration where appoint_no=?");
            pst.setString(1, pid);
            rs=pst.executeQuery();
            
            if(rs.next()==true)
            {
                txtp_appointeddoctor.setText(rs.getString(2));
                txtp_name.setText(rs.getString(3));
                txtp_nic.setText(rs.getString(4));
                txtp_address.setText(rs.getString(5));
                txtp_email.setText(rs.getString(6));
                txtp_age.setText(rs.getString(7));
                txtp_appointtime.setText(rs.getString(8));
                txtp_contactno.setText(rs.getString(9));
            }
            
        
        } catch (SQLException ex) {
            Logger.getLogger(doctor_registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnp_searchActionPerformed

    private void btnp_exiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnp_exiteActionPerformed
        // TODO add your handling code here:
        homepage hap=new homepage();
        hap.show();
    }//GEN-LAST:event_btnp_exiteActionPerformed

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
            java.util.logging.Logger.getLogger(patient_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(patient_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(patient_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(patient_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new patient_registration().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(patient_registration.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnp_exite;
    private javax.swing.JButton btnp_insert;
    private javax.swing.JButton btnp_search;
    private javax.swing.JButton btnp_view;
    private javax.swing.JPanel d_id;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jfp_address;
    private javax.swing.JLabel jfp_age;
    private javax.swing.JLabel jfp_appointdoctorname;
    private javax.swing.JLabel jfp_appointtime;
    private javax.swing.JLabel jfp_contactno;
    private javax.swing.JLabel jfp_email;
    private javax.swing.JLabel jfp_id;
    private javax.swing.JLabel jfp_name;
    private javax.swing.JLabel jfp_nic;
    private javax.swing.JTextField txtp_address;
    private javax.swing.JTextField txtp_age;
    private javax.swing.JTextField txtp_appointeddoctor;
    private javax.swing.JTextField txtp_appointtime;
    private javax.swing.JTextField txtp_contactno;
    private javax.swing.JTextField txtp_email;
    private javax.swing.JTextField txtp_id;
    private javax.swing.JTextField txtp_name;
    private javax.swing.JTextField txtp_nic;
    // End of variables declaration//GEN-END:variables
}