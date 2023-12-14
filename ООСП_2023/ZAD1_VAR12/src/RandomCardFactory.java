import java.util.Random;

class RandomCardFactory implements CardFactory {
    public Card createCard() throws IllegalArgumentException {
        Random random = new Random();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"Туз", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король"};

        String randomSuit = suits[random.nextInt(suits.length)];
        String randomRank = ranks[random.nextInt(ranks.length)];

        switch (randomSuit) {
            case "Hearts":
                return new HeartsCard(randomRank);
            case "Diamonds":
                return new DiamondsCard(randomRank);
            case "Clubs":
                return new ClubsCard(randomRank);
            case "Spades":
                return new SpadesCard(randomRank);
            default:
                throw new IllegalArgumentException("Неверная масть");
        }
    }
}