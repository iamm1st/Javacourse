package exerc2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nВведите текст с email, номером документа и телефоном:");
        String input = scanner.nextLine();

        // email
        Pattern emailPattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+");
        Matcher emailMatcher = emailPattern.matcher(input);

        // номер документа xxxx-xxxx-xx
        Pattern docPattern = Pattern.compile("\\d{4}-\\d{4}-\\d{2}");
        Matcher docMatcher = docPattern.matcher(input);

        // телефон +(xx)xxxxxxx
        Pattern phonePattern = Pattern.compile("\\+\\(\\d{2}\\)\\d{7}");
        Matcher phoneMatcher = phonePattern.matcher(input);

        if (emailMatcher.find()) {
            System.out.println("email: " + emailMatcher.group());
        }

        if (docMatcher.find()) {
            System.out.println("document number: " + docMatcher.group());
        }

        if (phoneMatcher.find()) {
            System.out.println("phone number: " + phoneMatcher.group());
        }
    }
}