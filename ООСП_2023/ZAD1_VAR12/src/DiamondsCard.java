class DiamondsCard extends Card {
    public DiamondsCard(String rank) {
        super("Diamonds", rank);
    }


    void display() {
        System.out.println(rank + " Бубны");
    }
}