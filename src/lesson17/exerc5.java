package lesson17;

import java.util.Scanner;
import java.util.function.Supplier;

public class exerc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Supplier<String> reverseFromConsole = () -> {
            System.out.print("Введите строку: ");
            String input = scanner.nextLine();
            return new StringBuilder(input).reverse().toString();
        };

        String reversed = reverseFromConsole.get();
        System.out.println("Задом наперёд: " + reversed);

        scanner.close();
    }
}