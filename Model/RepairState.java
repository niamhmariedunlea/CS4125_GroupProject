package Model;

public class RepairState implements ScooterState {

    public void handleState(Scooter scooter)
    {
        scooter.setStatus("In-Repair");
    }
    
}
