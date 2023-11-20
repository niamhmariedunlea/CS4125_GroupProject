package Model;

// State interface
interface ScooterState {
    void rent(Scooter scooter);

    void returnScooter(Scooter scooter);

    void repair(Scooter scooter);

    String getStateName();
}