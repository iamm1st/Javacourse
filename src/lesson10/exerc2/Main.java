package lesson10.exerc2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        User user1 = new User(1, "Alice", new Address(101, "Minsk"));
        User user2 = new User(2, "Bob", new Address(102, "Baku"));
        User user3 = new User(3, "Charlie", new Address(103, "Paris"));

        User[] users = {user1, user2, user3};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Доступные пользователи:");
        for (User user : users) {
            System.out.println(user);
        }

        System.out.print("Введите id пользователя для клонирования: ");
        int id = scanner.nextInt();
        System.out.print("Введите тип клонирования (1 - поверхностное, 2 - глубокое): ");
        int type = scanner.nextInt();

        User original = null;

        for (User user : users) {
            if (user.id == id) {
                original = user;
                break;
            }
        }

        if (original == null) {
            System.out.println("Пользователь не найден");
            return;
        }

        User clonedUser;

        if (type == 1) {
            clonedUser = original.shallowClone();
            System.out.println("Выполнено ПОВЕРХНОСТНОЕ клонирование");
        } else {
            clonedUser = original.deepClone();
            System.out.println("Выполнено ГЛУБОКОЕ клонирование");
        }

        System.out.println("Оригинал: " + original);
        System.out.println("Клон:      " + clonedUser);

        // проверка
        System.out.println("Одинаковый ли объект address?");
        System.out.println(original.address == clonedUser.address);
    }
}