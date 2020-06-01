package academy.pocu.comp2500.lab5;

public class Barbarian {
    private String name;
    private int attack;
    private int defense;
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
//
//    public String getName() {
//        return this.name;
//    }

    public void attack(Barbarian enemy) {
        if (enemy == this || enemy == null) {
            return;
        }

        int damage = (this.attack - enemy.getDefense()) / 2;

        if (damage <= 0) {
            damage = 1;
        }

        enemy.setDamage(damage);
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

    protected int getDefense() {
        return this.defense;
    }

    protected int getAttack() {
        return this.attack;
    }

    public void setDamage(int value) {
        this.hp = this.hp - value > 0 ? this.hp - value : 0;
    }



}
