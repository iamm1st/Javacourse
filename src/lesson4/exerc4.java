package lesson4;

import java.util.Scanner;

public class exerc4 {

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

        int zeroCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) zeroCount++;
        }

        if (zeroCount == 0) {
            System.out.println("Нулевых элементов нет");
        } else {
            System.out.println("Количество нулевых элементов: " + zeroCount);
        }
    }
}