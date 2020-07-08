package academy.pocu.comp2500.assignment3;

import java.util.ArrayList;

public class Mine extends Unit {
    protected int pushCount;
    protected int detectUnitCount;

    public Mine(IntVector2D vector2D, int pushCount) {
        super(vector2D, 1, 'N', UnitKind.UNDER, 0, 0, 10, Target.LAND);
        this.pushCount = pushCount;
    }

    protected Mine(IntVector2D vector2D, int pushCount, int detectUnitCount) {
        super(vector2D, 1, 'A', UnitKind.UNDER, 1, 1, 15, Target.LAND);
        this.pushCount = pushCount;
        this.detectUnitCount = detectUnitCount;
    }

    @Override
    public void onAttacked(int damage) {
        if (this.hp == 1) {
            this.hp = 0;
            addAttack(this);
        }
    }

    @Override
    public void event() {
        if (this.getHp() == 0) {
            return;
        }

//        this.hp = 0;
        detect();
    }

    @Override
    public void think() {
        if (this.getHp() == 0) {
            return;
        }

//        detect();
    }

    protected void detect() {
        ArrayList<Unit> findedUnits = getFindUnits();

        pushCount = pushCount - findedUnits.size() >= 0 ? pushCount - findedUnits.size() : 0;

        if (pushCount == 0) {
            for (Unit u : findedUnits) {
                u.onAttacked(this.ap);
            }
            this.hp = 0;
        }
    }
}
