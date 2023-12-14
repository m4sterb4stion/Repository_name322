public class Main {
    public static void main(String[] args) {
        Folder mainFolder = new Folder("Корневая папка");
        File file1 = new File("Файл 1.txt");
        File file2 = new File("Файл 2.doc");

        Folder folder1 = new Folder("Папка 1");
        folder1.add(file1);
        folder1.add(file2);

        Folder folder1_1 = new Folder("Папка 1.1");
        File file3 = new File("Файл 3.jpg");
        folder1_1.add(file3);
        folder1.add(folder1_1);

        File file4 = new File("Файл 4.jpg");

        Folder folder2 = new Folder("Папка 2");
        folder2.add(file4);

        mainFolder.add(folder1);
        mainFolder.add(folder2);
        mainFolder.display();
    }
}