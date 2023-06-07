public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Warrior("Воин", 100, new Sword(), new ChainArmor());
        Hero hero2 = new Mage("Маг", 80, new Staff(), new Robe());
        GameManager gameManager = new GameManager(hero1, hero2);
        gameManager.startGame();
    }
}
