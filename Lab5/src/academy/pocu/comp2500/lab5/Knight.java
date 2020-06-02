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
        if (enemy == this || enemy == null) {
            return;
        }

        int petDeal = 0;
        if (this.pet != null) {
            petDeal = this.pet.getAttack();
        }

        int damage = (int)(((double)this.attack + petDeal - (double)enemy.defense) / 2.0);

        if (damage <= 1) {
            damage = 1;
        }

        enemy.hp = enemy.hp - damage > 0 ? enemy.hp - damage : 0;
    }
}
