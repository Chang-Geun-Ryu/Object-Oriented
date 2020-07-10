package academy.pocu.comp2500.assignment3;

public class Mine extends Unit implements ICollisionEventable {
    private int pushCount;
    private int detectUnitCount;


    public Mine(IntVector2D vector2D, int pushCount) {
        super(vector2D, 1, 'N', UnitKind.LAND, 0, 0, 10, Target.LAND);
        this.pushCount = pushCount;
    }

    protected Mine(IntVector2D vector2D, int pushCount, int detectUnitCount) {
        super(vector2D, 1, 'A', UnitKind.LAND, 1, 1, 15, Target.LAND);
        this.detectUnitCount = detectUnitCount;
        this.pushCount = pushCount;
    }


    private boolean detectUnit() {

    }

    @Override
    public void collisionEvent() {

    }
}
