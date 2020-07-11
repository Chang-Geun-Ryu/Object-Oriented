package academy.pocu.comp2500.assignment3;

public class Tank extends Unit implements IMovable {
    private boolean siege;

    public Tank(IntVector2D vector2D) {
        super(vector2D, 85, 'T', UnitKind.LAND, 3, 1, 8, Target.LAND);
        this.siege = false;
    }

    @Override
    public void onSpawn() {
        SimulationManager.getInstance().registerThinkable(this);
        SimulationManager.getInstance().registerMovable(this);
    }

    @Override
    public void move() {

    }

    @Override
    public void think() {

    }
}
