import Controller.LoginController;
import Model.Login;
import View.LoginView;

public class TestLogin {

         public static void main(String[] args) {
        Login model = new Login();
        LoginView view = new LoginView();

        LoginController controller = new LoginController(model, view);
     }
    
}
