package com.bigster;

import org.apache.commons.cli.*;

import java.io.InputStream;

public class Main {
    public static void main(String args[]) {
        CommandLineParser parser = new DefaultParser();

        // create the Options
        Options options = new Options();
        options.addOption( "d", "debug", false, "Debug mode - print the output to the console");
        options.addOption( "l", "local", false, "use a local Spark master");

        try {
            // parse the command line arguments
            CommandLine line = parser.parse( options, args, true);
            InputStream resourceAsStream = Main.class.getResourceAsStream(line.getArgs()[0]);

            // validate that block-size has been set
            if( line.hasOption( "debug" ) ) {
                System.out.println("user selected debug mode");
            }
            if(line.hasOption("local")) {
                System.out.println("user selected local mode");
            }
            if(resourceAsStream == null) {
                System.err.println("Source '" + line.getArgs()[0] + "' not found.");
            }

        }
        catch( ParseException exp ) {
            System.out.println( "Unexpected exception:" + exp.getMessage() );
        }

    }
}
