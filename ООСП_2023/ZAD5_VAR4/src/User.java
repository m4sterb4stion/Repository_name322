class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void subscribeToChat(Chat chat) {
        chat.addObserver(this);
    }

    public void unsubscribeFromChat(Chat chat) {
        chat.removeObserver(this);
    }

    @Override
    public void update(String message) {
        System.out.println(name + " получил новое сообщение");
    }
}