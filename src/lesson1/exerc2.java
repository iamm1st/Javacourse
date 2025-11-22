package lesson1;

public class exerc2 {

    public static void main(String[] args) {

        int n = 26;
        int firstDigit = n / 10;
        int secondDigit = n % 10;
        int sum = firstDigit + secondDigit;

        System.out.println("Заданное число n: " + n);
        System.out.println("Сумма чисел: " + sum);

    }
}