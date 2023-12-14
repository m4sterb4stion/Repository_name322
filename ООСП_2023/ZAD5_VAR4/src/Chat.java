import java.util.ArrayList;
import java.util.List;

class Chat implements Actions {
    private List<Observer> observers = new ArrayList<>();
    private String name;

    public Chat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}