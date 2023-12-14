import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество карт для генерации: ");
        int numberOfCards = scanner.nextInt();
        CardFactory cardFactory = new RandomCardFactory();
        List<Card> deck = new ArrayList<>();
        for (int i = 0; i < numberOfCards; i++) {
            Card card = cardFactory.createCard();
            deck.add(card);
            card.display();
        }
    }
}