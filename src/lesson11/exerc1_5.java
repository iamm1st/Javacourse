package lesson11;

import java.util.Scanner;
import java.util.Arrays;

public class exerc1_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        String s1 = scanner.nextLine();

        System.out.println("Введите вторую строку:");
        String s2 = scanner.nextLine();

        System.out.println("Введите третью строку:");
        String s3 = scanner.nextLine();

        String[] strings = {s1, s2, s3};

        // 1 зад.
        String shortest = strings[0];
        String longest = strings[0];

        for (String s : strings) {
            if (s.length() < shortest.length()) {
                shortest = s;
            }
            if (s.length() > longest.length()) {
                longest = s;
            }
        }

        System.out.println("\nЗадание 1:");
        System.out.println("Самая короткая строка: \"" + shortest + "\", длина = " + shortest.length());
        System.out.println("Самая длинная строка: \"" + longest + "\", длина = " + longest.length());

        // 2 зад.
        Arrays.sort(strings, (a, b) -> a.length() - b.length());
        System.out.println("\nЗадание 2:");
        for (String s : strings) {
            System.out.println(s + " (длина = " + s.length() + ")");
        }

        // 3 зад.
        int sumLength = 0;
        for (String s : strings) {
            sumLength += s.length();
        }

        double averageLength = sumLength / 3.0;

        System.out.println("\nЗадание 3:");
        for (String s : strings) {
            if (s.length() < averageLength) {
                System.out.println(s + " (длина = " + s.length() + ")");
            }
        }

        // 4 зад.
        System.out.println("\nЗадание 4:");
        for (String s : strings) {
            if (allCharactersUnique(s)) {
                System.out.println("Слово с уникальными символами: " + s);
                break;
            }
        }

        // 5 зад.
        System.out.println("\nЗадание 5:");
        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        StringBuilder doubled = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            doubled.append(input.charAt(i));
            doubled.append(input.charAt(i));
        }

        System.out.println("Результат: " + doubled);
    }

    private static boolean allCharactersUnique(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}

