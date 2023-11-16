package Model;

// Concreate state class: Medium

public class MediumBatteryState implements ScooterBatteryState {

    public void displayBatteryInfo() {
        System.out.println("Battery level is medium.");
    }

    @Override
    public void consumeBattery() {
        System.out.println("Battery level decreased to low.");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Battery level increased to high.");
    }
    
}
