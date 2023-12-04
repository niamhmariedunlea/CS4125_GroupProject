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
        if(scooter.getStatus()=="In-Repair"||scooter.getStatus()=="Unavailable")
        {
            System.out.println("Scooter cannot be rented");
        }
        else
        {
            scooter.requestStateChange(new UnavailableState());
        }
    }

    public void returnScooter(Scooter scooter) {
        // Implement logic to update scooter status for returning
        // ...
        if(scooter.getStatus()=="Unavailable")
        {
            scooter.requestStateChange(new AvailableState());
        }
        else
        {
            System.out.println("Scooter cannot be returned!");
        }
    }
}