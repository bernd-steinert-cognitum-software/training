package net.itconcepts.training;

import com.budhash.cliche.Command;
import com.budhash.cliche.Param;

import java.util.List;

/**
 * This class defines the available shell commands
 */
public class LeagueManagerShell {

    // commands

    /**
     * Examples:
     * 1. > create-team 1 Bayern
     * 2. > create-team 2 'FC Bayern'
     * 3. > ct 3 Bonn
     * 4. > ct 4 'Eintracht Frankfurt'
     */
    @Command()
    public String createTeam(
            @Param(name = "name", description = "the name of the team") String name) {

        Team team = new Team();
        team.setName(name);

        TeamManager.getInstance().addTeam(team);

        return "created team: id=" + team.getId() + ", name=" + team.getName();
    }

    @Command()
    public String editTeam(
            @Param(name = "id", description = "team with id will be edited") int id,
            @Param(name = "name", description = "the name of the team") String name) {

        Team team = TeamManager.getInstance().getTeam(id);
        team.setName(name);

        return "updated team: id=" + team.getId() + ", name=" + team.getName();
    }

    @Command()
    public String deleteTeam(
            @Param(name = "id", description = "team with id will be deleted") int id) {

        TeamManager teamManager = TeamManager.getInstance();
        Team team = teamManager.getTeam(id);

        teamManager.removeTeam(team);

        return "deleted team: id=" + team.getId() + ", name=" + team.getName();
    }

    @Command()
    public String startNewSeason() {
        Season season = Season.getInstance();
        season.startNewSeason();

        return "started new season with " + TeamManager.getInstance().getTeams().size() + " teams and " + season.getMatches().size() + " matches";
    }

    @Command()
    public void showOpenMatches() {
        List<Match> openMatches = Season.getInstance().getOpenMatches();

        for (Match match: openMatches) {
            System.out.println("id=" + match.getId() + ", home=" + match.getHomeTeam().getName() + ", away=" + match.getAwayTeam().getName());
        }
    }

    @Command()
    public void showTable() {
        Table table = new Table();
        int position = 1;

        for (TableRow tableRow: table.getTableRows()) {
            System.out.println("pos=" + position + ", team=" + tableRow.getTeam().getName() + ", points=" + tableRow.getPoints() + ", goals=" + tableRow.getGoals());

            position++;
        }
    }

    @Command()
    public void showTeams() {
        List<Team> teams = TeamManager.getInstance().getTeams();

        for (Team team: teams) {
            System.out.println("id=" + team.getId() + ", name=" + team.getName());
        }
    }

    @Command()
    public void setResult(
            @Param(name = "matchId") int matchId,
            @Param(name = "homeGoals") int homeGoals,
            @Param(name = "awayGoals") int awayGoals) {

        Match match = Season.getInstance().getMatch(matchId);
        match.setResult(homeGoals, awayGoals);

        System.out.println("added result of match id=" + match.getId());
        System.out.println("home=" + match.getHomeTeam().getName() + ", goals=" + match.getHomeGoals() + ", points=" + match.getHomePoints());
        System.out.println("away=" + match.getAwayTeam().getName() + ", goals=" + match.getAwayGoals() + ", points=" + match.getAwayPoints());
    }

    @Command()
    public void deleteResult(
            @Param(name = "matchId") int matchId) {

        Match match = Season.getInstance().getMatch(matchId);
        match.deleteResult();

        System.out.println("deleted result of match id=" + match.getId());
    }


    // optional commands

    @Command(description = "loads data from file")
    public String load() {
        TeamManager teamManager = TeamManager.getInstance();
        teamManager.addTeam(new Team("Borussia Dortmund"));
        teamManager.addTeam(new Team("FC Bayern München"));
        teamManager.addTeam(new Team("Barfuß Bonn"));
        teamManager.addTeam(new Team("Eintracht Frankfurt"));

        Season.getInstance().startNewSeason();

        return "done";
    }

}
