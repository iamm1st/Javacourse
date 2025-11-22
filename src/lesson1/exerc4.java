package lesson1;

public class exerc4 {

    public static void main(String[] args) {

        double n = 3.6;

        // Также можно исп. Math.round(n)
        int rounded = (int) n; // отбрoc. дробн. часть
        if (n - rounded >= 0.5) {
            rounded = rounded + 1;
        }

        System.out.println("Округлённое число: " + rounded);
    }
}
