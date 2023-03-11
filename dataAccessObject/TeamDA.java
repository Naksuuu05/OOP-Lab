package dataAccessObject;

import domain.*;
import java.io.*;
import java.util.*;

public class TeamDA {
    private ArrayList<Team> teamList;
    public TeamDA() throws FileNotFoundException {

        Scanner teamInfo = new Scanner(new FileReader("LAB_Assignment_3\\src\\dataInfo\\teamInfo.csv"));
        teamList = new ArrayList<>();

        while (teamInfo.hasNextLine()) {

            String rowTeam = new String();
            String[] rowTeamSpecific = new String[2];

            rowTeam = teamInfo.nextLine();
            rowTeamSpecific = rowTeam.split(",");

            WarriorDA warriorDA = new WarriorDA(rowTeamSpecific[0]);

            teamList.add(new Team(rowTeamSpecific[0], rowTeamSpecific[1],
                         warriorDA.getTotalKills(), warriorDA.getWarriorList()));
        }
        teamInfo.close();
    }

    public ArrayList<Team> getTeamList() {
        return this.teamList;
    }

}