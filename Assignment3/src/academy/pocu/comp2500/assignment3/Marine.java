package academy.pocu.comp2500.assignment3;

public class Marine extends Unit {
    public Marine(IntVector2D vector2D) {
        super(vector2D, 35, 'M', UnitKind.Land, 2, 0, 6, Target.BOTH);
    }
}
