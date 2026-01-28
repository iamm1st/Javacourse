package lesson13.exerc1;

public class Main {
    public static void main(String[] args) {

        boolean result = UserValidator.validate(
                "Poly123",
                "password12",
                "password12"
        );

        System.out.println("Результат проверки: " + result);
    }
}