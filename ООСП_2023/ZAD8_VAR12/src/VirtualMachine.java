import java.util.ArrayList;
import java.util.List;

class VirtualMachine {
    private List<String> openPrograms;

    public VirtualMachine() {
        this.openPrograms = new ArrayList<>();
    }

    public void openProgram(String programName) {
        openPrograms.add(programName);
        System.out.println(programName + " - открыто");
    }

    public void closeProgram(String programName) {
        openPrograms.remove(programName);
        System.out.println(programName + " - закрыто");
    }

    public VMState saveState() {
        return new VMState(openPrograms);
    }

    public void restoreState(VMState state) {
        openPrograms = new ArrayList<>(state.getOpenPrograms());
        System.out.println("Состояние виртуальной машины восстановлено.");
    }

    public void displayOpenPrograms() {
        System.out.println("Открытые программы:");
        for (String program : openPrograms) {
            System.out.println("- " + program);
        }
    }
}