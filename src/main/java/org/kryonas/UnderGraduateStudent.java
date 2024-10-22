package org.kryonas;

import java.util.List;

public class UnderGraduateStudent extends Student{

    private int creditsEarned;

    public UnderGraduateStudent(int id, String name, String email, String rollNumber, List<Course> courses, int creditsEarned) {
        super(id, name, email, rollNumber, courses);
        this.creditsEarned = creditsEarned;
    }

    @Override
    public String getDetails() {
        return "Undergraduate Student: " + getName() + "\n" +
                "Roll Number: " + rollNumber + "\n" +
                "Credits Earned: " + creditsEarned + "\n" +
                "Courses Enrolled: " + getCourses().size();
    }

    public int getCreditsEarned() {
        return creditsEarned;
    }

    public void setCreditsEarned(int creditsEarned) {
        this.creditsEarned = creditsEarned;
    }

    @Override
    public String getLevel() {
        return "Undergraduate";
    }
}
