package org.kryonas;

import java.util.ArrayList;
import java.util.List;


public class App 
{
    public static void main( String[] args )
    {
        List<Course> courses = new ArrayList<>();

        Teacher t1 = new Teacher(1, "Dr. Smith", "smith@example.com", 101, courses);
        Course c1 = new Course(1001, "Advanced Algorithms",t1,5);
        Course c2 = new Course(1001, "Basic Algorithms",t1,2);

        courses.add(c1);
        courses.add(c2);
        Student s1 = new UnderGraduateStudent(1,"Lambros", "ldsaldla@mgil.com", "ics20043", courses,50 );

        System.out.println(s1.getDetails());
        System.out.println(t1.getDetails());
    }
}
