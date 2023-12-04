package Model;

import java.util.Arrays;
import java.util.ArrayList;

public class NodeService {
    

// display list of scooters in a location 
public static Scooter getScooters(){
    ArrayList<Scooter> listOfScooters = new ArrayList<Scooter>();
    int i = 0;

    if (listOfScooters.size() > 0){
        Scooter scooter = listOfScooters.get(i);
        i++;
        return scooter;
    } else {
        return null;
    }
}

}
