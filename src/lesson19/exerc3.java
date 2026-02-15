package lesson19;

public class exerc3 {
    public static void main(String[] args) {

        Fruit apple = new Apple();
        Fruit banana = new Banana();
        Fruit orange = new Orange();

        apple.print();
        banana.print();
        orange.print();
    }
}

sealed class Fruit permits Apple, Banana, Orange {
    void print() {
        System.out.println("Это фрукт");
    }
}

final class Apple extends Fruit {
}

final class Banana extends Fruit {
}

final class Orange extends Fruit {
}