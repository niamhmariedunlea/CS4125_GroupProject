/*
 * Author: Niamh Dunlea 
 * Date: October/November 2023
 */

import java.sql.Date;

public class RentalView {
public boolean queryRental;
public boolean updateRental;

public RentalView(boolean queryRental, boolean updateRental){
    this.queryRental = queryRental;
    this.updateRental = updateRental;
}

public void displayRentalInformation(int rentalID, int scooterID, Date startDate, double rentalCost){
    System.out.println("Current rental: ");
        System.out.println("Rental ID: " + rentalID);
        System.out.println("Scooter ID: " + scooterID);
        System.out.println("Start: " +startDate);
        System.out.println("Cost: " + rentalCost);
    }
}
