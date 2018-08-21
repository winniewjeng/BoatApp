
import java.util.Scanner;

public class BoatMain {

    public static void main(String args[]) {

        //Declaring variables
        String boatNameAndAction = "";
        CheckErrors err = new CheckErrors();
        Scanner input = new Scanner(System.in);

        //This section prompts for user input
        System.out.println("Enter a boat's name and issue a command, as seperated by a comma.");
        System.out.println("I.e. Backdraft, power on");

        //This section checks for errors. If any error is found, output the error
        while (true) {
            boatNameAndAction = input.nextLine();
            while (err.checkFormat(boatNameAndAction) && err.hasName() && err.hasCommand()) {
                boatNameAndAction = input.nextLine();
            }
        }
    }
}
