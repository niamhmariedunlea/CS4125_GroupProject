package Model;


class ScooterFast extends Scooter {
         //@override  
        public ScooterFast(int scooterID, Long qrCode, String currentPosition, String status)
    {
        // this.scooterID = scooterID;
        // this.qrCode = qrCode;
        // this.currentPosition = currentPosition;
        // this.state = new AvailableState();
        // this.status = status;
        // this.batteryLevel = fullBatteryLevel;
        super(scooterID, qrCode, currentPosition, status);
        ScooterType = "Fast";
        pricePerKM = "€200/KM";
        speed=5.0;  
    }

         public void getSpeed(){  
            speed=5.0;              
       }
        public void setType(){  
            ScooterType="Fast";              
       } 
    }
    