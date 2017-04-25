package net.itconcepts.training;

/**
 * Created by skay on 25.04.2017.
 */
public class Mannschaft {

    private static int idzaehler = 0;
    private String name;
    private int id;

    public Mannschaft(){
        idzaehler++;
        id = idzaehler;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getId() {
        return id;
    }

}
