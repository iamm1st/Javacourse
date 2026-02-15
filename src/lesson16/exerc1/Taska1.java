package lesson16.exerc1;

import java.util.HashMap;
import java.util.Map;

public class Taska1 {

    public static Map<String, Boolean> wordMultiple(String[] words) {
        if (words == null) {
            throw new IllegalArgumentException("Массив не должен быть null");
        }

        Map<String, Boolean> result = new HashMap<>();

        for (String word : words) {
            if (word == null) {
                throw new IllegalArgumentException("Элементы массива не должны быть null");
            }

            if (result.containsKey(word)) {
                result.put(word, true);
            } else {
                result.put(word, false);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(wordMultiple(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(wordMultiple(new String[]{"c", "b", "a"}));
        System.out.println(wordMultiple(new String[]{"c", "c", "c", "c"}));
    }
}