import Controller.RegisterController;
import Model.Account;
import View.RegisterView;

public class TestReg {
     public static void main(String[] args) {
        Account model = new Account();
        RegisterView view = new RegisterView();
        RegisterController controller = new RegisterController(model, view);
        view.setController(controller);
     }
}