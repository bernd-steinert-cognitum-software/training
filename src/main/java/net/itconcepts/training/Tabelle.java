package net.itconcepts.training;

/**
 * Created by skay on 27.04.2017.
 */
public class Tabelle {

    private static int punktezaehler = 0;
    private Mannschaft mannschaft;
    private static int geschossen = 0;
    private static int kassiert = 0;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public Mannschaft getMannschaft(){
        return mannschaft;
    }




}
