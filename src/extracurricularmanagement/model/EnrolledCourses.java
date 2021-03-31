/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extracurricularmanagement.model;

/**
 *
 * @author Dell
 */
public class EnrolledCourses {

    private String studentID;
    private Course course;

    public EnrolledCourses() {
    }

    public EnrolledCourses(String studentID, Course course) {
        this.studentID = studentID;
        this.course = course;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "EnrolledCourses{" + "studentID=" + studentID + ", course=" + course.toString() + '}';
    }

}
