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
    public static int studentCount = 1;
    public static String currentLoggedCoach = "";
    public static String currentLoggedStudent = "";

    public static List<Coach> coachListObject = Arrays.asList(new Coach[]{
        new Coach("Klopp Kevin", "klopp", "South beach road, Californina, CA 1215", "012345678"),
        new Coach("Jose Anderson", "jose", "15 Down Town, Los Angalose, LA 125", "02123456"),
        new Coach("Pep Maven", "pep", "15 Town Road, Virgenia, V 125", "03123456"),
        new Coach("Brendan Torrent", "brendan", "15 Town Hall, Alaska, Alaska 25", "05123456"),
        new Coach("Ole Sabbir", "ole", "15 Town Hall, Alaska, Alaska 25", "05789456")
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
        "Swiming Pool 1",
        "Swiming Pool 2",
        "Art School Yeard",
        "Art SChool Hall",
        "Art School Hall 2",
        "Math school Yeard",
        "Gym 1",
        "Gym 2"
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
    public static List<EnrolledCourses> cancelledCourses = new ArrayList<>();
    public static List<Student> studentsList = new ArrayList<>(Arrays.asList(
            new Student(101, "James", "61 Prince Drive. Macomb, MI 48042", "1-234-567-8911"),
            new Student(102, "John", "50 Acacia Street. Elk Grove Village, IL 60007", "1-234-567-8912"),
            new Student(103, "Robert", "920 West Helen Drive. Summerfield, FL 34491", "1-234-567-8913"),
            new Student(104, "Christopher", "276 W. Lake Forest St. Burbank, IL 60459", "1-234-567-8914"),
            new Student(105, "Daniel", "341 Vermont St. Henderson, KY 42420", "1-234-567-8915"),
            new Student(106, "Paul", "544 James Rd. Grand Haven, MI 49417", "1-234-567-8916"),
            new Student(107, "Ronald", "20 Prince Drive. Macomb, MI 48042", "1-234-567-8917"),
            new Student(108, "Anthony", "13 Acacia Street. Elk Grove Village, IL 60007", "1-234-567-8918"),
            new Student(109, "Kevin", "92 West Helen Drive. Summerfield, FL 34491", "1-234-567-8919"),
            new Student(110, "Mary", "26 W. Lake Forest St. Burbank, IL 60459", "1-234-567-8920"),
            new Student(111, "Patricia", "34 Vermont St. Henderson, KY 42420", "1-234-567-8921"),
            new Student(112, "Lisa", "54 James Rd. Grand Haven, MI 49417", "1-234-567-8922"),
            new Student(113, "Nancy", "6 Prince Drive. Macomb, MI 48042", "1-234-567-8923"),
            new Student(114, "Michelle", "5 Acacia Street. Elk Grove Village, IL 60007", "1-234-567-8924"),
            new Student(115, "Laura", "92 West Helen Drive. Summerfield, FL 34491", "1-234-567-8925")
    ));

    public static int getVacancy() {
        return 20;
    }

}
