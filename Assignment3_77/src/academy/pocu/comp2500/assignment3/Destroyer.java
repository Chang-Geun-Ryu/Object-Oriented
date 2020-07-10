package academy.pocu.comp2500.assignment3;

public class Destroyer extends Unit {
    public Destroyer(IntVector2D vector2D) {
        super(vector2D, 100, 'D', null, -1, -1, -1, null);
    }

    @Override
    public void think() {

    }

    @Override
    public void onAttacked(int damage) {
        if (this.hp >= 0) {
            this.hp -= 1;
        } else {
            this.hp = 0;
        }
    }
}
