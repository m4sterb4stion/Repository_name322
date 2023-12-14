class HyperVVirtualMachine implements VirtualMachine {
    @Override
    public void start() {
        System.out.println("Запуск виртуальной машины Hyper-V...");
    }

    @Override
    public void stop() {
        System.out.println("Остановка виртуальной машины Hyper-V...");
    }

    @Override
    public void delete() {
        System.out.println("Удаление виртуальной машины Hyper-V...");
    }
}