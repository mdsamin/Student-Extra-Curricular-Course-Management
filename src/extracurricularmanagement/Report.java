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
import extracurricularmanagement.model.Student;
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
        allCourses_jTable1 = new javax.swing.JTable();
        refresh_jButton1 = new javax.swing.JButton();
        visitor_appoinment_jPanel4 = new javax.swing.JPanel();
        loadAppoinments_jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        visitorsReports_jTable2 = new javax.swing.JTable();
        studentReport_jTabbedPane2 = new javax.swing.JTabbedPane();
        enrolledCourses_jPanel2 = new javax.swing.JPanel();
        loadAllEnrolled_students_jButton1 = new javax.swing.JButton();
        enrolledCourses_jScrollPane3 = new javax.swing.JScrollPane();
        enrolledStudent_jTable3 = new javax.swing.JTable();
        cancelledCoures_jPanel1 = new javax.swing.JPanel();
        loadAllCancelled_courses_jButton2 = new javax.swing.JButton();
        cancelledCourses_jScrollPane4 = new javax.swing.JScrollPane();
        cancelledStudent_jTable4 = new javax.swing.JTable();

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

        allCourses_jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        allCourses_jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "Coach Name", "Course Name", "Day", "Time", "Location", "Total Enrolled"
            }
        ));
        jScrollPane1.setViewportView(allCourses_jTable1);
        if (allCourses_jTable1.getColumnModel().getColumnCount() > 0) {
            allCourses_jTable1.getColumnModel().getColumn(2).setHeaderValue("Course Name");
            allCourses_jTable1.getColumnModel().getColumn(3).setHeaderValue("Day");
            allCourses_jTable1.getColumnModel().getColumn(4).setHeaderValue("Time");
            allCourses_jTable1.getColumnModel().getColumn(5).setHeaderValue("Location");
            allCourses_jTable1.getColumnModel().getColumn(6).setHeaderValue("Total Enrolled");
        }

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

        loadAppoinments_jButton1.setText("Load All Appoinments");
        loadAppoinments_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadAppoinments_jButton1ActionPerformed(evt);
            }
        });

        visitorsReports_jTable2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        visitorsReports_jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Visitor Name", "Coach Name", "Day", "Time", "Week"
            }
        ));
        jScrollPane2.setViewportView(visitorsReports_jTable2);

        org.jdesktop.layout.GroupLayout visitor_appoinment_jPanel4Layout = new org.jdesktop.layout.GroupLayout(visitor_appoinment_jPanel4);
        visitor_appoinment_jPanel4.setLayout(visitor_appoinment_jPanel4Layout);
        visitor_appoinment_jPanel4Layout.setHorizontalGroup(
            visitor_appoinment_jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(visitor_appoinment_jPanel4Layout.createSequentialGroup()
                .add(loadAppoinments_jButton1)
                .add(0, 0, Short.MAX_VALUE))
            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1577, Short.MAX_VALUE)
        );
        visitor_appoinment_jPanel4Layout.setVerticalGroup(
            visitor_appoinment_jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(visitor_appoinment_jPanel4Layout.createSequentialGroup()
                .add(loadAppoinments_jButton1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 507, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Visitor Appointment Report", visitor_appoinment_jPanel4);

        loadAllEnrolled_students_jButton1.setText("Load All Enrolled Courses");
        loadAllEnrolled_students_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadAllEnrolled_students_jButton1ActionPerformed(evt);
            }
        });

        enrolledStudent_jTable3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enrolledStudent_jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Course Name", "Coach Name", "Date", "Time", "Location"
            }
        ));
        enrolledCourses_jScrollPane3.setViewportView(enrolledStudent_jTable3);

        org.jdesktop.layout.GroupLayout enrolledCourses_jPanel2Layout = new org.jdesktop.layout.GroupLayout(enrolledCourses_jPanel2);
        enrolledCourses_jPanel2.setLayout(enrolledCourses_jPanel2Layout);
        enrolledCourses_jPanel2Layout.setHorizontalGroup(
            enrolledCourses_jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(enrolledCourses_jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(enrolledCourses_jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(enrolledCourses_jPanel2Layout.createSequentialGroup()
                        .add(loadAllEnrolled_students_jButton1)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(enrolledCourses_jScrollPane3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1560, Short.MAX_VALUE)))
        );
        enrolledCourses_jPanel2Layout.setVerticalGroup(
            enrolledCourses_jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(enrolledCourses_jPanel2Layout.createSequentialGroup()
                .add(loadAllEnrolled_students_jButton1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(enrolledCourses_jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 507, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        studentReport_jTabbedPane2.addTab("Enrolled", enrolledCourses_jPanel2);

        loadAllCancelled_courses_jButton2.setText("Load All Cancelled Courses");
        loadAllCancelled_courses_jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadAllCancelled_courses_jButton2ActionPerformed(evt);
            }
        });

        cancelledStudent_jTable4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cancelledStudent_jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Course Name", "Coach Name", "Date", "Time", "Location"
            }
        ));
        cancelledCourses_jScrollPane4.setViewportView(cancelledStudent_jTable4);

        org.jdesktop.layout.GroupLayout cancelledCoures_jPanel1Layout = new org.jdesktop.layout.GroupLayout(cancelledCoures_jPanel1);
        cancelledCoures_jPanel1.setLayout(cancelledCoures_jPanel1Layout);
        cancelledCoures_jPanel1Layout.setHorizontalGroup(
            cancelledCoures_jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cancelledCoures_jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(cancelledCoures_jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(cancelledCoures_jPanel1Layout.createSequentialGroup()
                        .add(loadAllCancelled_courses_jButton2)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(cancelledCourses_jScrollPane4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1560, Short.MAX_VALUE)))
        );
        cancelledCoures_jPanel1Layout.setVerticalGroup(
            cancelledCoures_jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cancelledCoures_jPanel1Layout.createSequentialGroup()
                .add(loadAllCancelled_courses_jButton2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(cancelledCourses_jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 507, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        studentReport_jTabbedPane2.addTab("Cancelled", cancelledCoures_jPanel1);

        jTabbedPane1.addTab("Student", studentReport_jTabbedPane2);

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
        addAllCoursesRowToJTable();
    }//GEN-LAST:event_refresh_jButton1ActionPerformed

    private void loadAppoinments_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadAppoinments_jButton1ActionPerformed
        // TODO add your handling code here:
        //TODO: clean
        Data.appoinments.forEach(a -> System.out.println(a.toString()));
        DefaultTableModel model = (DefaultTableModel) visitorsReports_jTable2.getModel();
        model.setRowCount(0);
        addAllVisitorsRowToJTable();
    }//GEN-LAST:event_loadAppoinments_jButton1ActionPerformed

    private void loadAllEnrolled_students_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadAllEnrolled_students_jButton1ActionPerformed
        // TODO add your handling code here:
        //TODO: clean
        Data.enrolledCourses.forEach(e -> System.out.println(e.toString()));
        DefaultTableModel model = (DefaultTableModel) enrolledStudent_jTable3.getModel();
        model.setRowCount(0);
        setStudentCoures(Data.enrolledCourses, model);
    }//GEN-LAST:event_loadAllEnrolled_students_jButton1ActionPerformed

    private void loadAllCancelled_courses_jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadAllCancelled_courses_jButton2ActionPerformed
        // TODO add your handling code here:
        Data.cancelledCourses.forEach(e -> System.out.println(e.toString()));
        DefaultTableModel model = (DefaultTableModel) cancelledStudent_jTable4.getModel();
        model.setRowCount(0);
        setStudentCoures(Data.cancelledCourses, model);
    }//GEN-LAST:event_loadAllCancelled_courses_jButton2ActionPerformed

    public void addAllCoursesRowToJTable() {
        DefaultTableModel model = (DefaultTableModel) allCourses_jTable1.getModel();
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

    public void addAllVisitorsRowToJTable() {
        DefaultTableModel model = (DefaultTableModel) visitorsReports_jTable2.getModel();
        List<Appoinment> list = Data.appoinments;
        Object rowData[] = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            //courseID
            rowData[0] = list.get(i).getVisitorName();
            //coachName
            rowData[1] = list.get(i).getCoachName();
            //day
            rowData[2] = list.get(i).getDay();
            //time 
            rowData[3] = list.get(i).getTime();
            //week
            rowData[4] = list.get(i).getWeekNumber();

            model.addRow(rowData);
        }
    }

    public void setStudentCoures(List<EnrolledCourses> listOfCourse, DefaultTableModel model) {
        Object rowData[] = new Object[6];
        for (int i = 0; i < listOfCourse.size(); i++) {

            //student name
            int studentID = Integer.parseInt(listOfCourse.get(i).getStudentID());
            Student student = Data.studentsList.stream().filter(s -> s.getId() == studentID).findFirst().get();
            String studentName = student.getName();
            rowData[0] = studentName;
            //course name
            rowData[1] = listOfCourse.get(i).getCourse().getExpertise();
//            Coach name, 
            rowData[2] = listOfCourse.get(i).getCourse().getCoachID();
//            Date,
            rowData[3] = listOfCourse.get(i).getCourse().getClassDay();
//            Time, 
            rowData[4] = listOfCourse.get(i).getCourse().getClassTime();
//            Location, 
            rowData[5] = listOfCourse.get(i).getCourse().getClassLocation();
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
    private javax.swing.JTable allCourses_jTable1;
    private javax.swing.JPanel all_lesson_jPanel3;
    private javax.swing.JPanel cancelledCoures_jPanel1;
    private javax.swing.JScrollPane cancelledCourses_jScrollPane4;
    private javax.swing.JTable cancelledStudent_jTable4;
    private javax.swing.JPanel enrolledCourses_jPanel2;
    private javax.swing.JScrollPane enrolledCourses_jScrollPane3;
    private javax.swing.JTable enrolledStudent_jTable3;
    private javax.swing.JButton goBack;
    private javax.swing.JLabel header;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton loadAllCancelled_courses_jButton2;
    private javax.swing.JButton loadAllEnrolled_students_jButton1;
    private javax.swing.JButton loadAppoinments_jButton1;
    private javax.swing.JButton refresh_jButton1;
    private javax.swing.JTabbedPane studentReport_jTabbedPane2;
    private javax.swing.JPanel title;
    private javax.swing.JPanel visitor_appoinment_jPanel4;
    private javax.swing.JTable visitorsReports_jTable2;
    // End of variables declaration//GEN-END:variables

}
