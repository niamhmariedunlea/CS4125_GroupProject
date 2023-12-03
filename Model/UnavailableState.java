package Model;

public class UnavailableState implements ScooterState{

    //Changes the statues of the scooter from its current status to Unavailable  
    public void handleState(Scooter scooter)
    {
        scooter.setStatus("Unavailable");
    }
    
}
