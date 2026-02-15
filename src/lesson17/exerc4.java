package lesson17;

import java.util.function.Consumer;

public class exerc4 {
    public static void main(String[] args) {
        final double BYN_PER_USD = 3.3;

        Consumer<String> printUsd = text -> {
            try {
                String trimmed = text.trim();
                String[] parts = trimmed.split("\\s+");

                if (parts.length != 2 || !parts[1].equalsIgnoreCase("BYN")) {
                    System.out.println("Ошибка формата. Пример: \"100 BYN\"");
                    return;
                }

                double byn = Double.parseDouble(parts[0]);
                double usd = byn / BYN_PER_USD;

                System.out.printf("%s = %.2f USD%n", text, usd);
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        };

        printUsd.accept("250 BYN");
    }
}