package lesson20;

import java.util.Scanner;

public class exerc1 {

    static class Result {
        int min;
        int max;
    }

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        int n = readPositiveInt(scanner, "Введите размер массива (целое число > 0): ");

        int[] arr = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            arr[i] = readInt(scanner, "arr[" + i + "] = ");
        }

        Result result = new Result();

        Thread maxThread = new Thread(() -> {
            int max = arr[0];
            for (int x : arr) {
                if (x > max) {
                    max = x;
                }
            }
            result.max = max;
        });

        Thread minThread = new Thread(() -> {
            int min = arr[0];
            for (int x : arr) {
                if (x < min) {
                    min = x;
                }
            }
            result.min = min;
        });

        maxThread.start();
        minThread.start();
        maxThread.join();
        minThread.join();

        System.out.println("Минимум: " + result.min);
        System.out.println("Максимум: " + result.max);

        scanner.close();
    }

    static int readInt(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Ошибка: нужно ввести целое число.");
                scanner.next();
            }
        }
    }

    static int readPositiveInt(Scanner scanner, String message) {
        while (true) {
            int value = readInt(scanner, message);
            if (value > 0) {
                return value;
            }
            System.out.println("Ошибка: число должно быть больше 0.");
        }
    }
}