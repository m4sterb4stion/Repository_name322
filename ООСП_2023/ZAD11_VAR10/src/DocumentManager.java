class DocumentManager {
    private Document prototype;

    public DocumentManager(Document prototype) {
        this.prototype = prototype;
    }

    public Document cloneDocument() throws CloneNotSupportedException {
        return prototype.clone();
    }
}