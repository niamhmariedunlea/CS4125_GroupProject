package Model;

import java.util.Random;

public abstract class Scooter {
    private int scooterID;
    public Long qrCode;
    private String currentPosition;
    private ScooterState state;
    
    //Factory Method
    protected double speed;
    protected String pricePerKM;
    protected String ScooterType;
    abstract void getSpeed();
    abstract void setType();
  
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

    public String getDetails() {
        Random random = new Random();
        int randomNumber = random.nextInt(20) + 1;
        
        return "Scooter: " + getScooterID() + getStatus();
    }

    public String getType() {
        return ScooterType;
    }

    public String getPrice() {
        return pricePerKM;
    }

    public double getTypeSpeed() {
        return speed;
    }

    //factory method blurb
    // class fastScooter extends Scooter {
    //      //@override  
    //      public void getSpeed(){  
    //         speed=3.0;              
    //    }  
    // }

    // // class slowScooter extends Scooter {
    // //     //@override  
    // //      public void getSpeed(){  
    // //         speed=5.0;              
    // //    }  
    // // }

    // class mediumScooter extends Scooter {
    //     //@override  
    //      public void getSpeed(){  
    //         speed=4.0;              
    //    }  
    // }

}
