/*
 * Author: Niamh Dunlea 
 * Date: October/November 2023
 */

package View;

import java.sql.Date;

public boolean queryRental;
public boolean updateRental;

public RentalView(){

    title = new JLabel("Rentals");
    title.setBounds(90, 150, 300, 100);
    title.setFont(new Font("Calibri", Font.BOLD, 50));
    add(title);
}

public RentalView(boolean queryRental, boolean updateRental){
    this.queryRental = queryRental;
    this.updateRental = updateRental;
}

public void displayRentalInformation(int rentalID, int scooterID, Date startDate, double rentalCost){
    
    JLabel rentalInfoLabel = new JLabel(
                "<html>Current rental:<br>Rental ID: " + rentalID + "<br>Scooter ID: " + scooterID + "<br>Start: "
                        + startDate + "<br>Cost: " + rentalCost + "</html>");
        rentalInfoLabel.setBounds(50, 250, 500, 100);
        add(rentalInfoLabel);
    
    }
}
