import Controller.HomepageController;
import Model.Homepage;
import View.HomepageView;

public class TestHomepage {


     public static void main(String[] args) {
        Homepage model = new Homepage();
        HomepageView view = new HomepageView();
        HomepageController controller = new HomepageController(view, model);
    }
 
}
