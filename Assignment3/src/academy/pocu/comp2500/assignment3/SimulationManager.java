package academy.pocu.comp2500.assignment3;

import java.util.ArrayList;

public final class SimulationManager {
    private static final SimulationManager instance = new SimulationManager();
    private ArrayList<Unit> spawnUnits;
    private ArrayList<Unit> thinkableUnits;
    private ArrayList<Unit> movableUnits;
    private ArrayList<Unit> collisionUnits;

    private SimulationManager() {
        this.spawnUnits = new ArrayList<>();
        this.thinkableUnits = new ArrayList<>();
        this.movableUnits = new ArrayList<>();
        this.collisionUnits = new ArrayList<>();
    }

    public static SimulationManager getInstance() {
        return instance;
    }

    public ArrayList<Unit> getUnits() {
        return this.spawnUnits;
    }

    public void spawn(Unit unit) {
        unit.onSpawn();
        this.spawnUnits.add(unit);
    }

    public void registerThinkable(Unit thinkable) {
        this.thinkableUnits.add(thinkable);
    }

    public void registerMovable(Unit movable) {
        this.movableUnits.add(movable);
    }

    public void registerCollisionEventListener(Unit listener) {
        this.collisionUnits.add(listener);
    }

    public void update() {
        for (Unit unit: this.thinkableUnits) {
            unit.think();
        }

        this.thinkableUnits.removeAll(this.thinkableUnits);

        for (Unit unit: this.movableUnits) {
            unit.move();
        }

        this.movableUnits.removeAll(this.movableUnits);

        for (Unit unit: this.collisionUnits) {

        }

        this.collisionUnits.removeAll(this.collisionUnits);
    }
}