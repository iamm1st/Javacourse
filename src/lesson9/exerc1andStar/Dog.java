package lesson9.exerc1andStar;

public final class Dog extends Animal {

    private Dog() {
    }

    private static final Dog dog = new Dog();

    // тк. конструктор приватный, чтобы всё равно пользоваться методами класса Dog,
    // возвращается заранее созданный объект через static-метод
    public static Dog getInstance() {
        return dog;
    }

    @Override
    public void voice() {
        System.out.println("Dog: woof");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Meat")) {
            System.out.println("Dog likes meat");
        } else {
            System.out.println("Dog does not like " + food);
        }
    }
}