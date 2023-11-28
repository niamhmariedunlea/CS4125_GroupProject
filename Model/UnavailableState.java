package Model;

public class UnavailableState implements ScooterState{


    public void handleState(Scooter scooter)
    {
        scooter.setStatus("Unavailable");
    }
    
}
