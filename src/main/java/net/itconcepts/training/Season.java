package net.itconcepts.training;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bste on 26.04.2017.
 */
public class Season {

    private static Season instance;

    public static Season getInstance() {
        if(instance == null) {
            instance = new Season();
        }

        return instance;
    }


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

    public Match getMatch(int id) {
        for (Match match : matches) {
            if (match.getId() == id) {
                return match;
            }
        }
        return null;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public List<Match> getOpenMatches() {
        List<Match> openMatches = new ArrayList<>();

        for (Match match : matches) {
            if(!match.isFinished()) {
                openMatches.add(match);
            }
        }
        return openMatches;
    }

    public List<Match> getFinishedMatches() {
        List<Match> finishedMatches = new ArrayList<>();

        for (Match match : matches) {
            if(match.isFinished()) {
                finishedMatches.add(match);
            }
        }
        return finishedMatches;

    }
}
