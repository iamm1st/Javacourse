package lesson17;

import java.util.function.Predicate;

public class exerc2 {
    public static void main(String[] args) {
        int[] numbers = { -10, 0, 5, 12, -3, 7 };

        Predicate<Integer> isPositive = x -> x > 0;

        System.out.println("Положительные числа:");
        for (int n : numbers) {
            if (isPositive.test(n)) {   // test() возвр. true/false
                System.out.println(n);
            }
        }
    }
}