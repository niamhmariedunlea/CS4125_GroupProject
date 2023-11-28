package Controller;

import java.sql.Date;

import Model.Rental;
import View.RentalView;

public class RentalController {
    private Rental model;
    private RentalView view;

    public int getRentalID()
    {
        return model.getUserID();
    }

    public void setRentalID(int rentalID)
    {
        model.setRentalID(rentalID);
    }

    public int getScooterID()
    {
        return model.getScooterID();
    }

    public void setScooterID(int scooterID)
    {
        model.setScooterID(scooterID);
    }

    public Date getStartDate()
    {
        return model.getStartDate();
    }

    public void setStartDate(Date startDate)
    {
        model.setStartDate(startDate);
    }

    public double getRentalCost()
    {
        return model.getRentalCost();
    }

    public void setRentalCost(double rentalCost)
    {
        model.setRentalCost(rentalCost);
    }

    public void updateView()
    {
        view.displayRentalInformation(model.getRentalID(), model.getScooterID(), model.getStartDate(), model.getRentalCost());
    }
    
}
