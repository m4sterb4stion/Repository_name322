import java.util.ArrayList;
import java.util.List;


class VMState {
    private List<String> openPrograms;

    public VMState(List<String> openPrograms) {
        this.openPrograms = new ArrayList<>(openPrograms);
    }

    public List<String> getOpenPrograms() {
        return new ArrayList<>(openPrograms);
    }
}