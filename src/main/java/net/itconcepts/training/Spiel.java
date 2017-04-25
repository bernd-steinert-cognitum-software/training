package net.itconcepts.training;

/**
 * Created by scak on 25.04.2017.
 */
public class Spiel {

    private static int idzaehler = 0;
    private Mannschaft heimatmannschaft;
    private Mannschaft auswaertsmannschaft;
    private int heimtor;
    private int auswaertstor;
    private int id;

    public Spiel(){
        idzaehler++;
        id = idzaehler;
    }

    public int getHeimtor() {
        return heimtor;
    }

    public void setHeimtor(int heimtor) {
        this.heimtor = heimtor;
    }

    public int getAuswaertstor() {
        return auswaertstor;
    }

    public void setAuswaertstor(int auswaertstor) {
        this.auswaertstor = auswaertstor;
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
