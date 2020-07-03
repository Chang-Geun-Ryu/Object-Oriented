package academy.pocu.comp2500.assignment3;

public class Tank extends Unit {
    private boolean siege;

    public Tank(IntVector2D vector2D) {
        super(vector2D, 85, 'T', UnitKind.Land, 3, 1, 8, Target.LAND);
        this.siege = false;
    }

    public void instro() {
        System.out.println("instro");
    }

}
