package Model;

public class AvailableState implements ScooterState {

    //Changes the statues of the scooter from its current status to Available 
    public void handleState(Scooter scooter)
    {
        scooter.setStatus("Available");
    }
    
}
