package ui;

import dataAccessObject.TeamDA;
import domain.*;

import java.io.FileNotFoundException;
import java.util.*;

public class TeamReport {
    public static void main(String[] args) throws FileNotFoundException {

        List<Team> teamList = new TeamDA().getTeamList();
        System.out.println("\nTeam Standing Report\n");
        for (Team team : teamList) {
            System.out.println(team);
        }
    }
}