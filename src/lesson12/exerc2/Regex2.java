package lesson12.exerc2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Введите текст с email, номером документа и телефоном:");
            input = scanner.nextLine();

            if (input == null || input.trim().isEmpty()) {
                System.out.println("Ошибка: строка пустая. Введите текст ещё раз.\n");
                continue;
            }
            break;
        }

        Pattern emailPattern = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[a-zA-Z]{2,}\\b");
        Pattern docPattern = Pattern.compile("\\b\\d{4}-\\d{4}-\\d{2}\\b");
        Pattern phonePattern = Pattern.compile("\\b\\+\\(\\d{2}\\)\\d{7}\\b");

        Matcher emailMatcher = emailPattern.matcher(input);
        Matcher docMatcher = docPattern.matcher(input);
        Matcher phoneMatcher = phonePattern.matcher(input);

        boolean foundSomething = false;

        // Email
        while (emailMatcher.find()) {
            System.out.println("email: " + emailMatcher.group());
            foundSomething = true;
        }

        // Документ
        while (docMatcher.find()) {
            System.out.println("document number: " + docMatcher.group());
            foundSomething = true;
        }

        // Телефон
        while (phoneMatcher.find()) {
            System.out.println("phone number: " + phoneMatcher.group());
            foundSomething = true;
        }
        
        if (!foundSomething) {
            System.out.println("Совпадения не найдены.");
        }
        scanner.close();
    }
}
