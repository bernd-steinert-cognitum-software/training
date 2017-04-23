package net.itconcepts.training;

import com.budhash.cliche.Command;
import com.budhash.cliche.ShellFactory;

import java.io.IOException;

/**
 * This class defines the available shell commands
 */
public class LeagueManagerShell {

    // commands

    @Command()
    public String createTeam() {
        return "ToDo";
    }

    @Command()
    public String editTeam() {
        return "ToDo";
    }

    @Command()
    public String deleteTeam() {
        return "ToDo";
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
