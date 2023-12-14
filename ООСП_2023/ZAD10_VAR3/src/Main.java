import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankFacade bank = new BankFacade(1000);

        while (true) {
            System.out.println("\n1. Проверить баланс");
            System.out.println("2. Пополнить счет");
            System.out.println("3. Осуществить перевод");
            System.out.println("4. Выйти");

            System.out.print("Выберите операцию: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Текущий баланс: " + bank.checkBalance());
                    break;

                case 2:
                    System.out.println("Выберите метод пополнения:");
                    System.out.println("1. По СБП");
                    System.out.println("2. С карты другого банка");
                    System.out.println("3. С баланса телефона");
                    System.out.print("Введите номер метода: ");
                    int depositMethodChoice = scanner.nextInt();

                    String depositMethod;
                    switch (depositMethodChoice) {
                        case 1:
                            depositMethod = "СБП";
                            break;
                        case 2:
                            depositMethod = "С карты другого банка";
                            break;
                        case 3:
                            depositMethod = "С баланса телефона";
                            break;
                        default:
                            System.out.println("Некорректный выбор метода.");
                            continue;
                    }

                    System.out.print("Введите сумму для пополнения: ");
                    int depositAmount = scanner.nextInt();

                    bank.deposit(depositAmount, depositMethod);
                    System.out.println("Счет успешно пополнен.");
                    break;

                case 3:
                    System.out.print("Введите сумму для перевода: ");
                    int transferAmount = scanner.nextInt();

                    System.out.print("Введите номер телефона получателя: ");
                    String recipientPhoneNumber = scanner.next();

                    bank.transfer(transferAmount, recipientPhoneNumber);
                    System.out.println("Перевод успешно выполнен.");
                    System.out.println("Текущий баланс: " + bank.checkBalance());
                    break;

                case 4:
                    System.out.println("Программа завершена.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Некорректный ввод. Пожалуйста, выберите допустимую операцию.");
            }
        }
    }
}