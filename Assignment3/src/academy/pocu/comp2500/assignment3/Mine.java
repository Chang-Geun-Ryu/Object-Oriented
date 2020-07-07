package academy.pocu.comp2500.assignment3;

import java.util.ArrayList;

public class Mine extends Unit {
    private int pushCount;
    private int detectUnitCount;


    public Mine(IntVector2D vector2D, int pushCount) {
        super(vector2D, 1, 'N', UnitKind.UNDER, 0, 0, 10, Target.LAND);
        this.pushCount = pushCount;
    }

    protected Mine(IntVector2D vector2D, int pushCount, int detectUnitCount) {
        super(vector2D, 1, 'A', UnitKind.UNDER, 1, 1, 15, Target.LAND);
        this.detectUnitCount = detectUnitCount;
        this.pushCount = pushCount;
    }

    @Override
    public void think() {
        if (this.getHp() == 0) {
            return;
        }

        ArrayList<Unit> findedUnits = getFindUnits();

//        if ()

    }
}
