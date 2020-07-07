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

            if (aoe == 0) {
                attackPos(intent.getAttacker(), intent.getVector2D(), intent.getDamage());
            } else if (aoe > 0) {

                for (int i = -aoe; i <= aoe; ++i) {
                    for (int j = -aoe; j <= aoe; ++j) {
                        int x = intent.getVector2D().getX() + i;
                        int y = intent.getVector2D().getY() + j;

                        int aoeValue = Math.abs(i) <= Math.abs(j) ? Math.abs(j) : Math.abs(i);
                        int damage = aoeDamage(aoeValue, intent.getDamage());
                        attackPos(intent.getAttacker(), new IntVector2D(x, y), damage);
                    }
                }
            } else {
                // negative
            }

            unit.event();
        }

        for (int i = this.spawnUnits.size() - 1; i >= 0; --i) {
            if (this.spawnUnits.get(i).getHp() <= 0) {
                this.spawnUnits.remove(i);
            }
        }

        this.collisionUnits.clear();
    }

    private void attackPos(Unit attacker, IntVector2D vector2D, int damage) {
        for (Unit u : this.spawnUnits) {
            if (u.getPosition().hashCode() == vector2D.hashCode()) {
                if (u.hashCode() != attacker.hashCode()) {
                    if (isAttack(attacker, u)) {
                        u.onAttacked(damage);
                    }
                }
            }
        }
    }

    private boolean isAttack(Unit attacker, Unit unit) {
        if (attacker.getTarget() == Target.LAND) {
            return unit.getUnitKind() == UnitKind.LAND;
        } else if (attacker.getTarget() == Target.AIR) {
            return unit.getUnitKind() == UnitKind.AIR;
        } else {
            return unit.getUnitKind() != UnitKind.UNDER;
        }

    }

    private int aoeDamage(int aoe, int damage) {
        int aoeDamage = (int)((double)damage * (1.d - (1.d / (double)(aoe + 1))));
        return aoeDamage;
    }

    @Override
    public int hashCode() {
        return System.identityHashCode(this);
    }

}