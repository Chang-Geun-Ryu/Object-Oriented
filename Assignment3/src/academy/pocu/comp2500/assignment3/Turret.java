package academy.pocu.comp2500.assignment3;

public class Turret extends Unit {
    public Turret(IntVector2D vector2D) {
        super(vector2D, 99, 'U', UnitKind.Land, 2, 0, 7, Target.AIR);
    }
}
