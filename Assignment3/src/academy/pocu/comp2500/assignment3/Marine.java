package academy.pocu.comp2500.assignment3;

import java.util.ArrayList;
import java.util.PrimitiveIterator;

public class Marine extends Unit implements IMovable {
    ArrayList<IntVector2D> pos;
    ArrayList<IntVector2D> move;

    public Marine(IntVector2D vector2D) {
        super(vector2D, 35, 'M', UnitKind.LAND, 2, 0, 6, Target.BOTH);
        this.pos = new ArrayList<>();
        this.pos.add(new IntVector2D(0, 0));
        this.pos.add(new IntVector2D(0, -1));
        this.pos.add(new IntVector2D(1, 0));
        this.pos.add(new IntVector2D(0, 1));
        this.pos.add(new IntVector2D(-1, 0));

        this.move = new ArrayList<>();
        this.move.add(new IntVector2D(0, -2));
        this.move.add(new IntVector2D(1, -1));
        this.move.add(new IntVector2D(2, 0));
        this.move.add(new IntVector2D(1, 1));
        this.move.add(new IntVector2D(0, 2));
        this.move.add(new IntVector2D(-1, 1));
        this.move.add(new IntVector2D(-2, 0));
        this.move.add(new IntVector2D(-1, -1));

        this.move.add(new IntVector2D(1, -2));
        this.move.add(new IntVector2D(2, -1));
        this.move.add(new IntVector2D(2, 1));
        this.move.add(new IntVector2D(1, 2));
        this.move.add(new IntVector2D(-1, 2));
        this.move.add(new IntVector2D(-2, -1));
        this.move.add(new IntVector2D(-2, -1));
        this.move.add(new IntVector2D(-1, -2));

        this.move.add(new IntVector2D(2, -2));
        this.move.add(new IntVector2D(2, 2));
        this.move.add(new IntVector2D(-2, 2));
        this.move.add(new IntVector2D(-2, -2));
    }

    private void addAttack(IntVector2D vector2D) {
        this.attackIntent = new AttackIntent(vector2D, this.ap, this);
        SimulationManager.getInstance().registerCollisionEventListener(this);
    }

    private void addMove(IntVector2D vector2D) {
        this.movePos = vector2D;
        SimulationManager.getInstance().registerMovable(this);
    }

    @Override
    public void think() {
        ArrayList<Unit> findedUnits = getFindUnits();
        IntVector2D attackPos = canAttack(findedUnits);

        if (attackPos != null) {    // attack
            addAttack(attackPos);
        } else if (findedUnits.size() > 0) { // move
            if (findedUnits.size() > 1) {
                int min = Integer.MAX_VALUE;
                for (Unit unit: findedUnits) {
                    if (min > calcDistance(unit.vector2D)) {
                        min = calcDistance(unit.vector2D);
                    }
                }

                for (int i = findedUnits.size() - 1; i >= 0; --i) {
                    if (findedUnits.get(i).getHp() != min) {
                        findedUnits.remove(i);
                    }
                }

                if (findedUnits.size() > 1) {
                    IntVector2D move = getPriority(findedUnits);
                    move = toMove(move);
                    addMove(move);
                } else if (findedUnits.size() == 1) { // move
                    IntVector2D move = toMove(findedUnits.get(0).vector2D);
                    addMove(move);
                } else { // error
                    assert false : "finded unit logic error";
                }

            } else if (findedUnits.size() == 1) { // move
                IntVector2D move = toMove(findedUnits.get(0).vector2D);
                addMove(move);
            } else {    // stay

            }
        }
    }

    private IntVector2D getPriority(ArrayList<Unit> units) {

        for (IntVector2D pos: this.move) {
            for (Unit unit: units) {
                if (unit.vector2D.hashCode() == pos.hashCode()) {
                    return pos;
                }
            }
        }

        return null;
    }

    private IntVector2D canAttack(ArrayList<Unit> units) {

        ArrayList<Unit> attackableUnit = new ArrayList<>();
        // 00, 북, 동, 남, 서
        for (IntVector2D vector2D : this.pos) {
            int x = this.vector2D.getX() + vector2D.getX();
            int y = this.vector2D.getY() + vector2D.getY();
            IntVector2D attackPos = new IntVector2D(x, y);
            for (int i = 0; i < units.size(); ++i) {
                if (attackPos.hashCode() == units.get(i).vector2D.hashCode()) {
                    attackableUnit.add(units.get(i));
                }
            }
        }

        if (attackableUnit.size() == 1) {
            return attackableUnit.get(0).vector2D;
        } else if (attackableUnit.size() > 1) {
            int min = Integer.MAX_VALUE;
            for (Unit unit: attackableUnit) {
                if (min > unit.getHp()) {
                    min = unit.getHp();
                }
            }

            for (int i = units.size() - 1; i >= 0; --i) {
                if (units.get(i).getHp() != min) {
                    units.remove(i);
                }
            }
            // index가 0에 가까울수록 우선순위가 높다,
            // hp가 낮은 유닛만 골라 놨다
            return attackableUnit.get(0).vector2D;
        }

        return null;
    }

    @Override
    public void move() {
        if (this.movePos != null) {
            this.vector2D = this.movePos;
            this.movePos = null;
        }
    }

    private IntVector2D toMove(IntVector2D vector2D) {
        if (vector2D.getY() == this.vector2D.getY()) {
            int x = this.vector2D.getX() < vector2D.getX() ? 1 : -1;
            return new IntVector2D(x, this.vector2D.getY());
        } else {
            int y = this.vector2D.getY() < vector2D.getY() ? 1 : -1;
            return new IntVector2D(this.vector2D.getX(), y);
        }
    }
}
