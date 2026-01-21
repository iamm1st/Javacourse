package lesson12.exerc1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pattern abPattern = Pattern.compile("\\b[A-Z]{2,6}\\b");

        String text;

        while (true) {
            System.out.println("Введите строку:");
            text = scanner.nextLine();

            if (text == null || text.trim().isEmpty()) {
                System.out.println("Ошибка: строка пустая. Введите строку ещё раз.\n");
                continue;
            }
            break;
        }

        Matcher abMatcher = abPattern.matcher(text);

        System.out.println("Найденные аббревиатуры:");
        boolean found = false;

        while (abMatcher.find()) {
            System.out.println(abMatcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("Аббревиатуры не найдены.");
        }
        scanner.close();
    }
}