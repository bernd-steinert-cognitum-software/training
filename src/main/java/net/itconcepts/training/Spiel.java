package net.itconcepts.training;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by scak on 25.04.2017.
 */
public class Spiel {

    private static int idzaehler = 0;
    private Mannschaft heimatmannschaft;
    private Mannschaft auswaertsmannschaft;
    private int heimtor = -1;
    private int auswaertstor = -1;
    private boolean hatStattgefunden = false;
    private int id;

    public Spiel(){
        idzaehler++;
        id = idzaehler;
    }

    public Spiel(Mannschaft heim, Mannschaft auswaerts) {
        this();
        this.heimatmannschaft = heim;
        this.auswaertsmannschaft = auswaerts;
    }

    public boolean hatStattgefunden() {

        return hatStattgefunden;
    }

    public int getHeimtor() {

        return heimtor;
    }

    public int getAuswaertstor() {

        return auswaertstor;
    }

    public void setErgebnis(int heimtor, int auswaertstor) {
        this.heimtor = heimtor;
        this.auswaertstor = auswaertstor;
        this.hatStattgefunden = true;


    }

    public Mannschaft getAuswaertsmannschaft() {

        return auswaertsmannschaft;
    }

    public void setAuswaertsmannschaft(Mannschaft auswaertsmannschaft) {
        this.auswaertsmannschaft = auswaertsmannschaft;
    }

    public Mannschaft getHeimatmannschaft() {

        return heimatmannschaft;
    }

    public void setHeimatmannschaft(Mannschaft heimatmannschaft) {

        this.heimatmannschaft = heimatmannschaft;
    }

    public int getId() {

        return id;
    }

}
