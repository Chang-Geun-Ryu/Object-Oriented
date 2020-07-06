package academy.pocu.comp2500.assignment3;

import java.util.ArrayList;
import java.util.Objects;

public final class SimulationManager {
    private static SimulationManager instance;// = new SimulationManager();
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


    public static synchronized SimulationManager getInstance() {
        if (instance == null) {
            instance = new SimulationManager();
        }
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
        if (this.spawnUnits == null && this.spawnUnits.size() <= 0) {
            return;
        }

        this.thinkableUnits.clear();
        this.movableUnits.clear();
        this.collisionUnits.clear();

        if (this.spawnUnits.size() > 0) {
            this.thinkableUnits.addAll(this.spawnUnits);
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
            AttackIntent intent = unit.attack();
            int aoe = intent.getAttacker().getAoe();
            intent.getDamage();
            unit.event();
        }

        this.collisionUnits.clear();
    }

    @Override
    public int hashCode() {
        return System.identityHashCode(this);
    }

}