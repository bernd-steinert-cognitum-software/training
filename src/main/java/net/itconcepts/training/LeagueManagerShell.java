package net.itconcepts.training;

import com.budhash.cliche.Command;
import com.budhash.cliche.Param;
import com.budhash.cliche.ShellFactory;

import java.io.IOException;

/**
 * This class defines the available shell commands
 */
public class LeagueManagerShell {

    // commands

    /**
     * Examples:
     * 1. > create-team 1 Bayern
     * 2. > create-team 2 'FC Bayern'
     * 3. > ct 3 Bonn
     * 4. > ct 4 'Eintracht Frankfurt'
     */
    @Command()
    public String createTeam(
            @Param(name = "id", description = "id") int id,
            @Param(name = "name", description = "the name of the team") String name) {

        return "id=" + id + ", name=" + name;
    }

    @Command()
    public String editTeam() {
        return "ToDo";
    }

    @Command()
    public String deleteTeam(
            @Param(name = "id", description = "team with id will be deleted") int id) {
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
