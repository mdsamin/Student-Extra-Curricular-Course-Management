/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extracurricularmanagement.model;

import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class Course {

    private String coachID;
    private String courseID;
    private String expertise;
    private String classLocation;
    private String classDay;
    private String classTime;
    private int vacancies;
    private int enrolled;

    public Course() {
    }

    public Course(String coachID, String courseID, String expertise, String classLocation, String classDay, String classTime, int vacancies) {
        this.coachID = coachID;
        this.courseID = courseID;
        this.expertise = expertise;
        this.classLocation = classLocation;
        this.classDay = classDay;
        this.classTime = classTime;
        this.vacancies = vacancies;
    }

    public String getCoachID() {
        return coachID;
    }

    public void setCoachID(String coachID) {
        this.coachID = coachID;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public String getClassLocation() {
        return classLocation;
    }

    public void setClassLocation(String classLocation) {
        this.classLocation = classLocation;
    }

    public String getClassDay() {
        return classDay;
    }

    public void setClassDay(String classDay) {
        this.classDay = classDay;
    }

    public String getClassTime() {
        return classTime;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    public int getVacancies() {
        return vacancies;
    }

    public void setVacancies(int vacancies) {
        this.vacancies = vacancies;
    }

    public int getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(int enrolled) {
        this.enrolled = enrolled;
    }

    @Override
    public String toString() {
        return "Course{" + "coachID=" + coachID + ", courseID=" + courseID + ", expertise=" + expertise + ", classLocation=" + classLocation + ", classDay=" + classDay + ", classTime=" + classTime + ", vacancies=" + vacancies + ", enrolled=" + enrolled + '}';
    }

    public void print() {
        System.out.println(toString());
    }

}
