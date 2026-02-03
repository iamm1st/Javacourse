package lesson17;

import java.util.function.Function;

public class exerc3 {
    public static void main(String[] args) {
        final double BYN_PER_USD = 3.3;

        Function<String, Double> bynToUsd = text -> {
            if (text == null) {
                throw new IllegalArgumentException("Строка не должна быть null");
            }

            String trimmed = text.trim();
            String[] parts = trimmed.split("\\s+"); // разд. по пробелам

            if (parts.length != 2 || !parts[1].equalsIgnoreCase("BYN")) {
                throw new IllegalArgumentException("Формат должен быть: \"сумма BYN\", например \"100 BYN\"");
            }

            double byn;
            try {
                byn = Double.parseDouble(parts[0]);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Сумма должна быть числом, например \"100 BYN\"");
            }

            return byn / BYN_PER_USD;
        };

        String input = "100 BYN";
        double usd = bynToUsd.apply(input);

        System.out.printf("%s = %.2f USD%n", input, usd);
    }
}