package academy.pocu.comp2500.assignment3;

import java.util.ArrayList;

public final class SimulationManager {
    static private SimulationManager instance;
    private ArrayList<Unit> spawnUnits;
    private ArrayList<Unit> thinkableUnits;
    private ArrayList<Unit> movableUnits;

    private SimulationManager() {
        this.spawnUnits = new ArrayList<>();
        this.thinkableUnits = new ArrayList<>();
        this.movableUnits = new ArrayList<>();
    }

    public static SimulationManager getInstance() {
        if (instance != null) {
            return instance;
        } else {
            return new SimulationManager();
        }
    }

    public ArrayList<Unit> getUnits() {
        return this.spawnUnits;
    }

    public void spawn(Unit unit) {
        unit.onSpawn();
        this.spawnUnits.add(unit);
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