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
import extracurricularmanagement.model.Course;
import extracurricularmanagement.model.Student;
import java.util.Optional;
import javax.swing.JOptionPane;

public class SuccessFullCourseAdd extends javax.swing.JFrame {

    public Course course;

    /**
     * Creates new form Antenna
     */
    public SuccessFullCourseAdd() {
        initComponents();
//        expertise_jComboBox1.set;
    }

    public void setCourse(Course courseArgs) {
        this.course = courseArgs;
        String messageSucess = "The Course has added successfully!";
        String courseName = "Course Name : " + course.getExpertise();
        String classDayTime = "Day and Time : " + course.getClassDay() + "  " + course.getClassTime();
        String location = "Location :  " + course.getClassLocation();
        String vavancy = "Total vacancy : " + course.getVacancies();
        success_jLabel1.setText(messageSucess);
        courseName_jLabel2.setText(courseName);
        dateAndTime_jLabel3.setText(classDayTime);
        location_jLabel4.setText(location);
        vacancy_jLabel5.setText(vavancy);
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
        ok_jButton1 = new javax.swing.JButton();
        success_jLabel1 = new javax.swing.JLabel();
        courseName_jLabel2 = new javax.swing.JLabel();
        dateAndTime_jLabel3 = new javax.swing.JLabel();
        location_jLabel4 = new javax.swing.JLabel();
        vacancy_jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");

        title.setBackground(new java.awt.Color(0, 102, 102));

        header.setBackground(new java.awt.Color(0, 102, 102));
        header.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("Extra Curricular Course Management");

        org.jdesktop.layout.GroupLayout titleLayout = new org.jdesktop.layout.GroupLayout(title);
        title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(
            titleLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, titleLayout.createSequentialGroup()
                .addContainerGap(542, Short.MAX_VALUE)
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

        ok_jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ok_jButton1.setText("OK");
        ok_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_jButton1ActionPerformed(evt);
            }
        });

        success_jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        success_jLabel1.setText("sucess/Fail");

        courseName_jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        courseName_jLabel2.setText("course name");

        dateAndTime_jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dateAndTime_jLabel3.setText("Date and Time");

        location_jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        location_jLabel4.setText("location");

        vacancy_jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        vacancy_jLabel5.setText("location");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(goBack, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 178, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(courseName_jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 505, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, dateAndTime_jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 500, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, location_jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 505, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(success_jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 505, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, vacancy_jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 505, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(466, 466, 466))))
            .add(jPanel1Layout.createSequentialGroup()
                .add(479, 479, 479)
                .add(ok_jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 275, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(new java.awt.Component[] {dateAndTime_jLabel3, location_jLabel4}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .add(55, 55, 55)
                .add(success_jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(courseName_jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(dateAndTime_jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(location_jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(vacancy_jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(37, 37, 37)
                .add(ok_jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 128, Short.MAX_VALUE)
                .add(goBack)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(title, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(12, 12, 12))
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        CoachLoggin coachLoggin = new CoachLoggin();
        coachLoggin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goBackActionPerformed

    private void ok_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_jButton1ActionPerformed
        // TODO add your handling code here:
        FillInformationToAddYourCourse addYourCourse = new FillInformationToAddYourCourse();
        addYourCourse.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ok_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SuccessFullCourseAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuccessFullCourseAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuccessFullCourseAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuccessFullCourseAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new SuccessFullCourseAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel courseName_jLabel2;
    private javax.swing.JLabel dateAndTime_jLabel3;
    private javax.swing.JButton goBack;
    private javax.swing.JLabel header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel location_jLabel4;
    private javax.swing.JButton ok_jButton1;
    private javax.swing.JLabel success_jLabel1;
    private javax.swing.JPanel title;
    private javax.swing.JLabel vacancy_jLabel5;
    // End of variables declaration//GEN-END:variables

}
