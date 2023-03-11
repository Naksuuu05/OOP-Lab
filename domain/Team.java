package domain;

import java.util.*;

public class Team {

    private String teamID;
    private String teamName;
    private Integer totalKills;
    private ArrayList<Warrior> warriorArrayList;

    public Team(String teamID, String teamName, Integer totalKills, ArrayList<Warrior> warriorArrayList) {
        this.teamID = teamID;
        this.teamName = teamName;
        this.totalKills = totalKills;
        this.warriorArrayList = warriorArrayList;
    }

    public String getTeamID() {
        return this.teamID;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public Integer getTotalKills() {
        return this.totalKills;
    }

    public ArrayList<Warrior> getWarriorArrayList() {
        return this.warriorArrayList;
    }

    @Override
    public String toString() {
        String teamInfo = "Team ID: " + this.teamID + "\n"
                      + "Team Name:" + this.teamName + "\n"
                      + "Total Kill: " + this.totalKills + "\n";

        for (Warrior warrior : warriorArrayList) {
            teamInfo += "\t" + warrior.showWarriorAndKills() + "\n";
        }

        return teamInfo;
    }
}