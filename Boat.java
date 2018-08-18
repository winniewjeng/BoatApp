/* 
 * Author: Winnie Jeng
 * Instructor: Amir Hallajpour
 * Assignment: 8
 * Created on August 17, 2018, 10:05 AM
 * Instruction: 
 */

//In this project, you will create a Boat application.  Each Boat has the following
//attributes: name, speed, angle, and power. The Boat names should be read from a text 
//file “boats.txt”. You can assume there will be a maximum of 100 boats in the file.
//For testing, use the following boat names in the boats.txt file:

import java.util.Scanner;
import java.io.*;
        
public class Boat {
    
    private String name;
    private String command;
    private int degree = 0;
    private int speed = 0;
    private Boolean powerOn = false;
    
    public Boat(String name, String command) {
        name = this.name;

        if (powerOn == false && command != "power on") {
            System.out.println("Please power on your boat first.");
        }
        
        else {
            command = this.command;
            //Call method
        }
    }
    
    Boolean powerOn() {
        powerOn = true;
        return true;
    }
    
    Boolean powerOff() {
        powerOn = false;
        degree = 0;
        speed = 0;
        System.out.println(name + " is powered off.");
        return false;
    }
    
    
    

    
}
