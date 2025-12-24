package lesson10;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("admin", "admin@mail.com", 25);
        User user2 = new User("admin", "admin@mail.com", 25);
        User user3 = new User("user", "user@mail.com", 30);

        // equals
        System.out.println(user1.equals(user2)); // true
        System.out.println(user1.equals(user3)); // false

        // toString
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}