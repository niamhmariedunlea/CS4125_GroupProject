import Controller.RegisterController;
import Model.Register;
import View.RegisterView;

public class TestReg {
     public static void main(String[] args) {
        Register model = new Register();
        RegisterView view = new RegisterView();

        RegisterController controller = new RegisterController(model, view);
     }
}