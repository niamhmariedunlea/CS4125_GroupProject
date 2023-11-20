package Model;

public class RepairState implements ScooterState {

    @Override
    public void rent(Scooter scooter) {
        System.out.println("Scooter is under repair and cannot be rented.");
    }

    @Override
    public void returnScooter(Scooter scooter) {
        System.out.println("Scooter is under repair and cannot be returned.");
    }

    @Override
    public void repair(Scooter scooter) {
        System.out.println("Scooter is already under repair.");
    }

    @Override
    public String getStateName() {
        return "Under Repair";
    }
    
}
