package net.itconcepts.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by scak on 26.04.2017.
 */
public class Spielplan {

    private static Spielplan instance;

    public static Spielplan getInstance() {
        if (instance == null) {
            instance = new Spielplan();
        }
        return instance;
    }

    private List<Spiel> spielplanliste = new ArrayList<Spiel>();

    public List<Spiel> getSpielplanliste() {
        return spielplanliste;
    }

    public void createSpielplan() {
        Boolean var = true;
        List<Mannschaft> mannschaftsliste = MannschaftsManager.getInstance().getMannschaftliste();

        for (Mannschaft m : mannschaftsliste) {
            int x = 0;
            if (m.getName().equals(mannschaftsliste)) {

            }
        }
    }
}

        /*
        for(int i = 0; i < mannschaftsliste.size(); i++) {
            if(i == ){
                var=false;
            }
            else if(mannschaftsliste == null){
                var=false;
            }
        }
    } */

