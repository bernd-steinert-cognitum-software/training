package net.itconcepts.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by bste on 26.04.2017.
 */
public class Table {

    List<TableRow> tableRows = new ArrayList<TableRow>();

    public Table() {
        List<Team> teams = TeamManager.getInstance().getTeams();

        for (Team team : teams) {
            tableRows.add(new TableRow(team));
        }

        tableRows.sort(new Comparator<TableRow>() {
            @Override
            public int compare(TableRow o1, TableRow o2) {
                if(o1.getPoints() > o2.getPoints()) {
                    return -1;
                }
                else if (o1.getPoints() < o2.getPoints()) {
                    return 1;
                }
                return 0;
            }
        });
    }

    public List<TableRow> getTableRows() {
        return tableRows;
    }
}
