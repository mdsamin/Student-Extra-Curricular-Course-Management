/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extracurricularmanagement.data;

import extracurricularmanagement.model.Course;
import extracurricularmanagement.model.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import extracurricularmanagement.model.Appoinment;
import extracurricularmanagement.model.Coach;
import extracurricularmanagement.model.EnrolledCourses;

/**
 *
 * @author Dell
 */
public class Data {

    public static int courseCount = 1;
    public static String currentLoggedCoach = "";
    public static String currentLoggedStudent = "";

    public static List<Coach> coachListObject = Arrays.asList(new Coach[]{
        new Coach("Klopp Kevin", "Klopp", "South beach road, Californina, CA 1215", "012345678"),
        new Coach("Jose Anderson", "Jose", "15 Down Town, Los Angalose, LA 125", "02123456"),
        new Coach("Pep Maven", "Pep", "15 Town Road, Virgenia, V 125", "03123456"),
        new Coach("Brendan Torrent", "Brendan", "15 Town Hall, Alaska, Alaska 25", "05123456"),
        new Coach("Ole Sabbir", "Ole", "15 Town Hall, Alaska, Alaska 25", "05789456")
//        0. "Klopp", 1. "Jose", 2."Pep", 3."Brendan", 4."Ole"
    });

    public static List<String> coachList = Arrays.asList(new String[]{
        coachListObject.get(0).getId(),//Klopp
        coachListObject.get(1).getId(),//Jose
        coachListObject.get(2).getId(),//Pep
        coachListObject.get(3).getId(),//Brendan
        coachListObject.get(4).getId()});//oles
    public static List<String> expertiseList = Arrays.asList(new String[]{
        "Swiming", "Music", "Dancing", "Chess", "Gymnastics"
    });
    public static List<String> date = Arrays.asList(new String[]{
        "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
    });
    public static List<String> timeSlot = Arrays.asList(new String[]{
        "10:00-11:00", "11:00-12:00", "12:00-13:00", "14:00-15:00", "15:00-16:00", "16:00-17:00", "10:00-11:00"
    });
    public static List<String> location = Arrays.asList(new String[]{
        "Swiming Pool 1", "Swiming Pool 2", "Art School Yeard", "Art SChool Hall", "Art School Hall 2", "Math school Yeard", "Gym 1", "Gym 2"
    });
    public static List<Course> courseList = new ArrayList<>(Arrays.asList(
            new Course(Data.coachList.get(0),
                    Integer.toString(courseCount++),
                    Data.expertiseList.get(0),
                    Data.location.get(0), Data.date.get(0), Data.timeSlot.get(0),
                    getVacancy()),
            new Course(Data.coachList.get(0),
                    Integer.toString(courseCount++),
                    Data.expertiseList.get(0),
                    Data.location.get(0), Data.date.get(1), Data.timeSlot.get(0),
                    getVacancy()),
            new Course(Data.coachList.get(1),
                    Integer.toString(courseCount++),
                    Data.expertiseList.get(1),
                    Data.location.get(4), Data.date.get(0), Data.timeSlot.get(1),
                    getVacancy()),
            new Course(Data.coachList.get(1),
                    Integer.toString(courseCount++),
                    Data.expertiseList.get(1),
                    Data.location.get(5), Data.date.get(0), Data.timeSlot.get(2),
                    getVacancy()),
            new Course(Data.coachList.get(2),
                    Integer.toString(courseCount++),
                    Data.expertiseList.get(2),
                    Data.location.get(2), Data.date.get(2), Data.timeSlot.get(0),
                    getVacancy()),
            new Course(Data.coachList.get(2),
                    Integer.toString(courseCount++),
                    Data.expertiseList.get(2),
                    Data.location.get(3), Data.date.get(3), Data.timeSlot.get(0),
                    getVacancy())
    ));
    public static List<Appoinment> appoinments = new ArrayList<>();
    public static List<EnrolledCourses> enrolledCourses = new ArrayList<>();
    public static List<Student> studentsList = new ArrayList<>(Arrays.asList(
            new Student(1, "A", "015", "XX"),
            new Student(2, "B", "016", "YY")
    ));

    public static int getVacancy() {
        return 20;
    }

}
