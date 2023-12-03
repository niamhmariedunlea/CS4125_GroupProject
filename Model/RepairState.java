package Model;

public class RepairState implements ScooterState {

    //Changes the statues of the scooter from its current status to In-Repair 
    public void handleState(Scooter scooter)
    {
        scooter.setStatus("In-Repair");
    }
    
}
