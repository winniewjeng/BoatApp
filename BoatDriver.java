
import java.io.*;
import java.util.Scanner;

//Error checking:
//
//If the user enters an invalid command, a message should be displayed that the command was invalid.
//
//If the user enters a boat name that does not exist, a message should be displayed that the boat not does not exist.
//
//If the user enters a command that is not in the correct format (boatname, command),
//a message should be displayed that the command format is invalid.

public class BoatDriver {

    public static void main(String args[]) throws FileNotFoundException {

        String filename = "boat.txt";
        Scanner in;
        String[] boatArray = new String[100];

        try {
            in = new Scanner(new File(filename));

            //populate the boatArray with all the boat names inside boat.txt
            for (int i = 0; in.hasNextLine() && i < 100; i++) {
                boatArray[i] = in.nextLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Could not find " + filename);
        }

//            DO NOT DELETE--This code prints all the boat names inside boatArray
            for (int i = 0; i < 5; i ++) {
                System.out.println(boatArray[i]);
            }

        
//        try {} catch () {}

       
    }

}
