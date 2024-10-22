package org.kryonas;

import java.util.List;

public class Teacher extends User {

    private int teacherId;
    private List<Course> assignedCourses;

    public Teacher(int id, String name, String email, int teacherId, List<Course> assignedCourses) {
        super(id, name, email);
        this.teacherId = teacherId;
        this.assignedCourses = assignedCourses;
    }

    @Override
    public String getDetails() {
        StringBuilder coursesDetails = new StringBuilder();

        for (Course course : assignedCourses) {
            coursesDetails.append(course.getCourseName()).append(", ");
        }

        if (!assignedCourses.isEmpty()) {
            coursesDetails.setLength(coursesDetails.length() - 2);
        }

        return "Teacher: " + getName() + "\n" +
                "Teacher ID: " + teacherId + "\n" +
                "Email: " + getEmail() + "\n" +
                "Assigned Courses: " + (assignedCourses.isEmpty() ? "None" : coursesDetails.toString());
    }

}
