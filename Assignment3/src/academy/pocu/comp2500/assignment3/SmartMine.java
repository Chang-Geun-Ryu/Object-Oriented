package academy.pocu.comp2500.assignment3;

import java.util.ArrayList;

public class SmartMine extends Mine {
    private int detectUnitCount;
    public SmartMine(IntVector2D vector2D, int pushCount, int detectUnitCount) {
        super(vector2D, pushCount);
        this.detectUnitCount = detectUnitCount;
    }

    @Override
    public void think() {
        if (this.getHp() == 0) {
            return;
        }

        ArrayList<Unit> findedUnits = getFindUnits();

        detectUnitCount = detectUnitCount - findedUnits.size() >= 0 ? detectUnitCount - findedUnits.size() : 0;

        for (Unit unit : findedUnits) {
            if (calcDistance(unit.vector2D) == 0) {
                pushCount = pushCount - 1 >= 0 ? pushCount: 0;
            }
        }

        if (pushCount == 0 || detectUnitCount == 0) {
            addAttack(this);
        }
    }
}
