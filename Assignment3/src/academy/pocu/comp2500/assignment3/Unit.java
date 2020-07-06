package academy.pocu.comp2500.assignment3;


import java.util.ArrayList;

public abstract class Unit implements IThinkable, ICollisionEventable {
    private final char sign;
    private final UnitKind unitKind;
    private int vision;
    private int aoe;
    protected int ap;
    protected final Target target;

    private int hp;
    protected IntVector2D vector2D;
    protected AttackIntent attackIntent;
    protected IntVector2D movePos;

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

        this.movePos = null;
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

    public final boolean isSpawn() {
        return this.isSpawn;
    }

    protected ArrayList<Unit> weekUnits(ArrayList<Unit> units) {
        int hp = Integer.MAX_VALUE;
        for (Unit unit : units) {
            if (unit.hp < hp) {
                hp = unit.hp;
            }
        }

        return units;
    }

    protected ArrayList<Unit> getFindUnits() {
        SimulationManager manager = SimulationManager.getInstance();

        ArrayList<Unit> findUnit = new ArrayList<>();
        for (Unit unit : manager.getUnits()) {
            if (canSeeUnit(unit.vector2D) && canFindUnit(unit.unitKind) && this.hashCode() != unit.hashCode()) {
                findUnit.add(unit);
            }
        }

        return findUnit;
    }

    protected int calcDistance(IntVector2D vector2D) {
        return Math.abs(this.vector2D.getX() - vector2D.getX()) + Math.abs(this.vector2D.getY() - vector2D.getY());
    }

    protected boolean canSeeUnit(IntVector2D vector2D) {

        int x = Math.abs(this.vector2D.getX() - vector2D.getX());
        int y = Math.abs(this.vector2D.getY() - vector2D.getY());

        if (x <= this.vision && y <= this.vision) {
            return true;
        }

        return false;
    }

    private boolean canFindUnit(UnitKind kind) {
        boolean find = true;

        if (this.target == Target.LAND) {
            find = kind == UnitKind.LAND;
        } else if (this.target == Target.AIR) {
            find = kind == UnitKind.AIR;
        }

        return find;
    }

    @Override
    public void think() {

    }

    @Override
    public void event() {

    }

    @Override
    public int hashCode() {
        return System.identityHashCode(this);
    }

}