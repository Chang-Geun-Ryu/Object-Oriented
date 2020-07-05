package academy.pocu.comp2500.assignment3;

public class Mine extends Unit {
    private int pushCount;
    private int detectUnitCount;


    public Mine(IntVector2D vector2D, int pushCount) {
        super(vector2D, 1, 'N', UnitKind.Land, 0, 0, 10, Target.LAND);
        this.pushCount = pushCount;
    }

    protected Mine(IntVector2D vector2D, int pushCount, int detectUnitCount) {
        super(vector2D, 1, 'A', UnitKind.Land, 1, 1, 15, Target.LAND);
        this.detectUnitCount = detectUnitCount;
        this.pushCount = pushCount;
    }
}
