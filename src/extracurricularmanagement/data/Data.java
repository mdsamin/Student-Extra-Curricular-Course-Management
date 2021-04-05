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
import extracurricularmanagement.model.EnrolledCourses;

/**
 *
 * @author Dell
 */
public class Data {

    public static int courseCount = 1;
    public static String currentLoggedCoach = "";
    public static String currentLoggedStudent = "";
    public static List<String> coachList = Arrays.asList(new String[]{
        "Klopp", "Jose", "Pep", "Brendan", "Ole"
    });
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
        return 1 + new Random().nextInt(20);
    }

}
