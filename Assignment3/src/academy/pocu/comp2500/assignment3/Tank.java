package academy.pocu.comp2500.assignment3;

import java.util.ArrayList;

public class Tank extends Unit implements IMovable {
    private boolean siege;
    private boolean direction;

    public Tank(IntVector2D vector2D) {
        super(vector2D, 85, 'T', UnitKind.LAND, 3, 1, 8, Target.LAND);
        this.siege = false;
        this.direction = false;

        this.pos = new ArrayList<>();
        this.pos.add(new IntVector2D(0, -2));
        this.pos.add(new IntVector2D(1, -2));
        this.pos.add(new IntVector2D(2, -1));

        this.pos.add(new IntVector2D(2, 0));
        this.pos.add(new IntVector2D(2, 1));
        this.pos.add(new IntVector2D(1, 2));

        this.pos.add(new IntVector2D(0, 2));
        this.pos.add(new IntVector2D(-1, 2));
        this.pos.add(new IntVector2D(-2, 1));

        this.pos.add(new IntVector2D(-2, 0));
        this.pos.add(new IntVector2D(-2, -1));
        this.pos.add(new IntVector2D(-1, -2));

    }

    @Override
    public void onAttacked(int damage) {
        super.onAttacked(damage * (this.siege ? 2 : 1));
    }

    @Override
    public void think() {
        if (this.getHp() == 0) {
            return;
        }
        ArrayList<Unit> findedUnits = getFindUnits();
        Unit attack = canAttack(findedUnits);

        if (attack != null) {    // attack
            if (this.siege) {
                addAttack(attack);
            } else {
                this.siege = true;
            }
        } else if (findedUnits.size() > 0) { // siege
            this.siege = true;
        } else {    // move
            if (this.siege) {
                this.siege = false;
            } else { // move
                if (this.vector2D.getX() == 0 || this.vector2D.getX() == 15) {
                    this.direction = !this.direction;
                }
                int x = this.vector2D.getX() + (this.direction ? -1 : 1);
                int y = this.vector2D.getY();
                addMove(new IntVector2D(x, y));
            }
        }
    }

    protected void addMove(IntVector2D vector2D) {
        this.movePos = vector2D;//new IntVector2D(vector2D.getX() + this.vector2D.getX(), vector2D.getY() + this.vector2D.getY());
        SimulationManager.getInstance().registerMovable(this);
    }

    @Override
    public void move() {
        if (this.movePos != null) {
            this.vector2D = this.movePos;
            this.movePos = null;
        }
    }
}
