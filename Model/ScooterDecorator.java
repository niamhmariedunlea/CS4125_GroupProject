package Model;

public class ScooterDecorator implements Scooter {

    private Scooter decoratedScooter;

    public ScooterDecorator(Scooter decoratedScooter){
    this.decoratedScooter = decoratedScooter;
}

public float getBatteryLevel(){
    batteryLevel = decoratedScooter.getBatteryLevel();

    float updateBatteryLevel = batteryLevel - (batteryLevel * 0.1f); // decrease battery by 10% 

    return updateBatteryLevel;

}



}