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
//        if (enemy == this || enemy == null) {
//            return;
//        }

        if (enemy == this) {
            return;
        }

        int damage = (this.attack - enemy.defense) / 2;
        if (damage <= 0) {
            damage = 1;
        }

        this.hp = this.hp - damage > 0 ? this.hp - damage : 0;
//        enemy.setDamage(damage);
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

//    public int getDefense() {
//        return this.defense;
//    }

//    public int getAttack() {
//        return this.attack;
//    }

//    protected void setDamage(int value) {
//        this.hp = this.hp - value > 0 ? this.hp - value : 0;
//    }

//    public int getMaxHp() {
//        return this.maxHp;
//    }

//    private void setHp(int hp) {
//        this.hp = hp;
//    }


}
