package lesson16.exerc2;

import java.util.HashMap;
import java.util.Map;

public class Taska2 {

    public static Map<String, String> pairs(String[] words) {
        if (words == null) {
            throw new IllegalArgumentException("Массив не должен быть null");
        }

        Map<String, String> result = new HashMap<>();

        for (String word : words) {
            if (word == null || word.isEmpty()) {
                throw new IllegalArgumentException("Строки должны быть непустыми");
            }

            String firstChar = String.valueOf(word.charAt(0));
            String lastChar = String.valueOf(word.charAt(word.length() - 1));

            result.put(firstChar, lastChar);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(pairs(new String[]{"code", "bug"}));
        System.out.println(pairs(new String[]{"man", "moon", "main"}));
        System.out.println(pairs(new String[]{"man", "moon", "good", "night"}));
    }
}