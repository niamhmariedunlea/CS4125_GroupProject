package Model;

public class AvailableState implements ScooterState {
    
    public void handleState(Scooter scooter)
    {
        scooter.setStatus("Available");
    }
    
}
