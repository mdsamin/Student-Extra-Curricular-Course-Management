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
import extracurricularmanagement.data.GenerateData;
import extracurricularmanagement.model.Course;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Report extends javax.swing.JFrame {

    /**
     * Creates new form Antenna
     */
    public Report() {
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
        goBack = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        all_lesson_jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        refresh_jButton1 = new javax.swing.JButton();
        visitor_appoinment_jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        student_report_jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");

        title.setBackground(new java.awt.Color(0, 102, 102));

        header.setBackground(new java.awt.Color(0, 102, 102));
        header.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("Extra curricular course Managment");

        goBack.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        goBack.setText("Go Back");
        goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout titleLayout = new org.jdesktop.layout.GroupLayout(title);
        title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(
            titleLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, titleLayout.createSequentialGroup()
                .addContainerGap()
                .add(goBack, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 178, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(header)
                .add(459, 459, 459))
        );
        titleLayout.setVerticalGroup(
            titleLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, titleLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(titleLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(header, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(goBack))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("All Lesson Report");

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "Coach Name", "Course Name", "Day", "Time", "Location", "Total Enrolled"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        refresh_jButton1.setText("Refresh");
        refresh_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout all_lesson_jPanel3Layout = new org.jdesktop.layout.GroupLayout(all_lesson_jPanel3);
        all_lesson_jPanel3.setLayout(all_lesson_jPanel3Layout);
        all_lesson_jPanel3Layout.setHorizontalGroup(
            all_lesson_jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(all_lesson_jPanel3Layout.createSequentialGroup()
                .add(jLabel2)
                .add(18, 18, 18)
                .add(refresh_jButton1)
                .add(0, 0, Short.MAX_VALUE))
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1577, Short.MAX_VALUE)
        );
        all_lesson_jPanel3Layout.setVerticalGroup(
            all_lesson_jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(all_lesson_jPanel3Layout.createSequentialGroup()
                .add(all_lesson_jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(refresh_jButton1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 507, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("All Lesson Report", all_lesson_jPanel3);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Visitor Appointment Report");

        org.jdesktop.layout.GroupLayout visitor_appoinment_jPanel4Layout = new org.jdesktop.layout.GroupLayout(visitor_appoinment_jPanel4);
        visitor_appoinment_jPanel4.setLayout(visitor_appoinment_jPanel4Layout);
        visitor_appoinment_jPanel4Layout.setHorizontalGroup(
            visitor_appoinment_jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(visitor_appoinment_jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addContainerGap(1351, Short.MAX_VALUE))
        );
        visitor_appoinment_jPanel4Layout.setVerticalGroup(
            visitor_appoinment_jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(visitor_appoinment_jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addContainerGap(503, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Visitor Appointment Report", visitor_appoinment_jPanel4);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Student Report");

        org.jdesktop.layout.GroupLayout student_report_jPanel2Layout = new org.jdesktop.layout.GroupLayout(student_report_jPanel2);
        student_report_jPanel2.setLayout(student_report_jPanel2Layout);
        student_report_jPanel2Layout.setHorizontalGroup(
            student_report_jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(student_report_jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel3)
                .addContainerGap(1446, Short.MAX_VALUE))
        );
        student_report_jPanel2Layout.setVerticalGroup(
            student_report_jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(student_report_jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel3)
                .addContainerGap(503, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Student Report", student_report_jPanel2);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(title, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(12, 12, 12))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(jTabbedPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1582, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(title, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jTabbedPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 568, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackActionPerformed
        // TODO add your handling code here:
        LoginPage home = new LoginPage();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goBackActionPerformed

    private void refresh_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_jButton1ActionPerformed
        // TODO add your handling code here:
//        GenerateData.generateCourseList();
        GenerateData.generateCourseList();
        addRowToJTable();
    }//GEN-LAST:event_refresh_jButton1ActionPerformed

    public void addRowToJTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        List<Course> list = Data.courseList;
        Object rowData[] = new Object[7];
        for (int i = 0; i < list.size(); i++) {
            //courseID
            rowData[0] = list.get(i).getCourseID();
            //coachName
            rowData[1] = list.get(i).getCoachID();
            //course Name
            rowData[2] = list.get(i).getExpertise();
            //day 
            rowData[3] = list.get(i).getClassDay();
            //time
            rowData[4] = list.get(i).getClassTime();
            //location
            rowData[5] = list.get(i).getClassLocation();
            //vacances
            rowData[6] = list.get(i).getVacancies();

            model.addRow(rowData);
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
            javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels = javax.swing.UIManager.getInstalledLookAndFeels();
            for (int idx = 0; idx < installedLookAndFeels.length; idx++) {
                if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel all_lesson_jPanel3;
    private javax.swing.JButton goBack;
    private javax.swing.JLabel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton refresh_jButton1;
    private javax.swing.JPanel student_report_jPanel2;
    private javax.swing.JPanel title;
    private javax.swing.JPanel visitor_appoinment_jPanel4;
    // End of variables declaration//GEN-END:variables

}
