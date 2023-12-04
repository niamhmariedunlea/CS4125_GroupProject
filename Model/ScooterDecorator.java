package Model;

<<<<<<< HEAD
=======
import java.time.LocalDateTime;
>>>>>>> origin/week8
import java.sql.Date;

public abstract class ScooterDecorator extends Scooter {

<<<<<<< HEAD
    public double batteryLevel;
    private Scooter decoratedScooter;
    private Date startTime; // from Rental class to get time
    


public ScooterDecorator(Scooter decoratedScooter, Date startTime){
this.decoratedScooter = decoratedScooter;
this.startTime = startTime;
=======
public ScooterDecorator(Scooter decoratedScooter){
    super(decoratedScooter.getScooterID(), decoratedScooter.getQrCode(),
    decoratedScooter.getCurrentPosition(), decoratedScooter.getStatus()); // constructor of superclass Scooter 
    this.batteryLevel = decoratedScooter.getBatteryLevel();
    this.decoratedScooter = decoratedScooter;
>>>>>>> origin/week8
}

public void updateBatteryLevel(double newBatteryLevel){
this.batteryLevel = newBatteryLevel;
System.out.println("Battery level is now: " + newBatteryLevel);
}

public void endRide(){
// calculate the battery level based on the duration
<<<<<<< HEAD

=======
>>>>>>> origin/week8
int totalMinutesUsed = calculateMinutes();
double batteryUsed = 0.1 * totalMinutesUsed;
double updateBatteryLevel = batteryLevel - batteryUsed;
updateBatteryLevel(updateBatteryLevel);
<<<<<<< HEAD
=======

// update the status of the scooter for management etc 
if(updateBatteryLevel < 20){
    setStatus("Needs Charging");
} else {
    setStatus("Available");
}
LocalDateTime currentDateTime = LocalDateTime.now();
System.out.println("Your rental has ended at " + currentDateTime);
}

private int calculateMinutes(){
// calculate duration of rental
LocalDateTime currentDateTime = LocalDateTime.now();
Date endTime = currentDateTime;
long timeDiffMill = endTime.getTime() - startTime.getTime(); // time in milliseconds 
long timeDiffMins = timeDiffMill / (60 * 1000); // milliseconds to minutes
return (int) timeDiffMins;
    }

>>>>>>> origin/week8
}



<<<<<<< HEAD
private int calculateMinutes(){
// calculate duration of rental
Date endTime = new Date(0);
long timeDiffMill = endTime.getTime() - startTime.getTime(); // time in milliseconds 
long timeDiffMins = timeDiffMill / (60 * 1000); // milliseconds to minutes

return (int) timeDiffMins;

    }

}
=======
>>>>>>> origin/week8
