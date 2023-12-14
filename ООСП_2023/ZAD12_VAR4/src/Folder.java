import java.util.ArrayList;
import java.util.List;

class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> branch = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent component) {
        branch.add(component);
    }

    @Override
    public void display() {
        System.out.println("Директория: " + name);
        for (FileSystemComponent component : branch) {
            component.display();
        }
    }
}