class VMwareVirtualMachine implements VirtualMachine {
    @Override
    public void start() {
        System.out.println("Запуск виртуальной машины VMware...");
    }

    @Override
    public void stop() {
        System.out.println("Остановка виртуальной машины VMware...");
    }

    @Override
    public void delete() {
        System.out.println("Удаление виртуальной машины VMware...");
    }
}