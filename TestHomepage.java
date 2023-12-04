import Controller.HomepageController;
import Model.ScooterModel;
import View.HomepageView;

public class TestHomepage {


     public static void main(String[] args) {
        ScooterModel model = new ScooterModel();
        HomepageView view = new HomepageView();
        HomepageController controller = new HomepageController(view, model);
    }
 
}
