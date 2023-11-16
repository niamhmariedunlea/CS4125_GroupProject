package Model;
public class Scooter {
    private int scooterID;
    public Long qrCode;
    private String currentPosition;
    boolean startRental;
    boolean endRental;

    // used for the battery level 
    private static float fullBatteryLevel = 100.0f;
    private static float batteryConsumption = 0.2f;
    private float batteryLevel;


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

    public float getBatteryLevel(){
        return batteryLevel;
    }

    public void startRental(){
        // when a rental is started it should display the battery level and let the user know how long approx they have


    }

    public void endRental(){
        // ending a rental will calculate the usage and determine if the sscooter should be allowed available or needs to be charged 
        float rentalUsage = calculateBatteruUsage();
        batteryConsumption -= rentalUsage;

        batteryLevel = Math.max(batteryLevel, 0); // don't let the battery go into negative 
    }

    private float calculateBatteruUsage(){
        // add logic here for what we want to minus off based on the time and speed perhaps? 



        return batteryConsumption;
    }

}
