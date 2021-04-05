/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import extracurricularmanagement.data.Data;
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
public class StudentCreation {

    public StudentCreation() {
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
    public void studentCreation() {
        Student s = new Student();
        assertEquals(Data.studentsList.size(), 2);
        Data.studentsList.add(s);
        assertEquals(Data.studentsList.size(), 3);
    }
}
