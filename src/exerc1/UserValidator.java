package exerc1;

public class UserValidator {

    public static boolean validate(String login, String password, String confirmPassword) {
        try {
            if (login.length() >= 20 || login.contains(" ")) {
                throw new WrongLoginException("Неверный логин");
            }
            if (password.length() >= 20 || password.contains(" ")) {
                throw new WrongPasswordException("Неверный пароль");
            }

            boolean hasDigit = false;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    hasDigit = true;
                    break;
                }
            }

            if (!hasDigit) {
                throw new WrongPasswordException("Пароль должен содержать хотя бы одну цифру");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли не совпадают");
            }
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}