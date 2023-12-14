import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Builder builder = new Builder(scanner);

        User user = builder.buildUser();

        System.out.println("\nИнформация о пользователе:");
        System.out.println("Имя: " + user.getFirstName());
        System.out.println("Фамилия: " + user.getLastName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Возраст: " + user.getAge());

        scanner.close();
    }
}