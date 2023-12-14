class SpadesCard extends Card {
    public SpadesCard(String rank) {
        super("Spades", rank);
    }


    void display() {
        System.out.println(rank + " Пик");
    }
}