package academy.pocu.comp2500.assignment3;

import java.util.ArrayList;

public class SmartMine extends Mine {

    public SmartMine(IntVector2D vector2D, int pushCount, int detectUnitCount) {
        super(vector2D, pushCount, detectUnitCount);
    }

    @Override
    public void think() {
        if (this.getHp() == 0) {
            return;
        }

        ArrayList<Unit> findedUnits = getFindUnits();

//        detectUnitCount = detectUnitCount - findedUnits.size() >= 0 ? detectUnitCount - findedUnits.size() : 0;

        if (this.detectUnitCount <= findedUnits.size()) {
            this.detectUnitCount = 0;
        }

        for (Unit unit : findedUnits) {
            if (calcDistance(unit.vector2D) == 0) {
                this.pushCount = this.pushCount - 1 >= 0 ? this.pushCount: 0;
            }
        }

        if (this.pushCount == 0 || this.detectUnitCount == 0) {
            addAttack(this);
        }
    }

}
