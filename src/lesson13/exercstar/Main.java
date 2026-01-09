package lesson13.exercstar;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println("Внутри try");
            System.exit(0); // авар. заверш. JVM
        } catch (Exception e) {
            System.out.println("Внутри catch");
        } finally {
            System.out.println("Внутри finally");
        }
    }
}