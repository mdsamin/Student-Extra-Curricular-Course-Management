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
import extracurricularmanagement.model.Appoinment;
import extracurricularmanagement.model.Course;
import extracurricularmanagement.model.EnrolledCourses;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VisitorAppointment extends javax.swing.JFrame {

    /**
     * Creates new form Antenna
     */
    public VisitorAppointment() {
        //TODO: delete
//        GenerateData.generateCourseList();
        initComponents();
        Data.expertiseList.forEach(e -> expertise_jComboBox1.addItem(e));
        Data.coachList.forEach(c -> coachList_jComboBox1.addItem(c));
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        enroll_jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        expertise_header1 = new javax.swing.JLabel();
        expertise_jComboBox1 = new javax.swing.JComboBox<>();
        classDay_jComboBox4 = new javax.swing.JComboBox<>();
        classTime_jComboBox6 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        visitorName_jTextField1 = new javax.swing.JTextField();
        coachList_jComboBox1 = new javax.swing.JComboBox<>();
        week_jComboBox1 = new javax.swing.JComboBox<>();

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
                .addContainerGap(493, Short.MAX_VALUE)
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

        jTable2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "Coach Name", "Course Name", "Day", "Time", "Location", "Vacance"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        enroll_jButton2.setText("Book Appoinment");
        enroll_jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enroll_jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Go Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        expertise_header1.setBackground(new java.awt.Color(0, 102, 102));
        expertise_header1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        expertise_header1.setForeground(new java.awt.Color(255, 255, 255));
        expertise_header1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        expertise_header1.setText("Expertise");

        expertise_jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        expertise_jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All" }));
        expertise_jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expertise_jComboBox1ActionPerformed(evt);
            }
        });

        classDay_jComboBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        classDay_jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));
        classDay_jComboBox4.setAutoscrolls(true);
        classDay_jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classDay_jComboBox4ActionPerformed(evt);
            }
        });

        classTime_jComboBox6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        classTime_jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09:00-09:20", "09:20-09:40", "09:40-10:00", "10:00-10:20", "10:20-10:40", "10:40-11:00", "11:00-11:20", "11:20-11:40", "11:40-12:00", "12:00-12:20", "12:20-12:40", "12:40-13:00", "14:00-14:20", "14:20-14:40", "14:40-15:00", "15:00-15:20", "15:20-15:40", "15:40-16:00", "16:00-16:20", "16:20-16:40", "16:40-17:00" }));
        classTime_jComboBox6.setAutoscrolls(true);
        classTime_jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classTime_jComboBox6ActionPerformed(evt);
            }
        });

        jButton4.setText("Load All course Time");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Visitor Name : ");

        week_jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Week 1", "Week 2", "Week 3", "Week 4" }));
        week_jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                week_jComboBox1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(enroll_jButton2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jLabel1)
                        .add(18, 18, 18)
                        .add(visitorName_jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 432, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(coachList_jComboBox1, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(classDay_jComboBox4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(classTime_jComboBox6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(week_jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(63, 63, 63)
                        .add(jButton3))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jButton4)
                        .add(30, 30, 30)
                        .add(expertise_header1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(expertise_jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 206, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jButton3)
                        .add(jLabel1)
                        .add(visitorName_jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(enroll_jButton2))
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(classTime_jComboBox6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(classDay_jComboBox4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(coachList_jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(week_jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(expertise_jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(expertise_header1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton4))
                .add(0, 20, Short.MAX_VALUE)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 466, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
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

    private void enroll_jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enroll_jButton2ActionPerformed
        // TODO add your handling code here:
        String visitorName = visitorName_jTextField1.getText().toString();
        if (visitorName.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter visitor Name!");
        } else {
            String coachName = coachList_jComboBox1.getSelectedItem().toString();
            String time = classTime_jComboBox6.getSelectedItem().toString();
            String day = classDay_jComboBox4.getSelectedItem().toString();
            String weekNo = week_jComboBox1.getSelectedItem().toString();

            Appoinment appoinment = new Appoinment(coachName, visitorName, time, day, weekNo);

            System.out.println("time.substring(0, 2) : " + time.substring(0, 2));

            //TODO: have to  move them into separate method
            //check coach : coach has course in the same time.
            Optional< Course> coachHasCourseOptional = Data.courseList.stream()
                    .filter(c -> c.getClassDay().equals(day) && c.getClassTime().startsWith(time.substring(0, 2)))
                    .findFirst();

            //check-vistor : same week-date-time
            Optional<Appoinment> appoinmentDuplicate = Data.appoinments.stream()
                    .filter(a -> a.getWeekNumber().equals(weekNo) && a.getDay().equals(day) && a.getTime().equals(time) && a.getVisitorName().equals(visitorName))
                    .findFirst();

            //TODO: have to use one filter chain!
            //check-coach : same week-date-time
            Optional<Appoinment> appoinmentCoachExist = Data.appoinments.stream()
                    .filter(a -> a.getWeekNumber().equals(weekNo) && a.getDay().equals(day) && a.getTime().equals(time) && a.getCoachName().equals(coachName))
                    .findFirst();

            //check-coach : how many appointment one couach has booked
            List<Appoinment> coachAppoinmentsCount = Data.appoinments.stream()
                    .filter(a -> a.getCoachName().equals(coachName) && a.getWeekNumber().equals(weekNo))
                    .collect(Collectors.toList());

            if (coachHasCourseOptional.isPresent()) {
                JOptionPane.showMessageDialog(rootPane, "Sorry, coach has class on the same time!.");
            } else {
                if (appoinmentDuplicate.isPresent() || appoinmentCoachExist.isPresent() || coachAppoinmentsCount.size() >= 3) {
                    if (appoinmentDuplicate.isPresent()) {
                        JOptionPane.showMessageDialog(rootPane, "Sorry, you have already an appointment on the same time!");
                    } else if (appoinmentCoachExist.isPresent()) {
                        JOptionPane.showMessageDialog(rootPane, "Sorry, coach already an appointment on the same day and time.");
                    } else if (coachAppoinmentsCount.size() >= 3) {
                        JOptionPane.showMessageDialog(rootPane, "Coach reached limit per week, please select another week!");
                    }
                } else {
                    Data.appoinments.add(appoinment);
                    //TODO: clean
                    Data.appoinments.forEach(a -> System.out.println(a.toString()));
                    JOptionPane.showMessageDialog(rootPane, "Appoinment confirmed successful!");
                }
            }
        }
    }//GEN-LAST:event_enroll_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void expertise_jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expertise_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String selectedCourse = expertise_jComboBox1.getSelectedItem().toString();
        System.out.println("selectedCourse : " + selectedCourse);
        if (selectedCourse.equals("All")) {
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0);
            showDataToJTable(Data.courseList);
        } else {
            List<Course> searchCourse = Data.courseList.stream()
                    .filter(c -> c.getExpertise().equals(selectedCourse))
                    .collect(Collectors.toList());
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0);
            showDataToJTable(searchCourse);
        }
    }//GEN-LAST:event_expertise_jComboBox1ActionPerformed

    private void classDay_jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classDay_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classDay_jComboBox4ActionPerformed

    private void classTime_jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classTime_jComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classTime_jComboBox6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        showDataToJTable(Data.courseList);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void week_jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_week_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_week_jComboBox1ActionPerformed

    public void showDataToJTable(List<Course> courses) {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        List<Course> list = courses;
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
            java.util.logging.Logger.getLogger(VisitorAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisitorAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisitorAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisitorAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VisitorAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> classDay_jComboBox4;
    private javax.swing.JComboBox<String> classTime_jComboBox6;
    private javax.swing.JComboBox<String> coachList_jComboBox1;
    private javax.swing.JButton enroll_jButton2;
    private javax.swing.JLabel expertise_header1;
    private javax.swing.JComboBox<String> expertise_jComboBox1;
    private javax.swing.JLabel header;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel title;
    private javax.swing.JTextField visitorName_jTextField1;
    private javax.swing.JComboBox<String> week_jComboBox1;
    // End of variables declaration//GEN-END:variables

}
