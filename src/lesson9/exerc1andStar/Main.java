package lesson9.exerc1andStar;

public class Main {
        public static void main(String[] args) {

                Animal rabbit = new Rabbit();
                Animal tiger = new Tiger();
                Animal dog = Dog.getInstance(); // new Dog() запрещено

                rabbit.voice();
                rabbit.eat("Grass");
                rabbit.eat("Meat");

                tiger.voice();
                tiger.eat("Meat");
                tiger.eat("Grass");

                dog.voice();
                dog.eat("Meat");
                dog.eat("Grass");
        }
}