package Model;

public class BatteryWarningDecorator extends ScooterDecorator{
    private int warningBatteryLevel;

    public BatteryWarningDecorator(Scooter decoratedScooter, int warningBatteryLevel){
        super(decoratedScooter);
        this.warningBatteryLevel = warningBatteryLevel;
    }

    public void startRental(){
        super.startRental();
        System.out.println("Battery level is now: " + batteryLevel);
    }

    public void endRide(){
        super.endRide(); // call method in ScooterDecorator 
    }
}




