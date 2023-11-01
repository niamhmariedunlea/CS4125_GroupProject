import java.sql.Date;
import java.util.concurrent.TimeUnit;

import javax.sound.midi.SysexMessage;

import java.lang.Math;

public class Rental {

    private int rentalID, userID, scooterID;

    private boolean paid;

    private Date startDate;
    private Date endDate;

    private double rentalCost;

    public Rental(int rentalID, int userID, int scooterID, Date startDate, Date endDate, double rentalCost, boolean paid)
    {
        this.rentalID = rentalID;
        this.userID = userID;
        this.scooterID = scooterID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rentalCost = rentalCost;
        this.paid = paid;
    }

    public int getRentalID()
    {
        return rentalID;
    }

    public void setRentalID(int rentalID)
    {
        this.rentalID = rentalID;
    }

    public int getUserID()
    {
        return userID;
    }

    public void setUserID(int userID)
    {
        this.userID = userID;
    }

    public int getScooterID()
    {
        return scooterID;
    }

    public void setScooterID(int scooterID)
    {
        this.scooterID = scooterID;
    }

    public Date getStartDate()
    {
        return startDate;
    }

    public void setStartDate(Date startDate)
    {
        this.startDate = startDate;
    }

    public Date getEndDate()
    {
        return endDate;
    }

    public void setEndDate(Date endDate)
    {
        this.endDate = endDate;
    }

    public double getRentalCost()
    {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost)
    {
        this.rentalCost = rentalCost;
    }

    public boolean getPaid()
    {
        return paid;
    }

    public void setPaid(boolean paid)
    {
        this.paid = paid;
    }

    public static double calculateCost(Date startDate, Date endDate)
    {
        long start = startDate.getTime();
        long end = endDate.getTime();

        long timeDiff = Math.abs(end - start);
        long daysDiff = TimeUnit.DAYS.convert(timeDiff, TimeUnit.MILLISECONDS);
        double days = (double)daysDiff;

        if (days > 7) 
        {
            double penalty = 25.00;
            return penalty;
        }
        else
        {
            return 0.00;
        }

    }

    public void displayInformation(){
        System.out.println("Rental ID: " + rentalID);
        System.out.println("Scooter ID: " + scooterID);
        System.out.println("Start: " +startDate);
        System.out.println("Cost: " + rentalCost);
    }


}