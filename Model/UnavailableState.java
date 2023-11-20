package Model;

public class UnavailableState implements ScooterState{

    @Override
    public void rent(Scooter scooter) {
        System.out.println("Scooter is not available for rent.");
    }

    @Override
    public void returnScooter(Scooter scooter) {
        System.out.println("Scooter returned.");
        scooter.setState(new AvailableState());
    }

    @Override
    public void repair(Scooter scooter) {
        System.out.println("Scooter is under repair.");
        scooter.setState(new RepairState());
    }

    @Override
    public String getStateName() {
        return "Unavailable";
    }
    
}
