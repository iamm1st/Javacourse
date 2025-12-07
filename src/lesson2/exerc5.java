package lesson2;

import java.util.Scanner;

public class exerc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.print("Введите любое целое положительное число: ");

        do {                 // false
            while (!scanner.hasNextInt()) { // Пока пользователь не ввёл целое число, выполняется {}
                System.out.println("Ошибка! Введите целое число.");
                scanner.next();
            }
            a = scanner.nextInt();
            if (a <= 0) {
                System.out.println("Число должно быть положительным!");
            }
        } while (a <= 0);

        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }

        System.out.println("Сумма чисел от 1 до " + a + " равна " + sum);
    }
}
