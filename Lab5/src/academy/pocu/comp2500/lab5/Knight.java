package academy.pocu.comp2500.lab5;

public class Knight extends Gladiator {
    private Pet pet;

    public Knight(String name, int maxHp, int attack, int defense) {
        super(name, maxHp, attack, defense);

    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void attackTogether(Barbarian enemy) {
        if (this.pet == null) {
            return;
        }

        int damage = (int)(((double)this.attack + this.pet.getAttack() - (double)enemy.defense) / 2.0);

        if (damage <= 1) {
            damage = 1;
        }

        enemy.hp = enemy.hp - damage > 0 ? enemy.hp - damage : 0;
    }
}
