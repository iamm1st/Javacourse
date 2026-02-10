package lesson15.exerc3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Anna", "A1", 1, List.of(4, 5, 3)));
        students.add(new Student("Bob", "A1", 1, List.of(2, 2, 3)));
        students.add(new Student("Kate", "B2", 2, List.of(5, 4, 4)));

        StudentUtils.processStudents(students);

        System.out.println("Студенты 2 курса:");
        StudentUtils.printStudents(students, 2);
    }
}