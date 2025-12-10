package lesson8.exerc2;

public class Apple {
    private String col = "Red";

    public void printCol() {
        System.out.println("Цвет яблока: " + col);
    }

    public void changeCol(String newCol) {
        this.col = newCol;
    }

}
