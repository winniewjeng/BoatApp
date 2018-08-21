/* 
 * Author: Winnie Jeng
 * Instructor: Amir Hallajpour
 * Assignment: 8
 * Created on August 17, 2018, 10:05 AM
 * Instruction: 
 * In this project, you will create a Boat application.Each Boat has the following
 * attributes: name, speed, angle, and power. The Boat names should be read from a text 
 * file “boats.txt”. You can assume there will be a maximum of 100 boats in the file.
 */

public class Boat {

    private int speed;
    private int angle;
    private boolean power;
    private String name;

    //Constructor
    public Boat(String aName) {
        speed = 0;
        angle = 0;
        power = false;
        name = aName;
    }

    public void PowerOn() {
        power = true;
        System.out.println(this);
    }

    public void PowerOff() {
        power = false;

//        angle = 0;
        System.out.println(this);
    }

    public void speedUp() {
        speed += 2;
        System.out.println(this);
    }

    public void slowDown() {
        if (speed - 2 < 0) {
            System.out.println("Cannot slow down any more.");
        } else {
            speed -= 2;
            System.out.println(this);
        }
    }

    public void turnLeft() {
        angle -= 5;
        System.out.println(this);
    }

    public void turnRight() {
        angle += 5;
        System.out.println(this);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        if (power == false) {
            //Reset the speed value
            speed = 0;
            return getName() + "'s power is off";
        }
        if (speed == 0) {
            return getName() + " is pointing in the direction of " + angle + " degree.";
        }
        return getName() + " is moving in " + angle + " deg angle at the speed of " + speed + " mph.";
    }

}
