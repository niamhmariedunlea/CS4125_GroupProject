package Model;
public class Scooter {
    private int scooterID;
    public Long qrCode;
    private String currentPosition;
    private ScooterState state;
  
    boolean startRental;
    boolean endRental;

    // used for the battery level 
    private static float fullBatteryLevel = 100.0f;
    public double batteryLevel;
    
    private String status;

    public Scooter(){};

    public Scooter(int scooterID, Long qrCode, String currentPosition, String status)
    {
        this.scooterID = scooterID;
        this.qrCode = qrCode;
        this.currentPosition = currentPosition;
        // Any scooter automatically gets created with the automatic status
        this.state = new AvailableState();
        this.status = status;
        this.batteryLevel = fullBatteryLevel;
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

    public void setState(ScooterState state) {
        this.state = state;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    // Use this function to set the status of the scooter
    public void requestStateChange(ScooterState newState) 
    {
        setState(newState);
        state.handleState(this);
    }

    public void addScooter()
    {

    }

    public double getBatteryLevel(){
        return batteryLevel;
    }

    public void startRental(){
        // when a rental is started it should display the battery level and let the user know how long approx they have
        System.out.println("Your rental has started at INSERT DATE TIME HERE ");

    }

    public void endRental(){
        // ending a rental will calculate the usage and determine if the sscooter should be allowed available or needs to be charged 
        // needs to call decorator? 

        System.out.println("Your rental has ended at INSERT DATE TIME HERE ");

    
    }

}
