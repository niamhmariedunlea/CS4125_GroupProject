public abstract class scooterDecorator implements Scooter{

private Scooter decoratedScooter;

public scooterDecorator(Scooter decoratedScooter){
    this.decoratedScooter = decoratedScooter;
}

public float getBatteryLevel(){
    float batteryLevel = decoratedScooter.getBatteryLevel();
    // update the controller here?

}

public void startRental(){
    decoratedScooter.startRental();
}

public void endRental(){
    decoratedScooter.endRental();
}



}