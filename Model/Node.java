package Model;

import java.util.List;

public class Node {

    private int nodeID;
    private String position;
    private List<Scooter> availableScooters;

public Node(){

};

    public Node(int nodeID, String position, List<Scooter> availableScooters)
    {
        this.nodeID = nodeID;
        this.position = position;
        this.availableScooters = availableScooters;
    }

    public int getNodeID()
    {
        return nodeID;
    }

    public void setNodeID(int nodeID)
    {
        this.nodeID = nodeID;
    }

    public String getPosition()
    {
        return position;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }

    public List<Scooter> getAvailableScooters()
    {
        return availableScooters;
    }

    public void setAvailableScooters(List<Scooter> availableScooters){
        this.availableScooters = availableScooters;
    }

    // Should these be in the controller?

<<<<<<< HEAD
    // public Boolean rentScooter(int scooterID)
    // {
    //     // if () {
    //     //     return true;
    //     // }
    //     // else 
    //     // {
    //     //     return false;
    //     // }

    // }

    public void returnScooter(int scooterID)
    {

    }
    
}
=======
    public boolean rentScooter(int scooterID){
        for (Scooter scooter : availableScooters){
            if(scooter.getScooterID() == scooterID && scooter.getStatus().equals("Available")){
                scooter.setStatus("Rented");
                return true;
        }
    } return false;
} 

    public boolean returnScooter(int scooterID){
        for (Scooter scooter : availableScooters){
            if(scooter.getScooterID() == scooterID && scooter.getStatus().equals("Repair")){
                scooter.setStatus("Available");
                return true;
            }
        } return false;        
    }
}  
>>>>>>> origin/week8
