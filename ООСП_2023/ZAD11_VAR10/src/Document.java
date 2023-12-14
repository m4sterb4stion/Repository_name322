class Document implements Cloneable {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public Document clone() throws CloneNotSupportedException {
        return (Document) super.clone();
    }
}