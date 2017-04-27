package net.itconcepts.training;

import sun.security.provider.ConfigFile;

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

        System.out.println("Heimspiel\tAuswärtsspiel");
        for (Mannschaft m : mannschaftsliste) {
            for (Mannschaft n : mannschaftsliste) {
                if (m.getName() != n.getName()) {
                    System.out.print(m.getName() + "\t" + n.getName() + " ");
                    Spiel spiel = new Spiel(m, n);
                    spielplanliste.add(spiel);
                    System.out.println(spiel.getId());
                } else if (var = false);
            }
        }
    }

    public Spiel getSpielById(int id) {
        for (Spiel s : this.spielplanliste) {
            if(s.getId() == id) {
                return s;
            }
        }

        return null;
    }



}



