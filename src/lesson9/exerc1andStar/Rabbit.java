package lesson9.exerc1andStar;

public class Rabbit extends Animal {

    @Override
    public void voice() {
        System.out.println("Rabbit: squeak");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Grass")) {
            System.out.println("Rabbit likes grass");
        } else {
            System.out.println("Rabbit does not like " + food);
        }
    }
}