import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите фильтр:");
        System.out.println("1. Черно-белый");
        System.out.println("2. Сепия");
        System.out.println("3. Резкость");

        int choice;
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
        } else {
            System.out.println("Некорректный ввод. Пожалуйста, введите число.");
            return;
        }

        FilterApply filter = null;
        switch (choice) {
            case 1:
                filter = new BlackAndWhiteFilter();
                break;
            case 2:
                filter = new SepiaFilter();
                break;
            case 3:
                filter = new SharpenFilter();
                break;
            default:
                System.out.println("Некорректный выбор");
                return;
        }

        ImageProcessor imageProcessor = new ImageProcessor();
        imageProcessor.processImage(filter);

        scanner.close();
    }
}