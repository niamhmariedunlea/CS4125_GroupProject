/*
 * Author: Niamh Dunlea 
 * Date: October/November 2023
 */

import java.util.ArrayList;
import java.util.List;

public class RentalView {
public boolean queryRental;
public boolean updateRental;

private List<Rental> currentRentals;

public RentalView(){
    currentRentals = new ArrayList<>();
}

public RentalView(boolean queryRental, boolean updateRental){
    this.queryRental = queryRental;
    this.updateRental = updateRental;
}

public void displayRentalInformation(){
    System.out.println("Current rentals: ");
    for(Rental current : currentRentals){
        current.displayInformation();
    }
}
}