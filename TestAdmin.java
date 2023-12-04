import java.io.IOException;

import Controller.AdminController;
import Model.Scooter;
import View.AdminView;

public class TestAdmin {

    public static void main(String[] args) throws IOException {
        Scooter model = new Scooter();
        AdminView view = new AdminView();
        AdminController controller = new AdminController(view, model);
        controller.initializeData("scooters.csv");
    }
    
}
