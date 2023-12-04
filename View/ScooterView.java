/*
 * Author: Niamh Dunlea 
 * Date: October/November 2023
 */

package View;

import java.util.ArrayList;

import Model.Scooter;

public class ScooterView {
   
    public ArrayList <Scooter> displayScooters;
    public String displayScooterDetails;
    //public Status status;  
    public String displayRentalInformation;
    public String displayReturn;


    public void displayScooterInformation(int scooterID, int nodeID, String position){
        System.out.println("Scooter information: ");
            System.out.println("Scooter ID: " + scooterID);
            System.out.println("Node ID: " + nodeID);
            System.out.println("Location: " + position);
            //System.out.println("Status: " + status);
        }
}


