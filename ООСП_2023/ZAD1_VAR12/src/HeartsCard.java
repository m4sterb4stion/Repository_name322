class HeartsCard extends Card {
    public HeartsCard(String rank) {
        super("Hearts", rank);
    }


    void display() {
        System.out.println(rank + " Червей");
    }
}