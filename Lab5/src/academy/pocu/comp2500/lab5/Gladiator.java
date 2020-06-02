package academy.pocu.comp2500.lab5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Optional;

public class Gladiator extends Barbarian {
//    private HashSet<Move> skills;
    private HashMap<String, Move> skills;

    public Gladiator(String name, int maxHp, int attack, int defense) {
        super(name, maxHp, attack, defense);
//        this.skills = new HashSet<>();
        this.skills = new HashMap<>();
    }

    public void rest() {
        if (super.maxHp >=  this.getHp() + 10) {
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
            this.skills.put(move.getSkillName(), move);
        }

        if (this.skills.size() >= 4) {
            return false;
        }

        this.skills.put(move.getSkillName(), move);

//        this.skills.add(move);
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
//        Optional<Move> remove = this.skills
//                .entrySet()
//                .stream()
//                .filter(e-> e.getValue().getSkillName() == skillName)
//                .map(e -> e.getValue())
//                .findFirst();
//
//        if (remove.isEmpty()) {
//            return null;
//        } else {
//            return remove.get();
//        }
    }
}
