
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Pass user input to this class before passing the input to the boat class to create boat objects
//Use the hasCommand() to pass the current boat into the Boat class 
public class CheckErrors {

    private String filename = "boat.txt";
    private Scanner in;
    private String[] boatArrayName = new String[100];
    private Boat[] boatArrayObject = new Boat[100];
    private Boat boat;
    private int boatCounter = 0;
    private String[] nameAndAction;
    private Boolean powerOn = false;
    private String name;
    private String command;

    public CheckErrors() {
        //Open the boat.txt file
        try {
            in = new Scanner(new File(filename));
            //populate the boatArray with all the boat names inside boat.txt
            while (in.hasNextLine()) {
                boatArrayName[boatCounter] = in.nextLine();
                boatCounter++;
            }
            //Close the file
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("Could not find " + filename);
        }
        //call the method to initialized all the boats appeared in the .txt file
        createBoats();

    }

    //initialize the boat objects
    public void createBoats() {
        for (int i = 0; i < boatCounter; i++) {
            boat = new Boat(boatArrayName[i]);
            //populate the array with objects of boats
            boatArrayObject[i] = boat;
        }
    }

    //check if user input the correct format, e.g. two sets of strings, one comma
    public boolean checkFormat(String boatNameAndAction) {
        nameAndAction = boatNameAndAction.split(", ");
        if (nameAndAction.length != 2) {
            System.out.println("Your format is incorrect. Please try again.");
            return false;
        }
        return true;
    }

    //check if user input a valid boat name
    public boolean hasName() {
        name = nameAndAction[0];
        for (int i = 0; i < boatCounter; i++) {
            if (name.equals(boatArrayName[i])) {
                //set the current boat object to the boat to which it is referenced
                boat = boatArrayObject[i];
                return true;
            }
        }
        System.out.println("Your boat name is invalid. Please try again.");
        return false;
    }

    //check if user input a valid command
    public boolean hasCommand() {
        command = nameAndAction[1];
        switch (command) {
            case "power on":
                boat.PowerOn();
                break;
            case "power off":
                boat.PowerOff();
                break;
            case "turn left":
                boat.turnLeft();
                break;
            case "turn right":
                boat.turnRight();
                break;
            case "speed up":
                boat.speedUp();
                break;
            case "slow down":
                boat.slowDown();
            default:
                System.out.println("Your command is invalid. Please try again.");
                return false;
        }
        return true;
    }

}
