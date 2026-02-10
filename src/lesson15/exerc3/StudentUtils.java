package lesson15.exerc3;

import java.util.Iterator;
import java.util.List;

public class StudentUtils {

    public static void processStudents(List<Student> students) {
        // т.к. удаление во время перебора
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                iterator.remove();
            } else {
                student.nextCourse();
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}