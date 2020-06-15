package academy.pocu.comp2500.assignment3;

import java.util.HashSet;

public class Unit {
    protected final char sign;
    protected final UnitKind unitKind;
    protected int vision;
    protected int aoe;
    protected int ap;
    protected final Target target;

    protected int hp;
    protected IntVector2D vector2D;

    protected Unit(IntVector2D vector2D, int hp, char sign, UnitKind unitKind, int vision, int aoe, int ap, Target target) {
        this.vector2D = vector2D;
        this.sign = sign;
        this.unitKind = unitKind;
        this.vision = vision;
        this.aoe = aoe;
        this.ap = ap;
        this.target = target;
        this.hp = hp;
    }

    public IntVector2D getPosition() {
        return this.vector2D;
    }

    public int getHp() {
        return this.hp;
    }

    public AttackIntent attack() {
        return null;
    };

    public void onAttacked(int damage) {

    };

    public void onSpawn() {

    };

    public char getSymbol() {
        return this.sign;
    };
}