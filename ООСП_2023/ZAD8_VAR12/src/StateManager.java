class StateManager {
    private VMState state;

    public void saveState(VirtualMachine vm) {
        state = vm.saveState();
        System.out.println("Состояние виртуальной машины сохранено.");
    }

    public void restoreState(VirtualMachine vm) {
        if (state != null) {
            vm.restoreState(state);
        } else {
            System.out.println("Нет сохраненного состояния для восстановления.");
        }
    }
}