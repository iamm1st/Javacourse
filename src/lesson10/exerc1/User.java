package lesson10.exerc1;

public class User {

    String login;
    String email;
    int age;

    public User(String login, String email, int age) {
        this.login = login;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        User otherUser = (User) obj; // превращ. object в user

        // сравн. полей
        return login.equals(otherUser.login) && email.equals(otherUser.email) && age == otherUser.age;
    }

    @Override
    public int hashCode() {
        int result = login.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + age;
        return result;
    }
}