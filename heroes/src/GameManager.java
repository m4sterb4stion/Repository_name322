import java.util.Scanner;

public class GameManager {
    private static final int MAX_ROUNDS = 10;

    private Hero hero1;
    private Hero hero2;
    private int currentRound;
    private Scanner scanner;

    public GameManager(Hero hero1, Hero hero2) {
        this.hero1 = hero1;
        this.hero2 = hero2;
        currentRound = 1;
        scanner = new Scanner(System.in);
    }

    public void startGame() {
        System.out.println("Начинается битва между " + hero1.getName() + " и " + hero2.getName() + "!");
        while (hero1.isAlive() && hero2.isAlive() && currentRound <= MAX_ROUNDS) {
            System.out.println("Раунд " + currentRound + " начался!");
            hero1.attack(hero2);
            if (!hero2.isAlive()) {
                break;
            }
            hero2.attack(hero1);
            if (!hero1.isAlive()) {
                break;
            }
            currentRound++;
            System.out.println("Нажмите Enter, чтобы продолжить...");
            scanner.nextLine();
        }
        System.out.println("Битва закончилась! Победитель: " + (hero1.isAlive() ? hero1.getName() : hero2.getName()));
    }
}