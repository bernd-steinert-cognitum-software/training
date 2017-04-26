package net.itconcepts.training;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bste on 26.04.2017.
 */
public class Season {

    private List<Match> matches;

    public void startNewSeason() {
        this.matches = new ArrayList<Match>();

        List<Team> teams = TeamManager.getInstance().getTeams();

        for (Team team : teams) {
            for (Team otherTeam : teams) {
                if (team != otherTeam) {
                    if(team.getId() < otherTeam.getId()) {
                        matches.add(new Match(team, otherTeam));
                        matches.add(new Match(otherTeam, team));
                    }
                }
            }
        }
    }

    public List<Match> getMatches() {
        return matches;
    }
}
