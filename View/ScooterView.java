/*
 * Author: Niamh Dunlea 
 * Date: October/November 2023
 */

package View;

public class ScooterView {
   
    public List<Scooter> displayScooters;
    public String displayScooterDetails;
    public enum updateScooter;
    public displayRentalInformation;
    public displayReturn;


    public void displayScooterInformation(int scooterID, int nodeID, String position){
        System.out.println("Scooter information: ");
            System.out.println("Scooter ID: " + scooterID);
            System.out.println("Node ID: " + nodeID);
            System.out.println("Location: " + position);
        }
}


