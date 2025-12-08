package lesson5;
import java.util.Scanner;
import java.util.Random;

public class exerc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[][] array = new int[3][3];

        System.out.println("Исходный массив 3х3:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10); // от 0 до 9
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("\nВведите число, которое будет добавлено к каждому элементу: ");
        int addValue = scanner.nextInt();

        int sum = 0;

        System.out.println("\nМассив после добавления числа:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = array[i][j] + addValue;
                System.out.print(array[i][j] + " ");
                sum += array[i][j];
            }
            System.out.println();
        }

        System.out.println("\nСумма всех элементов = " + sum);
    }
}
