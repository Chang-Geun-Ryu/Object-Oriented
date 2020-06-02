package academy.pocu.comp2500.lab5;

public class Move {
    private String skillName;
    private int skillPower;
    private int skillPoint;
    private int maxSkillPoint;

    public Move(String name, int power, int point) {
        this.skillName = name;
        this.skillPower = power;
        this.skillPoint = point;
        this.maxSkillPoint = point;
    }

    public String getSkillName() {
        return this.skillName;
    }

    public int getSkillPower() {
        return this.skillPower;
    }

    public int getSkillPoint() {
        return this.skillPoint;
    }

    public void increaseSkillPoint() {
        if (this.maxSkillPoint > this.skillPoint) {
            ++this.skillPoint;
        }
    }

    public void useSkillPoint() {
        --this.skillPoint;
    }
}
