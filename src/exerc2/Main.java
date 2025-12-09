package exerc2;

public class Main {
    public static void main(String[] args) {

        // Массив из 5 разных фигур
        Figure[] figures = {
                new Triangle(3, 4, 5),
                new Rectangle(2, 6),
                new Circle(3),
                new Rectangle(4, 4),
                new Triangle(5, 5, 6)
        };

        double totalPerimeter = 0;

        for (Figure f : figures) {
            totalPerimeter += f.getPerimeter();
        }

        System.out.println("Суммарный периметр всех фигур: " + totalPerimeter);
    }
}