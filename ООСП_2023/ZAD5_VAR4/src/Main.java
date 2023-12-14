import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Chat chat1 = new Chat("Чат #1");
        Chat chat2 = new Chat("Чат #2");

        User user1 = new User("Пользователь 1");
        User user2 = new User("Пользователь 2");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Подписаться на уведомления");
            System.out.println("2. Отписаться от уведомлений");
            System.out.println("3. Выйти");
            System.out.print("Выберите действие (1/2/3): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Выберите чат для подписки:");
                    System.out.println("1. Чат #1");
                    System.out.println("2. Чат #2");
                    int chatChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (chatChoice == 1) {
                        user1.subscribeToChat(chat1);
                    } else if (chatChoice == 2) {
                        user1.subscribeToChat(chat2);
                    } else {
                        System.out.println("Некорректный выбор чата.");
                    }
                    break;
                case 2:
                    System.out.println("Выберите чат для отписки:");
                    System.out.println("1. Чат #1");
                    System.out.println("2. Чат #2");
                    int unsubscribeChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (unsubscribeChoice == 1) {
                        user1.unsubscribeFromChat(chat1);
                    } else if (unsubscribeChoice == 2) {
                        user1.unsubscribeFromChat(chat2);
                    } else {
                        System.out.println("Некорректный выбор чата.");
                    }
                    break;
                case 3:
                    System.out.println("Выход из программы.");
                    System.exit(0);
                default:
                    System.out.println("Некорректный выбор.");
            }
        }
    }
}