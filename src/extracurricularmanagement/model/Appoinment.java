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
public class Appoinment {

    private String coachName;
    private String visitorName;
    private String time;
    private String day;
    private String weekNumber;

    public Appoinment() {
    }

    public Appoinment(String coachName, String visitorName, String time, String day, String weekNo) {
        this.coachName = coachName;
        this.visitorName = visitorName;
        this.time = time;
        this.day = day;
        this.weekNumber = weekNo;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(String weekNumber) {
        this.weekNumber = weekNumber;
    }

    @Override
    public String toString() {
        return "Appoinment{" + "coachName=" + coachName + ", visitorName=" + visitorName + ", time=" + time + ", day=" + day + ", weekNumber=" + weekNumber + '}';
    }

}
