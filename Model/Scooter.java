public class Scooter {
    private int scooterID;
    public Long qrCode;
    private String currentPosition;

    private enum Status 
    {
        AVAILABLE, 
        UNAVAILABLE,
        BROKEN
    }  
    
    private Status status;

    public Scooter(int scooterID, Long qrCode, String currentPosition, Status status)
    {
        this.scooterID = scooterID;
        this.qrCode = qrCode;
        this.currentPosition = currentPosition;
        this.status = status;
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

    public Status getStatus()
    {
        return status;
    }

    public void setStatus(Status status)
    {
        this.status = status;
    }

    public int amountOfScooters()
    {

    }

    public void addScooter()
    {

    }
}
