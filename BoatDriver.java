
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

    public static void main(String args[]) throws FileNotFoundException, ArrayIndexOutOfBoundsException {

        //Open the boat.txt file. Read the file into an array of String boatArray in main
        String filename = "boat.txt";
        Scanner in;
        String[] boatArray = new String[100];
        Boat thisBoat;

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
//            for (int i = 0; i < 5; i ++) {
//                System.out.println(boatArray[i]);
//            }
        String boatNameAndAction = "";

        System.out.println("Enter a boat's name and issue a command, as seperated by a comma.");
        System.out.println("I.e. Pequod, power on");

        Scanner input = new Scanner(System.in);

        boatNameAndAction = input.nextLine();

        //This temp bNAA array (aka. boatNameAndAction array) holds boatName and command Strings.
        String[] bNAA;
        
        //parse input--check if format is correct, e.g. two sets of strings, one comma
        bNAA = boatNameAndAction.split(", ");
        while (bNAA.length != 2) {
            System.out.println("Please ensure that your format is correct. Please try again.");
            System.out.println("I.e. Pequod, power on");
            boatNameAndAction = input.nextLine();
            bNAA = boatNameAndAction.split(", ");
        }

        //store first set of string in boatName--check if name is valid
        String boatName = bNAA[0];

        String command = bNAA[1];
        System.out.println(boatName + ", " + command + " end");

//        System.out.println(boatNameAndAction);
        //store second set of string in command--change everything to lowercase and check if command is valid.
//        do {
//
//        } while (thisBoat.powerOff() == true);
    }

}
