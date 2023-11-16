package Controller;

import Model.ScooterBattery;
import View.ScooterBatteryView;

public class ScooterBatteryController {
    private ScooterBattery model;
    private ScooterBatteryView view;

    public ScooterBatteryController(ScooterBattery model, ScooterBatteryView view) {
        this.model = model;
        this.view = view;
    }

    public void consumeBattery() {
        model.consumeBattery();
        updateView();
    }

    public void chargeBattery() {
        model.chargeBattery();
        updateView();
    }

    private void updateView() {
        // Notify the view to display the updated battery info
        view.displayBatteryInfo(model.getStateInfo());
    }
}
