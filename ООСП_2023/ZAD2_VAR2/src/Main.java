import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите фракцию (1 или 2):");
        int factionChoice = scanner.nextInt();

        ArmyFactory armyFactory = createArmyFactory(factionChoice);

        System.out.println("Выберите тип юнита (1 для пехоты, 2 для танков, 3 для артиллерии):");
        int unitChoice = scanner.nextInt();

        createAndAttackUnit(armyFactory, unitChoice);
    }

    private static ArmyFactory createArmyFactory(int factionChoice) {
        switch (factionChoice) {
            case 1:
                return new Faction1Factory();
            case 2:
                return new Faction2Factory();
            default:
                throw new IllegalArgumentException("Фракция не существует");
        }
    }

    private static void createAndAttackUnit(ArmyFactory armyFactory, int unitChoice) {
        switch (unitChoice) {
            case 1:
                Infantry infantry = armyFactory.createInfantry();
                infantry.attack();
                break;
            case 2:
                Tanks tanks = armyFactory.createTanks();
                tanks.attack();
                break;
            case 3:
                Artillery artillery = armyFactory.createArtillery();
                artillery.attack();
                break;
            default:
                throw new IllegalArgumentException("Юнита не существует");
        }
    }
}