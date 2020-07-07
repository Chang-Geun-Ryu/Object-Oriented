package academy.pocu.comp2500.assignment3;

import java.util.ArrayList;
import java.util.PrimitiveIterator;

public class Marine extends Unit implements IMovable {


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

    protected void addMove(IntVector2D vector2D) {
        this.movePos = vector2D;//new IntVector2D(vector2D.getX() + this.vector2D.getX(), vector2D.getY() + this.vector2D.getY());
        SimulationManager.getInstance().registerMovable(this);
    }

    @Override
    public void think() {
        if (this.getHp() == 0) {
            return;
        }
        ArrayList<Unit> findedUnits = getFindUnits();
        Unit attack = canAttack(findedUnits);

        if (attack != null) {    // attack
            addAttack(attack);
        } else if (findedUnits.size() > 0) { // move
            if (findedUnits.size() > 1) {
                int min = Integer.MAX_VALUE;
                for (Unit unit : findedUnits) {
                    if (min > calcDistance(unit.vector2D)) {
                        min = calcDistance(unit.vector2D);
                    }
                }

                for (int i = findedUnits.size() - 1; i >= 0; --i) {
                    if (calcDistance(findedUnits.get(i).vector2D) != min) {
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

//        for (IntVector2D pos : this.move) {
//            int x = this.vector2D.getX() + pos.getX();
//            int y = this.vector2D.getY() + pos.getY();
//            IntVector2D targetPos = new IntVector2D(x, y);
//            for (Unit unit : units) {
//                if (unit.vector2D.hashCode() == targetPos.hashCode()) {
//                    int diffY = this.vector2D.getY() - pos.getY();
//                    int diffX = this.vector2D.getX() - pos.getX();
//                    return unit.vector2D;
//                }
//            }
//        }
//        return null;
        Unit target = units.get(0);
        double max = Math.toDegrees(Math.atan2(units.get(0).vector2D.getX(), units.get(0).vector2D.getY()));
        for (Unit unit : units) {
            if (max < Math.toDegrees(Math.atan2(unit.vector2D.getX(), unit.vector2D.getY()))) {
                max = Math.toDegrees(Math.atan2(unit.vector2D.getX(), unit.vector2D.getY()));
                target = unit;
            }
        }

        return target.vector2D;
    }

    @Override
    public void move() {
        if (this.movePos != null) {
            this.vector2D = this.movePos;
            this.movePos = null;
        }
    }

    @Override
    public void event() {
        if (attack() != null) {

        }
    }

    private IntVector2D toMove(IntVector2D vector2D) {
        if (vector2D.getY() == this.vector2D.getY()) {
            int x = this.vector2D.getX() < vector2D.getX() ? 1 : -1;
            return new IntVector2D(this.vector2D.getX() + x, this.vector2D.getY());
        } else {
            int y = this.vector2D.getY() < vector2D.getY() ? 1 : -1;
            return new IntVector2D(this.vector2D.getX(), this.vector2D.getY() + y);
        }
    }
}
