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
