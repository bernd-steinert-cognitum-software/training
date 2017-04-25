package net.itconcepts.training;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by balb on 25.04.2017.
 */
public class MannschaftsManager {

    private List<Mannschaft> mannschaftliste = new ArrayList<Mannschaft>();

    public void createTeam(Mannschaft mannschaft) {

        mannschaftliste.add(mannschaft);
    }
}

