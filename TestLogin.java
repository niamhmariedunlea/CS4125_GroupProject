import Controller.LoginController;
import Model.Account;
import View.LoginView;

public class TestLogin {

         public static void main(String[] args) {
            Account model = new Account();
            LoginView view = new LoginView();
            LoginController controller = new LoginController(model, view);
            view.setController(controller);
     }
    
}
