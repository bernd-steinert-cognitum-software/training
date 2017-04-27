package net.itconcepts.training;

import com.budhash.cliche.Command;
import sun.security.provider.ConfigFile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * This class defines the available shell commands
 */
public class LeagueManagerShell {
    private List<Mannschaft> mannschaftliste;

    // commands

    /**
     * Ein neues Objekt "mannschaft" wird erzeugt
     * @return mannschaftsname wird ausgegeben
     */
    @Command()
    public String createTeam() {

        Mannschaft mannschaft = new Mannschaft();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie den Namen der Mannschaft ein:");
        String Mannschaftsname = scanner.nextLine();
        mannschaft.setName(Mannschaftsname);
        MannschaftsManager.getInstance().createTeam(mannschaft);
        return "Die Mannschaft " + mannschaft.getName() + " wurde angelegt.";
    }

    /**
     * Mannschaftsname kann geändert werden
     * @return geändert Mannschaftsname
     */
    @Command()
    public String editTeam() {
        Mannschaft mannschaft;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welchen Mannschaftsnamen möchten Sie abändern? Geben Sie die ID ein:");
        int ID = scanner.nextInt();

        mannschaft = MannschaftsManager.getInstance().getMannschaftById(ID);

        System.out.println("Geben Sie den neuen Mannschaftsnamen ein:");
        String MannschaftsnameNeu = scanner.next();
        mannschaft.setName(MannschaftsnameNeu);

        return "Mannschaftsname wurde in " + mannschaft.getName()  + " abgeändert";
    }

    /**
     * Mannschaft kann gelöscht werden
     * @return gelöschte Mannschaft
     */

    @Command()
    public String deleteTeam() {
        Mannschaft mannschaft;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welche Mannschaft möchten Sie löschen? Geben Sie die ID ein:");
        int ID = scanner.nextInt();

        mannschaft = MannschaftsManager.getInstance().getMannschaftById(ID);
        MannschaftsManager.getInstance().removeTeam(mannschaft);

        return "Mannschaft " + mannschaft.getName()  + " wurde gelöscht";
    }

    /**
     * Liste der vorhandenen Mannschaften mit den zugehörigen ID's
     * @return null
     */

    @Command
    public String listTeam() {
        List<Mannschaft> liste = MannschaftsManager.getInstance().getMannschaftliste();

        System.out.println("ID  Mannschaft");

        for (Mannschaft m : liste) {
            System.out.println(m.getId() + "   " + m.getName());
        }

        return null;
    }

    /**
     * Spielplan wird angezeigt
     * @return leer
     */

    @Command
    public String listPlay(){
        Spielplan.getInstance().createSpielplan();

        return null;
    }

    @Command
    public String setErgebnisse(){
        Spiel spiel;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID auswählen");
        int IDerg = scanner.nextInt();

        spiel = Spielplan.getInstance().getSpielById(IDerg);

        System.out.println("Heimtor:");
        int Spielheimtor = scanner.nextInt();
        System.out.println("Auswärtstor:");
        int Spielauswaertstor = scanner.nextInt();

        spiel.setErgebnis(Spielheimtor, Spielauswaertstor);

        System.out.println("Hoffentlich funktioniert es jetzt");

        return "Spiel-ID: " + spiel.getId() + "\nErgebnis: " + spiel.getHeimatmannschaft().getName() + " " + spiel.getAuswaertsmannschaft().getName() + " " + spiel.getHeimtor() + " : " + spiel.getAuswaertstor();
    }

    @Command
    public String zeigTabelle(){
        System.out.println("Tabelle");
        Tabelle tabelle = new Tabelle();

        List<Mannschaft> liste = MannschaftsManager.getInstance().getMannschaftliste();

        for (Mannschaft m : liste) {
            System.out.println(m.getId() + "   " + m.getName());
        }

        return null;
    }



    // optional commands

    @Command(description = "print statistics")
    public String statistics() {
        return "ToDo";
    }

    @Command(description = "loads data from file")
    public String load() {
        return "ToDo";
    }

    @Command(description = "saves data to a file")
    public String save() {
        return "ToDo";
    }

}
