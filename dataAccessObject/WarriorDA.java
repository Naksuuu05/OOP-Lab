package dataAccessObject;

import domain.*;
import java.io.*;
import java.util.*;

public class WarriorDA {
    private ArrayList<Warrior> warriorList;
    private Integer totalKills = 0;

    public WarriorDA(String teamName) throws FileNotFoundException {

        Scanner teamStatInfo = new Scanner(new FileReader("LAB_Assignment_3\\src\\dataInfo\\teamStatInfo.csv"));
        warriorList = new ArrayList<>();

        while (teamStatInfo.hasNextLine()) {

            String rowWarrior = new String();
            String[] rowWarriorSpecific = new String[4];

            rowWarrior = teamStatInfo.nextLine();
            rowWarriorSpecific = rowWarrior.split(",");

            String warriorNo;

            if (teamName.equals(rowWarriorSpecific[0])) {
                totalKills += Integer.parseInt(rowWarriorSpecific[3]);

                warriorNo = rowWarriorSpecific[1];

                switch (warriorNo) {
                    case "warrior1":
                        warriorList.add(new Clint(rowWarriorSpecific[1], Integer.parseInt(rowWarriorSpecific[2]), Integer.parseInt(rowWarriorSpecific[3])));
                        break;
                    case "warrior2":
                        warriorList.add(new Miya(rowWarriorSpecific[1], Integer.parseInt(rowWarriorSpecific[2]), Integer.parseInt(rowWarriorSpecific[3])));
                        break;
                    case "warrior3":
                        warriorList.add(new Vexana(rowWarriorSpecific[1], Integer.parseInt(rowWarriorSpecific[2]), Integer.parseInt(rowWarriorSpecific[3])));
                        break;
                    default:
                        warriorList.add(null);
                        break;
                }
            }
        }
        teamStatInfo.close();
    }

    public ArrayList<Warrior> getWarriorList() {
        return this.warriorList;
    }

    public Integer getTotalKills() {
        return this.totalKills;
    }

}