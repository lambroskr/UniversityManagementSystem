package org.kryonas;

import java.util.List;

public abstract class Student extends User {
    protected String rollNumber;
    protected List<Course> courses;

    public Student(int id, String name, String email, String rollNumber, List<Course> courses) {
        super(id, name, email);
        this.rollNumber = rollNumber;
        this.courses = courses;
    }
    public abstract String getLevel();

    public void enrollInCourse(Course course) {
        courses.add(course);
        System.out.println("Enrolled in course: " + course.getCourseName());
    }

    public void withdrawFromCourse(Course course) {
        courses.remove(course);
        System.out.println("Withdrew from course: " + course.getCourseName());
    }

    public List<Course> getCourses() {
        return courses;
    }


    public String getRollNumber() {
        return rollNumber;
    }


}
