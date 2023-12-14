public class USBStorageAdapter implements StorageAdapter {
    private USBStorage usbStorage;

    public USBStorageAdapter(USBStorage usbStorage) {
        this.usbStorage = usbStorage;
    }

    @Override
    public void read() {
        usbStorage.readData();
    }

    @Override
    public void write() {
        usbStorage.writeData();
    }
}