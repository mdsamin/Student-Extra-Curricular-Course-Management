/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extracurricularmanagement.data;

import static extracurricularmanagement.data.Data.courseCount;
import extracurricularmanagement.model.Course;
import extracurricularmanagement.model.EnrolledCourses;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Dell
 */
public class GenerateData {

    public static void generateCourseList() {
        List<Course> courses = Arrays.asList(new Course[]{
            new Course(Data.coachList.get(0),
            Integer.toString(courseCount++),
            Data.expertiseList.get(0),
            Data.location.get(0), Data.date.get(0), Data.timeSlot.get(0),
            getVacance()),
            new Course(Data.coachList.get(0),
            Integer.toString(courseCount++),
            Data.expertiseList.get(0),
            Data.location.get(0), Data.date.get(1), Data.timeSlot.get(0),
            getVacance()),
            new Course(Data.coachList.get(1),
            Integer.toString(courseCount++),
            Data.expertiseList.get(1),
            Data.location.get(4), Data.date.get(0), Data.timeSlot.get(1),
            getVacance()),
            new Course(Data.coachList.get(1),
            Integer.toString(courseCount++),
            Data.expertiseList.get(1),
            Data.location.get(5), Data.date.get(0), Data.timeSlot.get(2),
            getVacance()),
            new Course(Data.coachList.get(2),
            Integer.toString(courseCount++),
            Data.expertiseList.get(2),
            Data.location.get(2), Data.date.get(2), Data.timeSlot.get(0),
            getVacance()),
            new Course(Data.coachList.get(2),
            Integer.toString(courseCount++),
            Data.expertiseList.get(2),
            Data.location.get(3), Data.date.get(3), Data.timeSlot.get(0),
            getVacance())
        });

        courses.forEach(c -> Data.courseList.add(c));
    }

    public static int getVacance() {
        return 1 + new Random().nextInt(20);
    }

    public static void generateEnrollCourse() {
        List<EnrolledCourses> courses = Arrays.asList(new EnrolledCourses[]{
            new EnrolledCourses("1", Data.courseList.get(0)),
            new EnrolledCourses("1", Data.courseList.get(1)),
            new EnrolledCourses("2", Data.courseList.get(2)),
            new EnrolledCourses("2", Data.courseList.get(3))
        });
    }
}
