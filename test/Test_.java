/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import extracurricularmanagement.data.Data;
import extracurricularmanagement.model.CheckCourseValidityResponse;
import extracurricularmanagement.model.Course;
import extracurricularmanagement.model.EnrolledCourses;
import extracurricularmanagement.model.Student;
import extracurricularmanagement.service.CourseAdd;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class Test_ {

    public Test_() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void courseCreation() {
        Course c = new Course();
        int totalCourse = Data.courseList.size();
        Data.courseList.add(c);
        assertEquals(Data.courseList.size(), totalCourse + 1);
    }

    @Test
    public void courseCreationFail_DateTimeConflict() {
//        Course c = new Course("klopp", "1", "Pre Swiming", "Swiming Pool hall", "Monday", "10:00-11:00", 15);
        Course c = Data.courseList.get(0);
        CourseAdd courseAdd = new CourseAdd();
        CheckCourseValidityResponse validityResponse = courseAdd.checkCourse(c);
        assertEquals(false, validityResponse.isCourseValid());
    }

    @Test
    public void courseCreationFail_DateTimeNoConflict() {
        Course c = new Course("jose", "1", "Pre Swiming", "Swiming Pool hall", "Wednesday", "10:00-11:00", 15);
        CourseAdd courseAdd = new CourseAdd();
        CheckCourseValidityResponse validityResponse = courseAdd.checkCourse(c);
        assertEquals(true, validityResponse.isCourseValid());
    }

    @Test
    public void courseCreationFail_LocationConflict() {
//        Course cNew = new Course("pep", "3", "Swiming - Advance", "Swiming Pool 1", "Wednesday", "12:00-13:00", 10);//2
        Course cNew = new Course("klopp", "3", "Swiming - Advance", "Swiming Pool 1", "Wednesday", "12:00-13:00", 10);

        //coach name  = klopp
        Course c2 = Data.courseList.get(2);

        CourseAdd courseAdd = new CourseAdd();
        CheckCourseValidityResponse validityResponse = courseAdd.checkCourse(cNew);
        assertEquals(false, validityResponse.isCourseValid());
    }

    @Test
    public void courseEnroll() {
        EnrolledCourses enrolledCourses = new EnrolledCourses();
        int totalEnrollCourse = Data.enrolledCourses.size();
        Data.enrolledCourses.add(enrolledCourses);
        assertEquals(Data.enrolledCourses.size(), totalEnrollCourse + 1);
    }

    @Test
    public void studentCreation() {
        Student s = new Student();
        assertEquals(Data.studentsList.size(), 15);
        Data.studentsList.add(s);
        assertEquals(Data.studentsList.size(), 16);
    }
}
