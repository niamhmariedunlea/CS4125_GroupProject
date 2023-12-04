package Model;

import java.util.List;
import java.util.ArrayList;


public class ScooterModel {
    private List<Scooter> scooters;

    public ScooterModel(List<Scooter> initialScooters) {
        this.scooters = new ArrayList<>(initialScooters);
    }

    public ScooterModel() {
        this.scooters = new ArrayList<>();
    }

    public void loadScootersFromCSV(String filePath) {
        scooters = ScooterFactory.createScootersFromCSV(filePath);
    }

    public List<Scooter> getScooters() {
        return scooters;
    }

    public Scooter getScooterAt(int index) {
        return scooters.get(index);
    }

    public void rentScooter(Scooter scooter) {
        // Implement logic to update scooter status for renting
        // ...
    }

    public void returnScooter(Scooter scooter) {
        // Implement logic to update scooter status for returning
        // ...
    }
}