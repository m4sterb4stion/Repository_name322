import java.util.Scanner;

public class Builder {
    private Scanner scanner;

    public Builder(Scanner scanner) {
        this.scanner = scanner;
    }

    public User buildUser() {
        User.UserBuilder userBuilder = new User.UserBuilder();

        System.out.print("Желаете ввести имя? (да/нет): ");
        if (scanner.nextLine().equalsIgnoreCase("да")) {
            System.out.print("Введите имя: ");
            userBuilder.setFirstName(scanner.nextLine());
        }

        System.out.print("Желаете ввести фамилию? (да/нет): ");
        if (scanner.nextLine().equalsIgnoreCase("да")) {
            System.out.print("Введите фамилию: ");
            userBuilder.setLastName(scanner.nextLine());
        }

        System.out.print("Желаете ввести email? (да/нет): ");
        if (scanner.nextLine().equalsIgnoreCase("да")) {
            System.out.print("Введите email: ");
            userBuilder.setEmail(scanner.nextLine());
        }

        System.out.print("Желаете ввести возраст? (да/нет): ");
        if (scanner.nextLine().equalsIgnoreCase("да")) {
            System.out.print("Введите возраст: ");
            try {
                int age = Integer.parseInt(scanner.nextLine());
                userBuilder.setAge(age);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода возраста. Используется значение по умолчанию (0).");
            }
        }

        return userBuilder.build();
    }
}