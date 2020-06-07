package academy.pocu.comp2500.lab5;

public class Barbarian {
    private String name;
    protected int attack;
    protected int defense;
    protected int hp;
    protected int maxHp;

    public Barbarian(String name, int maxHp, int attack, int defense) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.hp = maxHp;
        this.maxHp = maxHp;
    }

    public int getHp() {
        return this.hp;
    }

    public void attack(Barbarian enemy) {
        if (enemy == this) {
            return;
        }

        int damage = (this.attack - enemy.defense) / 2;
        if (damage <= 0) {
            damage = 1;
        }

        enemy.hp = enemy.hp - damage > 0 ? enemy.hp - damage : 0;
    }

    public boolean isAlive() {
        return this.hp > 0;
    }
}
