/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import extracurricularmanagement.data.Data;
import extracurricularmanagement.model.Course;
import extracurricularmanagement.model.Student;
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
public class CourseCreation {

    public CourseCreation() {
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
}
