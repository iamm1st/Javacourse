package lesson4;

import java.util.Scanner;

public class exerc5 {

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

        for (int i = 0; i < n / 2; i++) { // доходим до половины массива
            int tmp = arr[i]; // временная "коробочка"
            arr[i] = arr[n - 1 - i]; // элемент с конца массива
            arr[n - 1 - i] = tmp;
        }
        System.out.println("Массив после перестановки:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
