package lesson1;

public class exerc6 {

        public static void main (String[] args) {

            int a = 1;
            int b = 2;

            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("Сменившиеся переменные: \n" + a + "\n" + b);
        }
    }
