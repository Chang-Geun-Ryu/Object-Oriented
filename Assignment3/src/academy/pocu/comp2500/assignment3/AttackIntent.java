package academy.pocu.comp2500.assignment3;

public class AttackIntent {
    private IntVector2D vector2D;
    private int damage;
    private Unit attacker;

    public AttackIntent(IntVector2D vector2D, int damage, Unit attacker) {
        this.vector2D = vector2D;
        this.damage = damage;
        this.attacker = attacker;
    }

    public IntVector2D getVector2D() {
        return this.vector2D;
    }

    public int getDamage() {
        return this.damage;
    }

    public Unit getAttacker() {
        return this.attacker;
    }
}