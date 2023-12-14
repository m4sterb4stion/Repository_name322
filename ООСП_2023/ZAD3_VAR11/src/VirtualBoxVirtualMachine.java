class VirtualBoxVirtualMachine implements VirtualMachine {
    @Override
    public void start() {
        System.out.println("Запуск виртуальной машины VirtualBox...");
    }

    @Override
    public void stop() {
        System.out.println("Остановка виртуальной машины VirtualBox...");
    }

    @Override
    public void delete() {
        System.out.println("Удаление виртуальной машины VirtualBox...");
    }
}