package lesson6.exerc1;

public class Main {
    public static void main(String[] args) {

        CreditCard card1 = new CreditCard("1010", 100.0);
        CreditCard card2 = new CreditCard("2020", 200.0);
        CreditCard card3 = new CreditCard("3033", 300.0);

        card1.deposit(50.0);
        card2.deposit(100.0);
        card3.withdraw(70.0);

        card1.printInfo();
        card2.printInfo();
        card3.printInfo();
    }
}