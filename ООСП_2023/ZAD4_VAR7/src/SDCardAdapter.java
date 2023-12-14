public class SDCardAdapter implements StorageAdapter {
    private SDCard sdCard;

    public SDCardAdapter(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    @Override
    public void read() {
        sdCard.readData();
    }

    @Override
    public void write() {
        sdCard.writeData();
    }
}