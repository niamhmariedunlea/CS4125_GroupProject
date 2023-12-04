package Model;

public class UnavailableState implements ScooterState{

<<<<<<< HEAD

=======
    //Changes the statues of the scooter from its current status to Unavailable  
>>>>>>> origin/week8
    public void handleState(Scooter scooter)
    {
        scooter.setStatus("Unavailable");
    }
    
}
