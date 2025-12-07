package lesson4;

import java.util.Scanner;

public class exerc6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Пользовательский ввод
        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        boolean isIncreasing = true;

        for (int i = 1; i < n; i++) { // i = 1, т.к. сравниваем с предыдущим
            if (arr[i] <= arr[i - 1]) { // текущ. <= предыдущ.
                isIncreasing = false;
                break;
            }
        }

        if (isIncreasing) {
            System.out.println("Массив — возрастающая последовательность.");
        } else {
            System.out.println("Массив НЕ является возрастающей последовательностью.");
        }
    }
}