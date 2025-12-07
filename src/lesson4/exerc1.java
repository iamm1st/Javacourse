// Для всех задач исходные условия следующие: пользователь с клавиатуры вводит размер
// массива (просто целое число). После того, как размер массива задан, заполнить его
// одним из двух способов: используя Math.random(), или каждый элемент массива вводится
// пользователем вручную. Попробовать оба варианта. После заполнения массива
// данными, решить для него следующие задачи

package lesson4;

import java.util.Scanner;

public class exerc1 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива (целое число): ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 101);
        }

        System.out.println("Массив в прямом порядке:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nМассив в обратном порядке:");
        for (int i = n - 1; i >= 0; i--) { // n - 1, т.к. идем по индексам, начиная с 0.
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
