package lesson15.exerc3;

import java.util.List;

public class Student {

    private final String name;
    private int course;
    private final List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.course = course;
        this.grades = grades;
    }

    public double getAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public int getCourse() {
        return course;
    }

    public void nextCourse() {
        course++;
    }

    public String getName() {
        return name;
    }
}