package net.itconcepts.training;

/**
 * Created by skay on 25.04.2017.
 */
public class Team {

    private static int idCounter = 0;

    private int id;
    private String name;

    public Team() {
        id = ++idCounter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
