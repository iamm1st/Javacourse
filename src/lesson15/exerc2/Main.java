package lesson15.exerc2;

public class Main {

    public static void main(String[] args) {
        AnimalCollection collection = new AnimalCollection();

        collection.addAnimal("Cat");
        collection.addAnimal("Dog");
        collection.addAnimal("Elephant");

        collection.printAnimals();

        collection.removeAnimal();
        collection.printAnimals();
    }
}