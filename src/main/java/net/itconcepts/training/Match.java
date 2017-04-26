package net.itconcepts.training;

/**
 * Created by scak on 25.04.2017.
 */
public class Match {

    private static int idzaehler = 0;
    private int id;

    private Team homeTeam;
    private Team awayTeam;

    private int homeScore = -1;
    private int awayScore = -1;
    private boolean hatStattgefunden = false;

    public Match(){
        idzaehler++;
        id = idzaehler;
    }

    public Match(Team home, Team away){
        this();

        this.homeTeam = home;
        this.awayTeam = away;
    }

    public boolean hatStattgefunden() {
        return hatStattgefunden;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public void setErgebnis(int heimtor, int auswaertstor) {
        this.homeScore = heimtor;
        this.awayScore = auswaertstor;
        this.hatStattgefunden = true;
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

}
