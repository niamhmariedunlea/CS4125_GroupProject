package Model;

class ScooterSlow extends Scooter {
        //@override  
        public ScooterSlow(int scooterID, Long qrCode, String currentPosition, String status)
    {
        // this.scooterID = scooterID;
        // this.qrCode = qrCode;
        // this.currentPosition = currentPosition;
        // this.state = new AvailableState();
        // this.status = status;
        // this.batteryLevel = fullBatteryLevel;
        super(scooterID, qrCode, currentPosition, status);
        ScooterType = "Slow";
        pricePerKM = "€1/KM";
        speed=3.0;
    }

         public void getSpeed(){  
            speed=3.0;              
       }
       public void setType(){  
        ScooterType="Slow";              
   }   
    }