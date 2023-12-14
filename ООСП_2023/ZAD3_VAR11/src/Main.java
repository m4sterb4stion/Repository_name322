import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите виртуальную машину: 1 - VMware, 2 - Hyper-V, 3 - VirtualBox");
        int vmChoice = scanner.nextInt();

        VirtualMachine virtualMachine = createVirtualMachine(vmChoice);

        System.out.println("Выберите действие: 1 - Запустить, 2 - Остановить, 3 - Удалить");
        int actionChoice = scanner.nextInt();

        performAction(virtualMachine, actionChoice);
    }

    private static VirtualMachine createVirtualMachine(int vmChoice) {
        switch (vmChoice) {
            case 1:
                return new VMwareVirtualMachine();
            case 2:
                return new HyperVVirtualMachine();
            case 3:
                return new VirtualBoxVirtualMachine();
            default:
                throw new IllegalArgumentException("Некорректный выбор виртуальной машины");
        }
    }

    private static void performAction(VirtualMachine virtualMachine, int actionChoice) {
        switch (actionChoice) {
            case 1:
                virtualMachine.start();
                break;
            case 2:
                virtualMachine.stop();
                break;
            case 3:
                virtualMachine.delete();
                break;
            default:
                throw new IllegalArgumentException("Некорректное действие");
        }
    }
}