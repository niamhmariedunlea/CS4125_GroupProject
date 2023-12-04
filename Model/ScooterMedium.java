package Model;

class ScooterMedium extends Scooter {
        //@override  
        public ScooterMedium(int scooterID, Long qrCode, String currentPosition, String status)
    {
        // this.scooterID = scooterID;
        // this.qrCode = qrCode;
        // this.currentPosition = currentPosition;
        // this.state = new AvailableState();
        // this.status = status;
        // this.batteryLevel = fullBatteryLevel;
        super(scooterID, qrCode, currentPosition, status);
        ScooterType = "Medium";
        pricePerKM = "€1.5/KM";
        speed=4.0; 
    }

         public void getSpeed(){  
            speed=4.0;              
       }
       public void setType(){  
        ScooterType="Medium";              
   }   
    }
