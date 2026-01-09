package lesson12.exerc1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String text = scanner.nextLine();

        Pattern abPattern = Pattern.compile("\\b[A-Z]{2,6}\\b");
        Matcher abMatcher = abPattern.matcher(text);

        System.out.println("Найденные аббревиатуры:");
        while (abMatcher.find()) {
            System.out.println(abMatcher.group());
        }
    }
}