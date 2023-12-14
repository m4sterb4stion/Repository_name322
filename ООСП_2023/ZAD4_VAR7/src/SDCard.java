public class SDCard implements StorageDevice {
    @Override
    public void readData() {
        System.out.println("Чтение данных с SD-карты");
    }

    @Override
    public void writeData() {
        System.out.println("Запись данных на SD-карту");
    }
}