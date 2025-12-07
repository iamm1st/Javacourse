package lesson1;

public class exerc3 {

    public  static void main(String[] args) {

        int n, a, b, c, d, sum;

        n = 126;
        a = n / 100; // 1 число
        b = n - a * 100; // двузнач. число
        c = b / 10; // 2 число
        d = b % 10; // 3 число

        sum = a + c + d;

        System.out.println("Заданное число n: " + n);
        System.out.println("Сумма чисел: " + sum);

    }
}
