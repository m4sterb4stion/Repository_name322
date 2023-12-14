import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        VirtualMachine vm = new VirtualMachine();
        StateManager stateManager = new StateManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Открыть программу");
            System.out.println("2. Закрыть программу");
            System.out.println("3. Показать открытые программы");
            System.out.println("4. Сохранить состояние");
            System.out.println("5. Восстановить состояние");
            System.out.println("0. Выход");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Введите название программы для открытия:");
                    scanner.nextLine();
                    String openProgram = scanner.nextLine();
                    vm.openProgram(openProgram);
                    break;
                case 2:
                    System.out.println("Введите название программы для закрытия:");
                    scanner.nextLine();
                    String closeProgram = scanner.nextLine();
                    vm.closeProgram(closeProgram);
                    break;
                case 3:
                    vm.displayOpenPrograms();
                    break;
                case 4:
                    stateManager.saveState(vm);
                    break;
                case 5:
                    stateManager.restoreState(vm);
                    break;
                case 0:
                    System.out.println("Выход.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Некорректный ввод. Попробуйте снова.");
            }
        }
    }
}