package Model;

import java.sql.Date;

public abstract class ScooterDecorator extends Scooter {

    public double batteryLevel;
    private Scooter decoratedScooter;
    private Date startTime; // from Rental class to get time
    


public ScooterDecorator(Scooter decoratedScooter, Date startTime){
this.decoratedScooter = decoratedScooter;
this.startTime = startTime;
}

public void updateBatteryLevel(double newBatteryLevel){
this.batteryLevel = newBatteryLevel;
System.out.println("Battery level is now: " + newBatteryLevel);
}

public void endRide(){
// calculate the battery level based on the duration

int totalMinutesUsed = calculateMinutes();
double batteryUsed = 0.1 * totalMinutesUsed;
double updateBatteryLevel = batteryLevel - batteryUsed;
updateBatteryLevel(updateBatteryLevel);
}



private int calculateMinutes(){
// calculate duration of rental
Date endTime = new Date();
long timeDiffMill = endTime.getTime() - startTime.getTime(); // time in milliseconds 
long timeDiffMins = timeDiffMill / (60 * 1000); // milliseconds to minutes

return (int) timeDiffMins;

    }

}