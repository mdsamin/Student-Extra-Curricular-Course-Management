/*
 * Copyright (c) 2010, Oracle. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * * Neither the name of Oracle nor the names of its contributors
 *   may be used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */
package extracurricularmanagement;

import extracurricularmanagement.data.Data;
import extracurricularmanagement.model.Student;
import java.util.Optional;
import java.util.Random;
import javax.swing.JOptionPane;

public class StudentCreateAccountLogin extends javax.swing.JFrame {

    /**
     * Creates new form Antenna
     */
    public StudentCreateAccountLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        goBack = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        name = new javax.swing.JLabel();
        logging_here_ = new javax.swing.JLabel();
        loggingID_TextField = new javax.swing.JTextField();
        logging_jButton1 = new javax.swing.JButton();
        logging_label = new javax.swing.JLabel();
        phone_jLabel2 = new javax.swing.JLabel();
        phone_jTextField2 = new javax.swing.JTextField();
        address_jLabel3 = new javax.swing.JLabel();
        address_jTextField3 = new javax.swing.JTextField();
        create_account = new javax.swing.JLabel();
        studentLogging1 = new javax.swing.JLabel();
        nameTextField1 = new javax.swing.JTextField();
        crearteAccount_jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");

        title.setBackground(new java.awt.Color(0, 102, 102));

        header.setBackground(new java.awt.Color(0, 102, 102));
        header.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("Extra curricular course Managment");

        org.jdesktop.layout.GroupLayout titleLayout = new org.jdesktop.layout.GroupLayout(title);
        title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(
            titleLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, titleLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(header)
                .add(459, 459, 459))
        );
        titleLayout.setVerticalGroup(
            titleLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, titleLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(header, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        goBack.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        goBack.setText("Go Back");
        goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Name");

        logging_here_.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        logging_here_.setForeground(new java.awt.Color(255, 255, 255));
        logging_here_.setText("     Login here");

        loggingID_TextField.setBackground(new java.awt.Color(204, 204, 204));
        loggingID_TextField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        loggingID_TextField.setForeground(new java.awt.Color(255, 255, 255));
        loggingID_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loggingID_TextFieldActionPerformed(evt);
            }
        });

        logging_jButton1.setText("Login");
        logging_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logging_jButton1ActionPerformed(evt);
            }
        });

        logging_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        logging_label.setForeground(new java.awt.Color(255, 255, 255));
        logging_label.setText("Login ID");

        phone_jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        phone_jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        phone_jLabel2.setText("Phone");

        phone_jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        phone_jTextField2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        phone_jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        phone_jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone_jTextField2ActionPerformed(evt);
            }
        });

        address_jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        address_jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        address_jLabel3.setText("Address");

        address_jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        address_jTextField3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        address_jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        address_jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_jTextField3ActionPerformed(evt);
            }
        });

        create_account.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        create_account.setForeground(new java.awt.Color(255, 255, 255));
        create_account.setText("Student Logging");

        studentLogging1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        studentLogging1.setForeground(new java.awt.Color(255, 255, 255));
        studentLogging1.setText("Create a new account");

        nameTextField1.setBackground(new java.awt.Color(204, 204, 204));
        nameTextField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nameTextField1.setForeground(new java.awt.Color(255, 255, 255));
        nameTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextField1ActionPerformed(evt);
            }
        });

        crearteAccount_jButton2.setText("  Create Account");
        crearteAccount_jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearteAccount_jButton2ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(71, 71, 71)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(phone_jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 112, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(phone_jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 500, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(name, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 112, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(nameTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 500, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(address_jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 112, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(address_jTextField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 500, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 18, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(crearteAccount_jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 171, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(182, 182, 182)))
                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 53, Short.MAX_VALUE)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                .add(goBack, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 178, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                .add(logging_label, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(29, 29, 29)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(logging_jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 171, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(loggingID_TextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 312, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(92, 92, 92))))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(172, 172, 172)
                        .add(logging_here_, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 181, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE))))
            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel1Layout.createSequentialGroup()
                    .add(22, 22, 22)
                    .add(create_account, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 181, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1121, Short.MAX_VALUE)))
            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel1Layout.createSequentialGroup()
                    .add(309, 309, 309)
                    .add(studentLogging1)
                    .addContainerGap(782, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(141, 141, 141)
                                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 390, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(161, 161, 161)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(name, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(nameTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(phone_jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(phone_jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(address_jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(address_jTextField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(41, 41, 41)
                                .add(crearteAccount_jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 62, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(0, 22, Short.MAX_VALUE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(117, 117, 117)
                        .add(logging_here_)
                        .add(18, 18, 18)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(loggingID_TextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(logging_label))
                        .add(48, 48, 48)
                        .add(logging_jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 62, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(goBack)))
                .addContainerGap())
            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel1Layout.createSequentialGroup()
                    .add(23, 23, 23)
                    .add(create_account)
                    .addContainerGap(514, Short.MAX_VALUE)))
            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel1Layout.createSequentialGroup()
                    .add(114, 114, 114)
                    .add(studentLogging1)
                    .addContainerGap(423, Short.MAX_VALUE)))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(title, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(title, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackActionPerformed
        // TODO add your handling code here:
        LoginPage home = new LoginPage();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goBackActionPerformed

    private void loggingID_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggingID_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loggingID_TextFieldActionPerformed

    private void phone_jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phone_jTextField2ActionPerformed

    private void address_jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_address_jTextField3ActionPerformed

    private void logging_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logging_jButton1ActionPerformed
        // TODO add your handling code here:
        System.out.println("Loggin List Size : " + Data.studentsList.size());
        Data.studentsList.forEach(s -> {
            System.out.println(s.toString());
        });
        if (!loggingID_TextField.getText().toString().isEmpty()) {
            int inputId = Integer.parseInt(loggingID_TextField.getText().toString());
            Optional<Student> student = Data.studentsList.stream().filter(s -> s.getId() == inputId).findAny();
            if (student.isPresent()) {
                Data.currentLoggedStudent = Integer.toString(student.get().getId());
                ViewAllCourses viewAllCourses = new ViewAllCourses();
                viewAllCourses.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Account does not exist! Please create an account First!");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Please enter an ID!");
        }
    }//GEN-LAST:event_logging_jButton1ActionPerformed

    private void nameTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextField1ActionPerformed

    private void crearteAccount_jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearteAccount_jButton2ActionPerformed
        // TODO add your handling code here:
        String name = nameTextField1.getText().toString();
        String phone = phone_jTextField2.getText().toString();
        String address = address_jTextField3.getText().toString();

        if (name.isEmpty() | phone.isEmpty() | address.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please fill All the fields!");
        } else {
            Student student = new Student(new Random().nextInt(1000) + 1, name, phone, address);
            Data.studentsList.add(student);
            JOptionPane.showMessageDialog(rootPane, "Account Created Successfully!"
                    + "\n ID : " + student.getId());
        }
    }//GEN-LAST:event_crearteAccount_jButton2ActionPerformed

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
            javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels = javax.swing.UIManager.getInstalledLookAndFeels();
            for (int idx = 0; idx < installedLookAndFeels.length; idx++) {
                if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentCreateAccountLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentCreateAccountLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentCreateAccountLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentCreateAccountLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentCreateAccountLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address_jLabel3;
    private javax.swing.JTextField address_jTextField3;
    private javax.swing.JButton crearteAccount_jButton2;
    private javax.swing.JLabel create_account;
    private javax.swing.JButton goBack;
    private javax.swing.JLabel header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField loggingID_TextField;
    private javax.swing.JLabel logging_here_;
    private javax.swing.JButton logging_jButton1;
    private javax.swing.JLabel logging_label;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameTextField1;
    private javax.swing.JLabel phone_jLabel2;
    private javax.swing.JTextField phone_jTextField2;
    private javax.swing.JLabel studentLogging1;
    private javax.swing.JPanel title;
    // End of variables declaration//GEN-END:variables

}
