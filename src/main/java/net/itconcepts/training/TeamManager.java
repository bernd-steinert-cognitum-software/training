package net.itconcepts.training;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by balb on 25.04.2017.
 */
public class TeamManager {

    private static TeamManager instance;

    private List<Team> teams = new ArrayList<Team>();


    public static TeamManager getInstance() {
        if(instance == null) {
            instance = new TeamManager();
        }

        return instance;
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public void removeTeam(Team team) {
        teams.remove(team);
    }

    public void removeTeam(int id) {
        teams.remove(getTeam(id));
    }

    public Team getTeam(int id) {
        for (Team team : teams) {
            if (team.getId() == id) {
                return team;
            }
        }
        return null;
    }

    public List<Team> getTeams() {
        return new ArrayList<Team>(this.teams);
    }

}
