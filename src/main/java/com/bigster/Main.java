package com.bigster;

public class Main {
    public static void main(String args[]) {
        String fileName;
        String master;

        if (args.length < 1) {
            System.err.println("At least a filename is required as a command line argument");
        } else {
            fileName = args[0];
        }

        if (args.length == 2) {
            master = args[1];
        } else master = null;
    }
}
