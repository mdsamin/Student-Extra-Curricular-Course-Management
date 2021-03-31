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
import static extracurricularmanagement.data.GenerateData.generateCourseList;

/**
 *
 * @author Dell
 */
public class Data {
    
    public static int courseCount = 1;
    public static String currentLoggedCoach = "";
    public static List<Course> courseList = new ArrayList<>();
    public static List<Student> studentsList = Arrays.asList(new Student[]{
        new Student(1, "A", "015", "XX")
    });
    public static List<String> coachList = Arrays.asList(new String[]{
        "Kevin Oens", "Ellen", "Pitbull", "david beckham"
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

}
