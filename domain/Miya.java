package domain;

public class Miya implements Warrior {
    private String warriorCode;
    private String weapon;
    private Integer arrowsLeft;
    private Integer noOfKills;

    public Miya(){

    }

    public Miya(String warriorCode, Integer arrowsLeft, Integer noOfKills) {
        this.warriorCode = warriorCode;
        this.weapon = "Archery";
        this.arrowsLeft = arrowsLeft;
        this.noOfKills = noOfKills;
    }

    public String getWarriorCode() {
        return this.warriorCode;
    }

    public String getWeapon() {
        return this.weapon;
    }

    public Integer getArrowsLeft() {
        return this.arrowsLeft;
    }

    public Integer getNoOfKills() {
        return this.noOfKills;
    }

    @Override
    public String showWarriorAndKills() {
        String output = "Miya is using " + this.weapon
                + "! has " + this.arrowsLeft + " arrows left"
                + " and killed " + this.noOfKills;
        return output;
    }

}