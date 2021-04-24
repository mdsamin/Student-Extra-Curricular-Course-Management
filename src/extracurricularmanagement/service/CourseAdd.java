/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extracurricularmanagement.service;

import extracurricularmanagement.data.Data;
import extracurricularmanagement.model.Course;
import extracurricularmanagement.model.CheckCourseValidityResponse;
import java.util.Optional;

/**
 *
 * @author Dell
 */
public class CourseAdd {

    public CheckCourseValidityResponse checkCourse(Course courseToAdd) {
        CheckCourseValidityResponse addResponse = new CheckCourseValidityResponse(true, "");

        System.out.println("courseToAdd  :" + courseToAdd.toString());

        Optional<Course> sameCoahSameDayTime = Data.courseList.stream()
                .filter(c -> c.getClassDay().equals(courseToAdd.getClassDay())
                && c.getClassTime().equals(courseToAdd.getClassTime())
                && c.getCoachID().equals(Data.currentLoggedCoach))
                .findFirst();

        Optional<Course> sameLocation = Data.courseList.stream()
                .filter(c -> c.getClassDay().equals(courseToAdd.getClassDay())
                && c.getClassTime().equals(courseToAdd.getClassTime())
                && c.getClassLocation().equals(courseToAdd.getClassLocation()))
                .findFirst();

        if (sameCoahSameDayTime.isPresent()) {
            addResponse.setCourseValid(false);
            addResponse.setMessage("\"Conflict Course!\n"
                    + "\nCoach has Another course Same Day and Time!\n"
                    + "\n\nChange Either Course, Date or Time\"");
            return addResponse;
        }
        if (sameLocation.isPresent()) {
            addResponse.setCourseValid(false);
            addResponse.setMessage("\"Conflict Location!\n"
                    + "\nAnother Course Same Day and Time in Same Location!\n"
                    + "\n\nChange Date or Time or Location!\"");
            return addResponse;
        }

        return addResponse;
    }

}
