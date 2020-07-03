package academy.pocu.comp2500.assignment3;


public abstract class Unit {
    private final char sign;
    private final UnitKind unitKind;
    private int vision;
    private int aoe;
    private int ap;
    protected final Target target;

    private int hp;
    protected IntVector2D vector2D;
    protected AttackIntent attackIntent;

    private boolean isSpawn;

    protected Unit(IntVector2D vector2D, int hp, char sign, UnitKind unitKind, int vision, int aoe, int ap, Target target) {
        this.vector2D = vector2D;
        this.sign = sign;
        this.unitKind = unitKind;
        this.vision = vision;
        this.aoe = aoe;
        this.ap = ap;
        this.target = target;
        this.hp = hp;
        this.attackIntent = new AttackIntent(vector2D, ap, this);

        this.isSpawn = false;
    }

    public final IntVector2D getPosition() {
        return this.vector2D;
    }

    public final int getHp() {
        return this.hp;
    }

    public final AttackIntent attack() {
        return this.attackIntent;
    }

    public final void onAttacked(int damage) {
        if (this.hp - damage < 0) {
            this.hp = 0;
        } else {
            this.hp -= damage;
        }
    }

    public final void onSpawn() {
        this.isSpawn = true;
    }

    public final char getSymbol() {
        return this.sign;
    }

    protected void think() {

    }

    protected void move() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !(o instanceof Unit)) {
            return false;
        }
        Unit uint = (Unit) o;
        return this == uint;
    }

    @Override
    public int hashCode() {
        return System.identityHashCode(this);
    }

}