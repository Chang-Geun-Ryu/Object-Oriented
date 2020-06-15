package academy.pocu.comp2500.assignment3;

public class Wraith extends Unit {

    public Wraith(IntVector2D vector2D) {
        super(vector2D, 80, 'W', UnitKind.AIR, 4, 0, 6, Target.BOTH);
    }
}
