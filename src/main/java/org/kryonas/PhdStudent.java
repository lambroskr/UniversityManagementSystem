package org.kryonas;

import java.util.List;

public class PhdStudent extends Student {
    private int researchPublications;

    public PhdStudent(int id, String name, String email, String rollNumber, List<Course> courses, int researchPublications) {
        super(id, name, email, rollNumber, courses);
        this.researchPublications = researchPublications;
    }

    @Override
    public String getDetails() {
        return "PhD Student: " + getName() + "\n" +
                "Roll Number: " + rollNumber + "\n" +
                "Research Publications: " + researchPublications + "\n" +
                "Courses Enrolled: " + getCourses().size();
    }

    public int getResearchPublications() {
        return researchPublications;
    }

    @Override
    public String getLevel() {
        return "Phd";
    }
}
