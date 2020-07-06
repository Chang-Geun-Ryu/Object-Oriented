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

        for (IThinkable unit : this.thinkableUnits) {
            unit.think();

        }

        this.thinkableUnits.clear();

        for (IMovable unit : this.movableUnits) {
            unit.move();
        }

        this.movableUnits.clear();

        for (ICollisionEventable unit : this.collisionUnits) {
            AttackIntent intent = unit.attack();
            int aoe = intent.getAttacker().getAoe();
            intent.getVector2D();
            if (aoe == 0) {
                for (Unit u : this.spawnUnits) {
                    if (u.getPosition().hashCode() == intent.getVector2D().hashCode()) {
                        u.onAttacked(intent.getDamage());
                    }
                }
            } else {
                for (int i = 0; i < aoe; ++i) {
                    for (int x = -i; x <= i; ++x) {
                        for (int y = -i; y <= i; ++y) {
//                        new IntVector2D(intent.getVector2D().getX() + x, intent.getVector2D().getY() + y);
                            for (Unit u : this.spawnUnits) {
                                if (u.getPosition().getX() == intent.getVector2D().getX() + x &&
                                        u.getPosition().getY() == intent.getVector2D().getY() + y) {

                                }
                            }
                        }
                    }
                }
            }


            unit.event();
        }

        for (int i = this.spawnUnits.size() -1; i >= 0; --i) {
            if (this.spawnUnits.get(i).getHp() <= 0) {
                this.spawnUnits.remove(i);
            }
        }

        this.collisionUnits.clear();
    }

    private int aoeDamage(IntVector2D attackPos, IntVector2D aoePos, int damage) {
//        int aoeDamage = 10.d * (1.0d - )
        return 0;
    }

    @Override
    public int hashCode() {
        return System.identityHashCode(this);
    }

}