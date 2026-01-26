package lesson15.exerc2;

import java.util.LinkedList;
import java.util.List;

public class AnimalCollection {

    private final List<String> animals = new LinkedList<>();

    public void addAnimal(String animal) {
        animals.addFirst(animal);
    }

    public void removeAnimal() {
        if (animals.isEmpty()) {
            System.out.println("Коллекция пуста, удалять нечего");
            return;
        }
        // удаление с конца
        animals.removeLast();
    }

    public void printAnimals() {
        System.out.println(animals);
    }
}