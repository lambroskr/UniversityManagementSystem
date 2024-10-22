package org.kryonas;

import java.util.List;

public class PostGraduateStudent extends Student{
    String thesisTitle;
    Teacher supervisorTeacher;

    public PostGraduateStudent(int id, String name, String email, String rollNumber, List<Course> courses, String thesisTitle, Teacher supervisorTeacher) {
        super(id, name, email, rollNumber, courses);
        this.thesisTitle = thesisTitle;
        this.supervisorTeacher = supervisorTeacher;
    }

    @Override
    public String getDetails() {
        return "Postgraduate Student: " + getName() + "\n" +
                "Roll Number: " + rollNumber + "\n" +
                "Thesis Title: " + thesisTitle + "\n" +
                "Supervisor: " + supervisorTeacher.getName() + "\n" +
                "Courses Enrolled: " + getCourses().size();
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public Teacher getSupervisorTeacher() {
        return supervisorTeacher;
    }

    @Override
    public String getLevel() {
        return "PostGraduate";
    }
}
