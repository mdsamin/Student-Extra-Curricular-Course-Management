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

    private boolean courseAdd;
    private String message;

    public CheckCourseValidityResponse() {
    }

    public CheckCourseValidityResponse(boolean courseAdd, String messString) {
        this.courseAdd = courseAdd;
        this.message = messString;
    }

    public boolean isCourseAdd() {
        return courseAdd;
    }

    public void setCourseAdd(boolean courseAdd) {
        this.courseAdd = courseAdd;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "CourseAddResponse{" + "courseAdd=" + courseAdd + ", message=" + message + '}';
    }
    
}
