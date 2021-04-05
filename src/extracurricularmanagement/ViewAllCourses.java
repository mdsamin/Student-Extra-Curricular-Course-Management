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
import extracurricularmanagement.model.EnrolledCourses;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewAllCourses extends javax.swing.JFrame {

    boolean firstTime = true;

    /**
     * Creates new form Antenna
     */
    public ViewAllCourses() {
        //TODO: delete
        System.out.println("CurrentLy Logged user : " + Data.currentLoggedStudent.toString());

        initComponents();
        Data.expertiseList.forEach(e -> expertise_jComboBox1.addItem(e));
        showAllCoursesToJTable(Data.courseList);
    }

    public void showAllCoursesToJTable(List<Course> courses) {
        DefaultTableModel model = (DefaultTableModel) allCourses_jTable1.getModel();
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

    public void showMyCoursesToJTable(List<Course> courses) {
        DefaultTableModel model = (DefaultTableModel) myCourses_jTable2.getModel();
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
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        title = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        allCourses_jTable1 = new javax.swing.JTable();
        enroll_jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        expertise_header1 = new javax.swing.JLabel();
        expertise_jComboBox1 = new javax.swing.JComboBox<>();
        classDay_jComboBox3 = new javax.swing.JComboBox<>();
        classTime_jComboBox5 = new javax.swing.JComboBox<>();
        loadCourses_jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        myCourses_jTable2 = new javax.swing.JTable();
        locadCourses_jButton4 = new javax.swing.JButton();
        cancel_jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");

        title.setBackground(new java.awt.Color(0, 102, 102));

        header.setBackground(new java.awt.Color(0, 102, 102));
        header.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("Extra curricular course Managment");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout titleLayout = new org.jdesktop.layout.GroupLayout(title);
        title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(
            titleLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(titleLayout.createSequentialGroup()
                .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 90, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(345, 345, 345)
                .add(header)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titleLayout.setVerticalGroup(
            titleLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, titleLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(titleLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jButton3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, header, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        allCourses_jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        allCourses_jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "Coach Name", "Course Name", "Day", "Time", "Location", "Vacance"
            }
        ));
        jScrollPane1.setViewportView(allCourses_jTable1);
        if (allCourses_jTable1.getColumnModel().getColumnCount() > 0) {
            allCourses_jTable1.getColumnModel().getColumn(6).setHeaderValue("Vacance");
        }

        enroll_jButton1.setText("Enroll");
        enroll_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enroll_jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Go Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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

        classDay_jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        classDay_jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));
        classDay_jComboBox3.setAutoscrolls(true);
        classDay_jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classDay_jComboBox3ActionPerformed(evt);
            }
        });

        classTime_jComboBox5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        classTime_jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "10:00-11:00", "11:00-12:00", "12:00-13:00", "14:00-15:00", "15:00-16:00", "16:00-17:00", "10:00-11:00" }));
        classTime_jComboBox5.setAutoscrolls(true);
        classTime_jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classTime_jComboBox5ActionPerformed(evt);
            }
        });

        loadCourses_jButton4.setText("Load Courses");
        loadCourses_jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadCourses_jButton4ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(enroll_jButton1)
                .add(126, 126, 126)
                .add(expertise_header1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(expertise_jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 206, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(classDay_jComboBox3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(classTime_jComboBox5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(79, 79, 79)
                .add(loadCourses_jButton4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 257, Short.MAX_VALUE)
                .add(jButton2)
                .addContainerGap())
            .add(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jButton2)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(classDay_jComboBox3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(classTime_jComboBox5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(loadCourses_jButton4))
                    .add(expertise_jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(expertise_header1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(enroll_jButton1)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 593, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Enroll Courses", jPanel1);

        myCourses_jTable2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        myCourses_jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "Coach Name", "Course Name", "Day", "Time", "Location"
            }
        ));
        jScrollPane2.setViewportView(myCourses_jTable2);

        locadCourses_jButton4.setText("Load My Courses");
        locadCourses_jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locadCourses_jButton4ActionPerformed(evt);
            }
        });

        cancel_jButton5.setText("Cancel");
        cancel_jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_jButton5ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1295, Short.MAX_VALUE)
            .add(jPanel2Layout.createSequentialGroup()
                .add(locadCourses_jButton4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(cancel_jButton5)
                .add(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(locadCourses_jButton4)
                    .add(cancel_jButton5))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 587, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(27, 27, 27))
        );

        jTabbedPane1.addTab("My Courses", jPanel2);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(title, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(title, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enroll_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enroll_jButton1ActionPerformed
        // TODO add your handling code here:

        Course course = getSelectedCourse();

        Optional<EnrolledCourses> enrollCourseOptional = Data.enrolledCourses.stream()
                .filter(
                        ec -> ec.getCourse().getClassDay().equals(course.getClassDay())
                        && ec.getCourse().getClassTime().equals(course.getClassTime())
                        && ec.getStudentID().equals(Data.currentLoggedStudent)
                )
                .findFirst();
        System.out.println("enrollCourseOptional : " + enrollCourseOptional.toString());
        if (enrollCourseOptional.isPresent()) {
            JOptionPane.showMessageDialog(rootPane, "Sorry, you have another class at the same time!");
        } else {
            System.out.println("course :" + course.toString());
            EnrolledCourses enrolledCourse = new EnrolledCourses(Data.currentLoggedStudent, course);
            Data.enrolledCourses.add(enrolledCourse);
            Data.enrolledCourses.forEach(ec -> System.out.println(ec.toString()));
            JOptionPane.showMessageDialog(rootPane, "Course Add successful!");
        }
    }//GEN-LAST:event_enroll_jButton1ActionPerformed

    public Course getSelectedCourse() {
        int selectedRowIndex = allCourses_jTable1.getSelectedRow();

        DefaultTableModel model = (DefaultTableModel) allCourses_jTable1.getModel();
        // courseID
        String courseID = model.getValueAt(selectedRowIndex, 0).toString();
        //coachName
        String coachID = model.getValueAt(selectedRowIndex, 1).toString();
        //courseName
        String courseName = model.getValueAt(selectedRowIndex, 2).toString();
        //day 
        String day = model.getValueAt(selectedRowIndex, 3).toString();
        //time
        String time = model.getValueAt(selectedRowIndex, 4).toString();
        //location
        String location = model.getValueAt(selectedRowIndex, 5).toString();
        //vacances
        String vacances = model.getValueAt(selectedRowIndex, 6).toString();

        Course course = new Course(coachID, courseID, courseName, location, day, time, Integer.parseInt(vacances));
        return course;
    }

    public Course getSelectedMyCourse() {
        int selectedRowIndex = myCourses_jTable2.getSelectedRow();

        DefaultTableModel model = (DefaultTableModel) myCourses_jTable2.getModel();
        // courseID
        String courseID = model.getValueAt(selectedRowIndex, 0).toString();
        //coachName
        String coachID = model.getValueAt(selectedRowIndex, 1).toString();
        //courseName
        String courseName = model.getValueAt(selectedRowIndex, 2).toString();
        //day 
        String day = model.getValueAt(selectedRowIndex, 3).toString();
        //time
        String time = model.getValueAt(selectedRowIndex, 4).toString();
        //location
        String location = model.getValueAt(selectedRowIndex, 5).toString();
        //vacances
//        String vacances = model.getValueAt(selectedRowIndex, 6).toString();

        Course course = new Course(coachID, courseID, courseName, location, day, time, 0);
        return course;
    }


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        StudentCreateAccountLogin studentCreateAccountLogin = new StudentCreateAccountLogin();
        studentCreateAccountLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void expertise_jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expertise_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String selectedCourse = expertise_jComboBox1.getSelectedItem().toString();
        System.out.println("selectedCourse : " + selectedCourse);
        if (selectedCourse.equals("All")) {
            DefaultTableModel model = (DefaultTableModel) allCourses_jTable1.getModel();
            model.setRowCount(0);
            showAllCoursesToJTable(Data.courseList);
        } else {
            List<Course> searchCourse = Data.courseList.stream()
                    .filter(c -> c.getExpertise().equals(selectedCourse))
                    .collect(Collectors.toList());

            DefaultTableModel model = (DefaultTableModel) allCourses_jTable1.getModel();
            model.setRowCount(0);
            System.out.println("Making Table Void!");
            showAllCoursesToJTable(searchCourse);
        }
    }//GEN-LAST:event_expertise_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    String myCourseToShow = "";
    private void classDay_jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classDay_jComboBox3ActionPerformed
        // TODO add your handling code here:
        String classDay = classDay_jComboBox3.getSelectedItem().toString();
        System.out.println(" classDay : " + classDay);
        if (classDay.equals("All")) {
            DefaultTableModel model = (DefaultTableModel) allCourses_jTable1.getModel();
            model.setRowCount(0);
            showAllCoursesToJTable(Data.courseList);
        } else {
            List<Course> searchCourse = Data.courseList.stream()
                    .filter(c -> c.getClassDay().equals(classDay))
                    .collect(Collectors.toList());

            DefaultTableModel model = (DefaultTableModel) allCourses_jTable1.getModel();
            model.setRowCount(0);
            showAllCoursesToJTable(searchCourse);
        }
    }//GEN-LAST:event_classDay_jComboBox3ActionPerformed

    private void classTime_jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classTime_jComboBox5ActionPerformed
        // TODO add your handling code here:
        String classTime = classTime_jComboBox5.getSelectedItem().toString();
        System.out.println(" classDay : " + classTime);
        if (classTime.equals("All")) {
            DefaultTableModel model = (DefaultTableModel) allCourses_jTable1.getModel();
            model.setRowCount(0);
            showAllCoursesToJTable(Data.courseList);
        } else {
            List<Course> searchCourse = Data.courseList.stream()
                    .filter(c -> c.getClassTime().equals(classTime))
                    .collect(Collectors.toList());

            DefaultTableModel model = (DefaultTableModel) allCourses_jTable1.getModel();
            model.setRowCount(0);
            showAllCoursesToJTable(searchCourse);
        }
    }//GEN-LAST:event_classTime_jComboBox5ActionPerformed

    private void loadCourses_jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadCourses_jButton4ActionPerformed
        // TODO add your handling code here:
        showAllCoursesToJTable(Data.courseList);
    }//GEN-LAST:event_loadCourses_jButton4ActionPerformed

    //my courses
    private void locadCourses_jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locadCourses_jButton4ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) myCourses_jTable2.getModel();
        model.setRowCount(0);
        List<EnrolledCourses> myCourses = Data.enrolledCourses.stream()
                .filter(ec -> ec.getStudentID().equals(Data.currentLoggedStudent))
                .collect(Collectors.toList());
        List<Course> myCoursesList = new ArrayList<>();
        myCourses.forEach(ec -> {
            myCoursesList.add(ec.getCourse());
        });
        showMyCoursesToJTable(myCoursesList);
    }//GEN-LAST:event_locadCourses_jButton4ActionPerformed

    private void cancel_jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_jButton5ActionPerformed
        // TODO add your handling code here:
        Course course = getSelectedMyCourse();

        Optional<EnrolledCourses> enrollCourseOptional = Data.enrolledCourses.stream()
                .filter(
                        ec -> ec.getStudentID().equals(Data.currentLoggedStudent)
                        && ec.getCourse().getCourseID().equals(course.getCourseID())
                )
                .findFirst();

        if (enrollCourseOptional.isPresent()) {
            Data.enrolledCourses.remove(enrollCourseOptional.get());
            locadCourses_jButton4ActionPerformed(evt);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error in cenceling Course!");
        }
    }//GEN-LAST:event_cancel_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewAllCourses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAllCourses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAllCourses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAllCourses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ViewAllCourses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable allCourses_jTable1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancel_jButton5;
    private javax.swing.JComboBox<String> classDay_jComboBox3;
    private javax.swing.JComboBox<String> classTime_jComboBox5;
    private javax.swing.JButton enroll_jButton1;
    private javax.swing.JLabel expertise_header1;
    private javax.swing.JComboBox<String> expertise_jComboBox1;
    private javax.swing.JLabel header;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton loadCourses_jButton4;
    private javax.swing.JButton locadCourses_jButton4;
    private javax.swing.JTable myCourses_jTable2;
    private javax.swing.JPanel title;
    // End of variables declaration//GEN-END:variables

}
