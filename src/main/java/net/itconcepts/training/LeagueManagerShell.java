package net.itconcepts.training;

import com.budhash.cliche.Command;

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
        Boolean var=true;
        Mannschaft mannschaft = new Mannschaft();
        Scanner scanner = new Scanner(System.in);

        while(var) {
            System.out.println("Geben Sie den Namen der Mannschaft ein:");
            String Mannschaftsname = scanner.nextLine();
            mannschaft.setName(Mannschaftsname);
            MannschaftsManager.getInstance().createTeam(mannschaft);
            System.out.println("Die Mannschaft " + mannschaft.getName() + " wurde angelegt. Möchten Sie weitere Mannschaften eintragen (j - Ja oder n - Nein)");
            String auswahl = scanner.next();

            if (auswahl.equals("n")){
                var=false;
            }else if (auswahl.equals("j")){
                var=true;
            }
        }
        return "Die Mannschaft/en wurde angelegt.";
    }

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

    @Command
    public String listTeam() {

        return "";
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
