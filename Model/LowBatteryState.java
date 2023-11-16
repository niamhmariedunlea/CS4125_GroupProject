package Model;

// Concreate state class: Low

public class LowBatteryState implements ScooterBatteryState {

    public void displayBatteryInfo() {
        System.out.println("Battery level is low.");
    }

    @Override
    public void consumeBattery() {
        System.out.println("Battery level is critically low. Please charge immediately.");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Battery level increased to medium.");
    }
    
}
