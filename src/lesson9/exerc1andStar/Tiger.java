package lesson9.exerc1andStar;

public class Tiger extends Animal {

    @Override
    public void voice() {
        System.out.println("Tiger: rrrr");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Meat")) {
            System.out.println("Tiger likes meat");
        } else {
            System.out.println("Tiger does not like " + food);
        }
    }
}