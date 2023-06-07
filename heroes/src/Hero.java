abstract class Hero {
    protected String name;
    protected int health;
    protected Weapon weapon;
    protected Armor armor;

    public Hero(String name, int health, Weapon weapon, Armor armor) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
        this.armor = armor;
    }

    public void attack(Hero hero) {
        int damage = weapon.calculateDamage();
        hero.defend(damage);
        System.out.println(name + " нанес " + hero.getName() + " " + damage + " урона.");
    }

    public void defend(int damage) {
        int actualDamage = Math.max(0, damage - armor.calculateDefense());
        health -= actualDamage;
        System.out.println(name + " получил " + actualDamage + " урона. Здоровье: " + health);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }
}