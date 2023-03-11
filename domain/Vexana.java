package domain;

public class Vexana implements Warrior {

    private String warriorCode;
    private String weapon;
    private Integer bombsLeft;
    private Integer noOfKills;

    public Vexana(){

    }
    public Vexana(String warriorCode, Integer bombsLeft, Integer noOfKills) {
        this.warriorCode = warriorCode;
        this.weapon = "Bombs";
        this.bombsLeft = bombsLeft;
        this.noOfKills = noOfKills;
    }

    public String getWarriorCode() {
        return warriorCode;
    }

    public String getWeapon() {
        return weapon;
    }

    public Integer getBombsLeft() {
        return bombsLeft;
    }

    public Integer getNoOfKills() {
        return noOfKills;
    }

    @Override
    public String showWarriorAndKills() {
        String output = "Vexana is using " + this.weapon
                      + "! has " + this.bombsLeft + " bombs left"
                      + " and killed " + this.noOfKills;
        return output;
    }

}