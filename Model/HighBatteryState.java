package Model;

// Concreate state class: High

public class HighBatteryState implements ScooterBatteryState {

    @Override
    public void displayBatteryInfo() {
        System.out.println("Battery level is high.");
    }

    @Override
    public void consumeBattery() {
        System.out.println("Battery level decreased to medium.");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Battery level is already high. No need to charge.");
    }
    
}
