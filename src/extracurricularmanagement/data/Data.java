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

/**
 *
 * @author Dell
 */
public class Data {

    public static int courseCount = 0;
    public static String currentLoggedCoach = "";
    public static List<Course> courseList = new ArrayList<>();
    public static List<Student> studentsList = new ArrayList<>();
    public static List<String> coachList = Arrays.asList(new String[]{
        "123","456","789"
    });
    public static List<String> expertiseList = Arrays.asList(new String[]{
        "Swiming", "Music", "Dancing", "Chess", "Gymnastics"
    });
}
