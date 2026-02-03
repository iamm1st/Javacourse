package lesson17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class exerc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Введите дату рождения в формате yyyy-MM-dd (например 2003-07-15): ");
        String input = scanner.nextLine().trim();

        try {
            LocalDate birthDate = LocalDate.parse(input, formatter);
            LocalDate dateAt100 = birthDate.plusYears(100);
            System.out.println("Вам исполнится 100 лет: " + dateAt100.format(formatter));
        } catch (DateTimeParseException e) {
            System.out.println("Ошибка: дата введена неверно. Пример: 2003-07-15");
        }
        scanner.close();
    }
}