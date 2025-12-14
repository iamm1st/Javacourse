package lesson7.exerc1;

class Accountant implements Position {
    @Override
    public void printPosition() {
        System.out.println("Должность: Бухгалтер");
    }
}