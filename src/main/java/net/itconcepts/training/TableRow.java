package net.itconcepts.training;

import java.util.List;

/**
 * Created by bste on 26.04.2017.
 */
public class TableRow {

    private Team team;
    private int points = 0;
    private int goals = 0;

    public TableRow(Team team) {
        this.team = team;
        calculateValues();
    }

    private void calculateValues() {
        List<Match> matches = Season.getInstance().getFinishedMatches();

        for (Match match : matches) {
            points = points + match.getPoints(team);
            goals = goals + match.getGoals(team);
        }
    }

    public Team getTeam() {
        return team;
    }

    public int getPoints() {
        return points;
    }

    public int getGoals() {
        return goals;
    }
}
