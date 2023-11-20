package Model;
public class Scooter {
    private int scooterID;
    public Long qrCode;
    private String currentPosition;
    private ScooterState state;

    
    private Status status;

    public Scooter(int scooterID, Long qrCode, String currentPosition, ScooterState state)
    {
        this.scooterID = scooterID;
        this.qrCode = qrCode;
        this.currentPosition = currentPosition;
        this.state = new AvailableState();
    }

    public int getScooterID()
    {
        return scooterID;
    }

    public void setScooterID(int scooterID)
    {
        this.scooterID = scooterID;
    }

    public Long getQrCode()
    {
        return qrCode;
    }

    public void setQrCode(Long qrCode)
    {
        this.qrCode = qrCode;
    }

    public String getCurrentPosition()
    {
        return currentPosition;
    }

    public void setCurrentPosition(String currentPosition)
    {
        this.currentPosition = currentPosition;
    }

    public String getStateName() {
        return state.getStateName();
    }

    public void setState(ScooterState state) {
        this.state = state;
    }

    public int amountOfScooters()
    {

    }

    public void addScooter()
    {

    }
}
