package Model;

public class AvailableState implements ScooterState {
    
    @Override
    public void rent(Scooter scooter) {
        System.out.println("Scooter rented.");
        scooter.setState(new UnavailableState());
    }

    @Override
    public void returnScooter(Scooter scooter) {
        System.out.println("Scooter is already available.");
    }

    @Override
    public void repair(Scooter scooter) {
        System.out.println("Scooter is not under repair.");
    }

    @Override
    public String getStateName() {
        return "Available";
    }
    
}
