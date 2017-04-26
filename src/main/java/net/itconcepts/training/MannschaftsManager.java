package net.itconcepts.training;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * Created by balb on 25.04.2017.
 */
public class MannschaftsManager {

    private static MannschaftsManager instance;

    public static MannschaftsManager getInstance() {
        if(instance == null) {
            instance = new MannschaftsManager();
        }

        return instance;
    }

    private List<Mannschaft> mannschaftliste = new ArrayList<Mannschaft>();

    public void createTeam(Mannschaft mannschaft) {

        mannschaftliste.add(mannschaft);
    }

    public void removeTeam(Mannschaft mannschaft) {

        mannschaftliste.remove(mannschaft);
    }

    public Mannschaft getMannschaftById(int id) {
        for (Mannschaft m : this.mannschaftliste) {
            if(m.getId() == id) {
                return m;
            }
        }

        return null;
    }

    public List<Mannschaft> getMannschaftliste() {
        return mannschaftliste;
    }
}
