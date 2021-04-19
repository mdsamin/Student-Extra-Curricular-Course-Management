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
import java.util.List;
import java.util.Optional;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FillInformationToAddYourCourse extends javax.swing.JFrame {

    /**
     * Creates new form Antenna
     */
    public FillInformationToAddYourCourse() {
        initComponents();
        Data.expertiseList.forEach(e -> expertise_jComboBox1.addItem(e));
        Data.location.forEach(l -> classLocations_jComboBox2.addItem(l));
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
        header2 = new javax.swing.JLabel();
        goBack = new javax.swing.JButton();
        expertise_header1 = new javax.swing.JLabel();
        expertise_jComboBox1 = new javax.swing.JComboBox<>();
        classLocation_header2 = new javax.swing.JLabel();
        classLocations_jComboBox2 = new javax.swing.JComboBox<>();
        classDay_header3 = new javax.swing.JLabel();
        classDay_jComboBox3 = new javax.swing.JComboBox<>();
        clasDay_expertise_header4 = new javax.swing.JLabel();
        classTime_header5 = new javax.swing.JLabel();
        classTime_jComboBox4 = new javax.swing.JComboBox<>();
        classTime_header6 = new javax.swing.JLabel();
        vacancies_header7 = new javax.swing.JLabel();
        vacancies_jComboBox5 = new javax.swing.JComboBox<>();
        save_button = new javax.swing.JButton();
        goBack1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

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
                .addContainerGap(519, Short.MAX_VALUE)
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

        header2.setBackground(new java.awt.Color(0, 102, 102));
        header2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        header2.setForeground(new java.awt.Color(255, 255, 255));
        header2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header2.setText("Fill information to add your course");
        header2.setAutoscrolls(true);

        goBack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        goBack.setText("Go Back");
        goBack.setAutoscrolls(true);
        goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackActionPerformed(evt);
            }
        });

        expertise_header1.setBackground(new java.awt.Color(0, 102, 102));
        expertise_header1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        expertise_header1.setForeground(new java.awt.Color(255, 255, 255));
        expertise_header1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        expertise_header1.setText("Expertise");
        expertise_header1.setAutoscrolls(true);

        expertise_jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        expertise_jComboBox1.setAutoscrolls(true);
        expertise_jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expertise_jComboBox1ActionPerformed(evt);
            }
        });

        classLocation_header2.setBackground(new java.awt.Color(0, 102, 102));
        classLocation_header2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        classLocation_header2.setForeground(new java.awt.Color(255, 255, 255));
        classLocation_header2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        classLocation_header2.setText("Class Location");
        classLocation_header2.setAutoscrolls(true);

        classLocations_jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        classLocations_jComboBox2.setAutoscrolls(true);
        classLocations_jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classLocations_jComboBox2ActionPerformed(evt);
            }
        });

        classDay_header3.setBackground(new java.awt.Color(0, 102, 102));
        classDay_header3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        classDay_header3.setForeground(new java.awt.Color(255, 255, 255));
        classDay_header3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        classDay_header3.setText("Class Day");
        classDay_header3.setAutoscrolls(true);

        classDay_jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        classDay_jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" }));
        classDay_jComboBox3.setAutoscrolls(true);
        classDay_jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classDay_jComboBox3ActionPerformed(evt);
            }
        });

        clasDay_expertise_header4.setBackground(new java.awt.Color(0, 102, 102));
        clasDay_expertise_header4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clasDay_expertise_header4.setForeground(new java.awt.Color(255, 255, 255));
        clasDay_expertise_header4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clasDay_expertise_header4.setText("(Mon-Fri)");
        clasDay_expertise_header4.setAutoscrolls(true);

        classTime_header5.setBackground(new java.awt.Color(0, 102, 102));
        classTime_header5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        classTime_header5.setForeground(new java.awt.Color(255, 255, 255));
        classTime_header5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        classTime_header5.setText("Class Time");
        classTime_header5.setAutoscrolls(true);

        classTime_jComboBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        classTime_jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10:00-11:00", "11:00-12:00", "12:00-13:00", "14:00-15:00", "15:00-16:00", "16:00-17:00" }));
        classTime_jComboBox4.setAutoscrolls(true);
        classTime_jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classTime_jComboBox4ActionPerformed(evt);
            }
        });

        classTime_header6.setBackground(new java.awt.Color(0, 102, 102));
        classTime_header6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        classTime_header6.setForeground(new java.awt.Color(255, 255, 255));
        classTime_header6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        classTime_header6.setText("(10:00-17:00)");
        classTime_header6.setAutoscrolls(true);

        vacancies_header7.setBackground(new java.awt.Color(0, 102, 102));
        vacancies_header7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        vacancies_header7.setForeground(new java.awt.Color(255, 255, 255));
        vacancies_header7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vacancies_header7.setText("Total Vacancy");
        vacancies_header7.setAutoscrolls(true);

        vacancies_jComboBox5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        vacancies_jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        vacancies_jComboBox5.setAutoscrolls(true);
        vacancies_jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vacancies_jComboBox5ActionPerformed(evt);
            }
        });

        save_button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        save_button.setText("Save");
        save_button.setAutoscrolls(true);
        save_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_buttonActionPerformed(evt);
            }
        });

        goBack1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        goBack1.setText("Show All Course");
        goBack1.setAutoscrolls(true);
        goBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBack1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(header2)
                .add(80, 80, 80))
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                .add(vacancies_header7)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(vacancies_jComboBox5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(0, 0, Short.MAX_VALUE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                .add(classTime_header5)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(classTime_jComboBox4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                .add(classDay_header3)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(classDay_jComboBox3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                .add(expertise_header1)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(expertise_jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                .add(classLocation_header2)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(classLocations_jComboBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                .add(0, 0, Short.MAX_VALUE)
                                .add(save_button, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 237, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(18, 18, 18)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(classTime_header6)
                            .add(clasDay_expertise_header4)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(goBack, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 237, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(goBack1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 237, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(new java.awt.Component[] {classDay_jComboBox3, classLocations_jComboBox2, classTime_jComboBox4, expertise_jComboBox1, vacancies_jComboBox5}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(header2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(expertise_header1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(expertise_jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(8, 8, 8)
                        .add(classLocations_jComboBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(classLocation_header2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(classDay_header3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(classDay_jComboBox3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(clasDay_expertise_header4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(17, 17, 17)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(classTime_jComboBox4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(classTime_header5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(classTime_header6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(vacancies_header7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(vacancies_jComboBox5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(22, 22, 22)
                .add(save_button)
                .add(27, 27, 27)
                .add(goBack)
                .add(29, 29, 29)
                .add(goBack1)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "Coach Name", "Course Name", "Date and Time", "Location", "Vacance"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1094, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 90, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(title, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(title, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jButton1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 579, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackActionPerformed
        // TODO add your handling code here:
        CoachLoggin coachLoggin = new CoachLoggin();
        coachLoggin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goBackActionPerformed

    public void addRowToJTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        List<Course> list = Data.courseList;
        Object rowData[] = new Object[6];
        model.setRowCount(0);
        for (int i = 0; i < list.size(); i++) {
            //courseID
            rowData[0] = list.get(i).getCourseID();
            //coachName
            rowData[1] = list.get(i).getCoachID();
            //course Name
            rowData[2] = list.get(i).getExpertise();
            //date and time
            rowData[3] = list.get(i).getClassDay() + " " + list.get(i).getClassTime();
            //location
            rowData[4] = list.get(i).getClassLocation();
            //location
            rowData[5] = list.get(i).getVacancies();

            model.addRow(rowData);
        }
    }


    private void expertise_jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expertise_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expertise_jComboBox1ActionPerformed

    private void classLocations_jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classLocations_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classLocations_jComboBox2ActionPerformed

    private void classDay_jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classDay_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classDay_jComboBox3ActionPerformed

    private void classTime_jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classTime_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classTime_jComboBox4ActionPerformed

    private void vacancies_jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vacancies_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vacancies_jComboBox5ActionPerformed

    private void save_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_buttonActionPerformed
        // TODO add your handling code here:
        int courseCount = Data.courseList.size() + 1;
        String coachID = Data.currentLoggedCoach;
        String courseID = Integer.toString(courseCount);
        String expertise = expertise_jComboBox1.getSelectedItem().toString();
        String classLocation = classLocations_jComboBox2.getSelectedItem().toString();
        String classDay = classDay_jComboBox3.getSelectedItem().toString();;
        String classTime = classTime_jComboBox4.getSelectedItem().toString();
        String vacancies = vacancies_jComboBox5.getSelectedItem().toString();

        Course course = new Course(coachID, courseID, expertise, classLocation, classDay, classTime, Integer.parseInt(vacancies));

        Optional<Course> courseOptional = Data.courseList.stream()
                .filter(c -> c.getClassDay().equals(classDay) && c.getClassTime().equals(classTime) && c.getClassLocation().equals(classLocation))
                //                .filter(c -> c.getCoachID().equals(Data.currentLoggedCoach) && c.getClassDay().equals(classDay) && c.getClassTime().equals(classTime))
                //                .filter(c -> c.getClassDay().equals(classDay) && c.getClassTime().equals(classTime))
                .findFirst();
        System.out.println("courseOptional : " + courseOptional.toString());
        if (courseOptional.isPresent()) {
            JOptionPane.showMessageDialog(rootPane, "Conflict Course!"
                    + "\nAnother course Same Day and Time!"
                    + "\nChange Either Course, Date or Time");
        } else {
            Data.courseList.add(course);
            Data.courseList.forEach(c -> System.out.println(c.toString()));
            JOptionPane.showMessageDialog(rootPane, "Course Added SccessFully!");
            addRowToJTable();

        }
    }//GEN-LAST:event_save_buttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    boolean dataLoad = true;
    private void goBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBack1ActionPerformed
        // TODO add your handling code here:
        if (dataLoad) {
            addRowToJTable();
            dataLoad = false;
        } else {
            JOptionPane.showMessageDialog(rootPane, "Data Already loaded!");
        }
    }//GEN-LAST:event_goBack1ActionPerformed

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
            java.util.logging.Logger.getLogger(FillInformationToAddYourCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FillInformationToAddYourCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FillInformationToAddYourCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FillInformationToAddYourCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FillInformationToAddYourCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clasDay_expertise_header4;
    private javax.swing.JLabel classDay_header3;
    private javax.swing.JComboBox<String> classDay_jComboBox3;
    private javax.swing.JLabel classLocation_header2;
    private javax.swing.JComboBox<String> classLocations_jComboBox2;
    private javax.swing.JLabel classTime_header5;
    private javax.swing.JLabel classTime_header6;
    private javax.swing.JComboBox<String> classTime_jComboBox4;
    private javax.swing.JLabel expertise_header1;
    private javax.swing.JComboBox<String> expertise_jComboBox1;
    private javax.swing.JButton goBack;
    private javax.swing.JButton goBack1;
    private javax.swing.JLabel header;
    private javax.swing.JLabel header2;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton save_button;
    private javax.swing.JPanel title;
    private javax.swing.JLabel vacancies_header7;
    private javax.swing.JComboBox<String> vacancies_jComboBox5;
    // End of variables declaration//GEN-END:variables

}
