package academy.pocu.comp2500.assignment3;

import java.util.ArrayList;

public class Marine extends Unit {
    ArrayList<IntVector2D> pos;

    public Marine(IntVector2D vector2D) {
        super(vector2D, 35, 'M', UnitKind.LAND, 2, 0, 6, Target.BOTH);
    }
}
