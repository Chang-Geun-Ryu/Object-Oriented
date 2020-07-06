package academy.pocu.comp2500.assignment3;

import java.util.ArrayList;
import java.util.Objects;

public final class SimulationManager {
    private static SimulationManager instance = new SimulationManager();
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
        for (Unit unit: this.spawnUnits) {
            for (int i = this.thinkableUnits.size() -1; i >= 0; --i) {
                if (unit.hashCode() != this.thinkableUnits.get(i).hashCode()) {
                    this.thinkableUnits.remove(i);
                }
            }
            for (int i = this.movableUnits.size() -1; i >= 0; --i) {
                if (unit.hashCode() != this.movableUnits.get(i).hashCode()) {
                    this.movableUnits.remove(i);
                }
            }
            for (int i = this.collisionUnits.size() -1; i >= 0; --i) {
                if (unit.hashCode() != this.collisionUnits.get(i).hashCode()) {
                    this.collisionUnits.remove(i);
                }
            }
        }

        for (IThinkable unit: this.thinkableUnits) {
//            Unit u = (Unit) unit;
//            if (u.isSpawn()) {
                unit.think();
//            }
        }

        this.thinkableUnits.clear();

        for (IMovable unit: this.movableUnits) {
//            Unit u = (Unit) unit;
//            if (u.isSpawn()) {
                unit.move();
//            }
        }

        this.movableUnits.clear();

        for (ICollisionEventable unit: this.collisionUnits) {

        }

        this.collisionUnits.clear();
    }

    @Override
    public int hashCode() {
        return System.identityHashCode(this);
    }

}