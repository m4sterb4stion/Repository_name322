public class USBStorage implements StorageDevice {
    @Override
    public void readData() {
        System.out.println("Чтение данных с USB-накопителя");
    }

    @Override
    public void writeData() {
        System.out.println("Запись данных на USB-накопитель");
    }
}