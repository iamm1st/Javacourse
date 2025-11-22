package lesson4;

import java.util.Scanner;

public class exerc2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * 101);
        }
        System.out.println("Заполненный массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int min = arr[0]; // временно принимаем, что 1-ый элем. по индексу - самый маленький/большой
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) min = arr[i]; // Если текущий элемент меньше того, который считаю минимумом — теперь минимумом будет этот элемент
            if (arr[i] > max) max = arr[i];
        }

        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);

    }
}
