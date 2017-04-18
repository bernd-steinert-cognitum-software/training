package net.itconcepts.training;

import com.budhash.cliche.ShellFactory;

import java.io.IOException;

/**
 * Created by bste on 18.04.2017.
 */
public class LeagueManagerShell {

    public static void main(String[] args) throws IOException {
        ShellFactory.createConsoleShell("hello", "", new LeagueManagerShell()).commandLoop();
    }

    public String hello() {
        return "Welcome to the LeagueManager :-)";
    }
}
