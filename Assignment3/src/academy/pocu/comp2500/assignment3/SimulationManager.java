package academy.pocu.comp2500.assignment3;

import java.util.ArrayList;

public final class SimulationManager {
    static private SimulationManager instance;
    private ArrayList<Unit> units;

    private SimulationManager() {
        this.units = new ArrayList<>();
    }

    public static SimulationManager getInstance() {
        if (instance != null) {
            return instance;
        } else {
            return new SimulationManager();
        }
    }

    public ArrayList<Unit> getUnits() {
        return this.units;
    }

    public void spawn(Unit unit) {
        this.units.add(unit);
    }

    public void registerThinkable(Unit thinkable) {

    }

    public void registerMovable(Unit movable) {

    }

    public void registerCollisionEventListener(Unit listener) {

    }

    public void update() {

    }
}