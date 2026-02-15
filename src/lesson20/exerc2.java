package lesson20;

import java.util.Arrays;
import java.util.Scanner;

public class exerc2 {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        int n = readPositiveInt(scanner, "Введите размер массива (целое число > 0): ");
        int[] original = new int[n];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            original[i] = readInt(scanner, "arr[" + i + "] = ");
        }

        int[] insertionArr = Arrays.copyOf(original, original.length);
        int[] selectionArr = Arrays.copyOf(original, original.length);
        int[] bubbleArr = Arrays.copyOf(original, original.length);

        Thread insertionThread = new Thread(() -> insertionSort(insertionArr));
        Thread selectionThread = new Thread(() -> selectionSort(selectionArr));
        Thread bubbleThread = new Thread(() -> bubbleSort(bubbleArr));

        insertionThread.start();
        selectionThread.start();
        bubbleThread.start();
        insertionThread.join();
        selectionThread.join();
        bubbleThread.join();

        System.out.println("Исходный массив:      " + Arrays.toString(original));
        System.out.println("Сортировка вставками: " + Arrays.toString(insertionArr));
        System.out.println("Сортировка выбором:   " + Arrays.toString(selectionArr));
        System.out.println("Сортировка пузырьком: " + Arrays.toString(bubbleArr));

        scanner.close();
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
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