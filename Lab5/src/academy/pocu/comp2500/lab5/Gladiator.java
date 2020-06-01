package academy.pocu.comp2500.lab5;

import java.util.ArrayList;
import java.util.Optional;

public class Gladiator extends Barbarian {
    private ArrayList<Move> skills;

    public Gladiator(String name, int maxHp, int attack, int defense) {
        super(name, maxHp, attack, defense);
        this.skills = new ArrayList<>();
    }

    public void rest() {
        this.hp += 10;
        this.skills
                .stream()
                .forEach(e-> e.increaseSkillPoint());
    }

    public boolean addMove(Move move) {
        if (this.skills.size() >= 4) {
            return false;
        }

        int isEqual = (int) this.skills
                .stream()
                .filter(e-> e.getSkillName() == move.getSkillName())
                .count();

        if (isEqual > 0) {
            return false;
        }

        this.skills.add(move);

        return true;
    }

    public boolean removeMove(String skillName) {
        Optional<Move> remove = this.skills
                .stream()
                .filter(e-> e.getSkillName() == skillName)
                .findFirst();

        if (remove.isEmpty()) {
            return false;
        }

        this.skills.remove(remove.get());

        return true;
    }

    public void attack(String skillName, Barbarian enemy) {

        Move skill = getSkill(skillName);
        if (skill == null) {
            return;
        }

        if (skill.getSkillPoint() <= 0) {
            return;
        }

        int damage = (int)(((double)this.getAttack() / (double)enemy.getDefense() * skill.getSkillPower()) / 2.0);

        if (damage <= 1) {
            damage = 1;
        }

        skill.useSkillPoint();
        enemy.setDamage(damage);
    }



    private Move getSkill(String skillName) {
        Optional<Move> remove = this.skills
                .stream()
                .filter(e-> e.getSkillName() == skillName)
                .findFirst();

        if (remove.isEmpty()) {
            return null;
        } else {
            return remove.get();
        }
    }
}
