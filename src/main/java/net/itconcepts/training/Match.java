package net.itconcepts.training;

/**
 * Created by scak on 25.04.2017.
 */
public class Match {

    private static int idzaehler = 0;
    private int id;

    private Team homeTeam;
    private Team awayTeam;

    private int homeGoals = -1;
    private int awayGoals = -1;
    private boolean finished = false;

    public Match(){
        idzaehler++;
        id = idzaehler;
    }

    public Match(Team home, Team away){
        this();

        this.homeTeam = home;
        this.awayTeam = away;
    }

    public boolean isFinished() {
        return finished;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public int getAwayGoals() {
        return awayGoals;
    }

    public void setErgebnis(int homeGoals, int awayGoals) {
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        this.finished = true;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public int getId() {
        return id;
    }

    public int getHomePoints() {
        return calculatePoints(homeGoals, awayGoals);
    }

    public int getAwayPoints() {
        return calculatePoints(awayGoals, homeGoals);
    }

    public int getPoints(Team team) {
        if (team == homeTeam) {
            return calculatePoints(homeGoals, awayGoals);
        }
        else if (team == awayTeam) {
            return calculatePoints(awayGoals, homeGoals);
        }

        return 0;
    }

    private int calculatePoints(int team1, int team2) {
        if (finished) {
            if (team1 > team2) {
                return 3;
            }
            else if (team1 == team2) {
                return 1;
            }
        }

        return 0;
    }

    public int getGoals(Team team) {
        if(team == homeTeam) {
            return homeGoals;
        }
        else if (team == awayTeam) {
            return awayGoals;
        }

        return 0;
    }
}
