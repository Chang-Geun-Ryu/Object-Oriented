package academy.pocu.comp2500.assignment3;

import java.util.ArrayList;

public final class SimulationManager {
    static private SimulationManager instance;

    private SimulationManager() {
    }

    public static SimulationManager getInstance() {
        if (instance != null) {
            return instance;
        } else {
            return new SimulationManager();
        }
    }

    public ArrayList<Unit> getUnits() {
        return null;
    }

    public void spawn(Unit unit) {

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