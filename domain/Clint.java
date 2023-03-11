package domain;

public class Clint implements Warrior {
    private String warriorCode;
    private String weapon;
    private Integer bulletsLeft;
    private Integer noOfKills;

    public Clint(){

    }
    public Clint(String warriorCode, Integer bulletsLeft, Integer noOfKills) {
        this.warriorCode = warriorCode;
        this.weapon = "Guns";
        this.bulletsLeft = bulletsLeft;
        this.noOfKills = noOfKills;
    }

    public String getWarriorCode() {
        return this.warriorCode;
    }

    public String getWeapon() {
        return this.weapon;
    }

    public Integer getBulletsLeft() {
        return this.bulletsLeft;
    }

    public Integer getNoOfKills() {
        return this.noOfKills;
    }
    @Override
    public String showWarriorAndKills() {
        String output = "Clint is using " + this.weapon
                      + "! has " + this.bulletsLeft + " bullets left"
                      + " and killed " + this.noOfKills;
        return output;
    }
}