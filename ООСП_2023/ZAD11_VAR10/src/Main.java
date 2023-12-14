import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите содержимое оригинального документа: ");
        String originalContent = scanner.nextLine();
        Document originalDocument = new Document(originalContent);

        DocumentManager documentManager = new DocumentManager(originalDocument);

        Document clonedDocument = documentManager.cloneDocument();
        if (clonedDocument != null) {
            System.out.println("\nОригинальный документ: " + originalDocument.getContent());
            System.out.println("Клонированный документ: " + clonedDocument.getContent());

            System.out.print("\nВведите новое содержимое для клонированного документа: ");
            String newContent = scanner.nextLine();
            clonedDocument.setContent(newContent);

            System.out.println("\nОригинальный документ после изменений в клоне: " + originalDocument.getContent());
            System.out.println("Измененный клонированный документ: " + clonedDocument.getContent());
        }
        scanner.close();
    }
}