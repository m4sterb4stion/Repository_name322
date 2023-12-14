import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        USBStorage usbStorage = new USBStorage();
        StorageAdapter usbAdapter = new USBStorageAdapter(usbStorage);

        SDCard sdCard = new SDCard();
        StorageAdapter sdCardAdapter = new SDCardAdapter(sdCard);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите действие:");
        System.out.println("1. Чтение с USB-накопителя");
        System.out.println("2. Запись на USB-накопитель");
        System.out.println("3. Чтение с SD-карты");
        System.out.println("4. Запись на SD-карту");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                usbAdapter.read();
                break;
            case 2:
                usbAdapter.write();
                break;
            case 3:
                sdCardAdapter.read();
                break;
            case 4:
                sdCardAdapter.write();
                break;
            default:
                System.out.println("Неверный выбор");
        }
        scanner.close();
    }
}
