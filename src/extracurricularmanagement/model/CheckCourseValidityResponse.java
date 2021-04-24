/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extracurricularmanagement.model;

/**
 *
 * @author Dell
 */
public class CheckCourseValidityResponse {

    private boolean courseValid;
    private String message;

    public CheckCourseValidityResponse() {
    }

    public CheckCourseValidityResponse(boolean courseAdd, String messString) {
        this.courseValid = courseAdd;
        this.message = messString;
    }

    public boolean isCourseValid() {
        return courseValid;
    }

    public void setCourseValid(boolean courseAdd) {
        this.courseValid = courseAdd;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "CourseAddResponse{" + "course valid=" + courseValid + ", message=" + message + '}';
    }

}
