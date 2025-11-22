package lesson2;

import java.util.Scanner;

public class exerc1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Число " + a + " четное"); }
        else {
            System.out.println("Число " + a + " нечетное");
        }
    }
}
