package lesson18;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(2);
        numbers.add(6);
        numbers.add(3);
        numbers.add(8);

        List<Integer> resultList = numbers.stream()
                .distinct()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println("Четные уникальные элементы:");
        resultList.forEach(System.out::println);

        int sum = resultList.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Сумма четных уникальных элементов: " + sum);
    }
}