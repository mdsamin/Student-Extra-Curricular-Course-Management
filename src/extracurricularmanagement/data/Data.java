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
        "100m Race",
        "Abacus",
        "Advance Chess",
        "Badminton",
        "Chess - Introduction",
        "Dancing",
        "Fitness",
        "French – speaking",
        "High Jump",
        "Long jump",
        "Marathon Prep",
        "Musical grammar",
        "Piano",
        "Pre Swiming",
        "Swiming - Match Prep",
        "Swiming - Advance",
        "Swiming",
        "Violin Starter",
        "Violin",
        "Yoga and meditaion"});
    public static List<String> date = Arrays.asList(new String[]{
        "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"
    });
    public static List<String> timeSlot = Arrays.asList(new String[]{
        "10:00-11:00", "11:00-12:00", "12:00-13:00", "14:00-15:00", "15:00-16:00", "16:00-17:00"
    });
    public static List<String> location = Arrays.asList(new String[]{
        "Swiming Pool hall",
        "Swiming Pool 1",
        "Swiming Pool 1",
        "Swiming Pool 2",
        "Art School Hall",
        "Art School Hall",
        "Art School Yard",
        "Art School Hall 2",
        "Football field 1",
        "Football field 2",
        "Football field 1",
        "Football field 2",
        "Art School Hall",
        "Art School Hall",
        "Art School Yard",
        "Art School Yard",
        "Indoor Stadium yard",
        "Indoor Stadium",
        "Math school Yard",
        "Indoor Stadium"});

    public static List<Course> courseList = new ArrayList<>(Arrays.asList(
            new Course("klopp", "1", "Pre Swiming", "Swiming Pool hall", "Monday", "10:00-11:00", 15),
            new Course("klopp", "2", "Swiming", "Swiming Pool 1", "Tuesday", "11:00-12:00", 15),
            new Course("klopp", "3", "Swiming - Advance", "Swiming Pool 1", "Wednesday", "12:00-13:00", 10),
            new Course("klopp", "4", "Swiming - Match Prep", "Swiming Pool 2", "Thursday", "13:00-14:00", 7),
            new Course("jose", "5", "Musical grammar", "Art School Hall", "Friday", "15:00-16:00", 20),
            new Course("jose", "6", "Violin Starter", "Art School Hall", "Monday", "10:00-11:00", 20),
            new Course("jose", "7", "Violin", "Art School Yard", "Tuesday", "11:00-12:00", 20),
            new Course("jose", "8", "Piano", "Art School Hall 2", "Wednesday", "12:00-13:00", 5),
            new Course("pep", "9", "100m Race", "Football field 1", "Thursday", "16:00-17:00", 20),
            new Course("pep", "10", "Long jump", "Football field 2", "Friday", "16:00-17:00", 20),
            new Course("pep", "11", "Marathon Prep", "Football field 1", "Monday", "16:00-17:00", 30),
            new Course("pep", "12", "High Jump", "Football field 2", "Tuesday", "16:00-17:00", 20),
            new Course("brendan", "13", "Yoga and meditaion", "Art School Hall", "Wednesday", "12:00-13:00", 30),
            new Course("brendan", "14", "Dancing", "Art School Hall", "Thursday", "14:00-15:00", 15),
            new Course("brendan", "15", "French - speaking", "Art School Yard", "Friday", "15:00-16:00", 20),
            new Course("brendan", "16", "Chess - Introduction", "Art School Yard", "Monday", "10:00-11:00", 22),
            new Course("ole", "17", "Advance Chess", "Indoor Stadium yard", "Tuesday", "11:00-12:00", 18),
            new Course("ole", "18", "Badminton", "Indoor Stadium", "Wednesday", "12:00-13:00", 10),
            new Course("ole", "19", "Abacus", "Math school Yard", "Thursday", "16:00-17:00", 10),
            new Course("ole", "20", "Fitness", "Indoor Stadium", "Friday", "16:00-17:00", 20)
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
