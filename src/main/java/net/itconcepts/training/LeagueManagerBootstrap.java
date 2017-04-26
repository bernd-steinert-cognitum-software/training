package net.itconcepts.training;

import com.budhash.cliche.ShellFactory;

import java.io.IOException;

/**
 * Entry point for the application
 */
public class LeagueManagerBootstrap {

    public static void main(String[] args) throws IOException {
        ShellFactory.createConsoleShell("", "LeagueManager\n [ct] Team erstellen\n [et] Team bearbeiten\n [dt] Team löschen\n [lt] Liste ausgeben\n [lp] Spielplan", new LeagueManagerShell()).commandLoop();
    }

}
