package lesson19;

public class exerc2 {
    public static void main(String[] args) {

        Person person = new Person("Polina", 19);

        System.out.println(person);
        System.out.println("Имя: " + person.name());
        System.out.println("Возраст: " + person.age());
    }
}

record Person(String name, int age) {
}