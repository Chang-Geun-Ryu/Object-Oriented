package academy.pocu.comp2500.lab5;

import java.util.HashMap;

public class Gladiator extends Barbarian {
    private HashMap<String, Move> skills;

    public Gladiator(String name, int maxHp, int attack, int defense) {
        super(name, maxHp, attack, defense);
        this.skills = new HashMap<>();
    }

    public void rest() {
        if (super.maxHp > this.getHp() + 10) {
            this.hp += 10;
        } else {
            this.hp = this.maxHp;
        }

        this.skills
                .entrySet()
                .stream()
                .forEach(e-> e.getValue().increaseSkillPoint());
    }

    public boolean addMove(Move move) {
        if (this.skills.get(move.getSkillName()) != null) {
            return false;
        }

        if (this.skills.size() >= 4) {
            return false;
        }

        this.skills.put(move.getSkillName(), move);
        return true;
    }

    public boolean removeMove(String skillName) {
        Move move = this.skills.remove(skillName);

        return move != null;
    }

    public void attack(String skillName, Barbarian enemy) {
        Move skill = getSkill(skillName);
        if (enemy == this || skill == null) {
            return;
        }

        if (skill.getSkillPoint() <= 0) {
            return;
        }

        int damage = (int)(((double)this.attack / (double)enemy.defense * skill.getSkillPower()) / 2.0);

        if (damage <= 1) {
            damage = 1;
        }

        skill.useSkillPoint();
        enemy.hp = enemy.hp - damage > 0 ? enemy.hp - damage : 0;
    }

    private Move getSkill(String skillName) {
        return this.skills.get(skillName);
    }
}
