package Model;

//Model/Context Class

public class ScooterBattery {
    private ScooterBatteryState state;

    public ScooterBattery() {
        // Initial state is High
        this.state = new HighBatteryState();
    }

    public void consumeBattery() {
        state.consumeBattery();
        updateState();
    }

    public void chargeBattery() {
        state.chargeBattery();
        updateState();
    }

    public void displayInfo() {
        state.displayBatteryInfo();
    }

    public void setState(ScooterBatteryState state) {
        this.state = state;
    }

    private void updateState() {
        // You can implement additional logic here based on your requirements.
        // For example, you might want to trigger alerts or actions on state changes.
    }

    public String getStateInfo() {
        return state.getClass().getSimpleName();
    }

}
