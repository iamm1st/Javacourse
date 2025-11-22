package lesson2;

import java.util.Scanner;

public class exerc2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру t: ");
        int t = scanner.nextInt();
        if (t > -5) {
            System.out.println("Warm");
        }
        else if (t > -20) {
            System.out.println("Normal");
        }
        else {
            System.out.println("Cold");
        }
    }
}
