package java_16june;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

record Course(String courseId, String name, String subject) {

}

record Purchase(String courseId, int studentId, int dayOfYear, double price, int yr) {

}


public class Student {
    public LocalDate purchaseDate(int year, int dayOfYear) {
        return LocalDate.ofYearDay(year, dayOfYear);
    }

    private String name;
    private List<Course> courses;
    private int lastId = 1;
    private int id;

    public Student(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
        id = lastId++;
    }

    public Student(String name, Course course) {
        this(name, new ArrayList<>(List.of(course)));
    }

    public int id() {
        return id;
    }

    public String name() {
        return name;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public String toString() {
        String[] cr = new String[courses.size()];
        for (int i = 0; i < courses.size(); i++) {
            cr[i] = courses.get(i).name();
        }
        //return Arrays.toString(cr);
        return "[%d] : %s".formatted(id, String.join(", ", cr));
    }

}
