package net.itconcepts.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by scak on 26.04.2017.
 */
public class Spielplan {

    private static Spielplan instance;
    private Mannschaft m;

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
        List<Mannschaft> mannschaftsliste = MannschaftsManager.getInstance().getMannschaftliste();

        System.out.println("Heimspiel  Auswärtsspiel");


            for (Mannschaft m : mannschaftsliste) {

                if (m.getName().equals(mannschaftsliste)) {

                } else {
                    System.out.println(m.getName() + "    " + mannschaftsliste.get(x).getName());
                }
                x++;
            }

       // for (Mannschaft n : mannschaftsliste) {
        //    int y = 0;

          //  if (n.getName().equals(mannschaftsliste.get(y).getName())) {
            //    y++;
 //           } else System.out.println(mannschaftsliste.get(y).getName() + "  " + n.getName());


   //     }
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

