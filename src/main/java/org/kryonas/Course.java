package org.kryonas;


public class Course {
    private int courseId;
    private String courseName;
    private Teacher teacher;
    private int ECTS;

    public Course(int courseId, String courseName, Teacher teacher, int ECTS) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.teacher = teacher;
        this.ECTS = ECTS;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public int getECTS() {
        return ECTS;
    }
}
