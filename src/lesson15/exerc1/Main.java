package lesson15.exerc1;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите числа через запятую: ");
        String input = scanner.nextLine();

        Set<Integer> numbers = new HashSet<>();

        String[] parts = input.split(",");

        for (String part : parts) {
            try {
                int number = Integer.parseInt(part.trim());
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Некорректное число: " + part);
            }
        }

        System.out.println("Без повторов:");
        System.out.println(numbers);

        scanner.close();
    }
}