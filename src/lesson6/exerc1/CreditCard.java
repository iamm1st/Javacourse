package lesson6.exerc1;

class CreditCard {
    String accountNumber;
    double currentAmount;

    CreditCard(String accountNumber, double currentAmount) {
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;
    }

    void deposit(double amount) {
        currentAmount = currentAmount + amount;
    }

    void withdraw(double amount) {
        currentAmount = currentAmount - amount;
    }

    void printInfo() {

        System.out.println("Счёт: " + accountNumber + ", текущая сумма: " + currentAmount);
    }
}