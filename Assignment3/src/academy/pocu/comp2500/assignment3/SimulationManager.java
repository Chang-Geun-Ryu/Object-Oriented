package academy.pocu.comp2500.assignment3;

import java.util.ArrayList;

public final class SimulationManager {
    private static final SimulationManager instance = new SimulationManager();
    private ArrayList<Unit> spawnUnits;
    private ArrayList<IThinkable> thinkableUnits;
    private ArrayList<IMovable> movableUnits;
    private ArrayList<ICollisionEventable> collisionUnits;

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

    public void registerThinkable(IThinkable thinkable) {
        this.thinkableUnits.add(thinkable);
    }

    public void registerMovable(IMovable movable) {
        this.movableUnits.add(movable);
    }

    public void registerCollisionEventListener(ICollisionEventable listener) {
        this.collisionUnits.add(listener);
    }

    public void update() {
    }
}