import Controller.AccountController;
import Model.Account;
import View.AccountView;

public class TestAcc {
    public static void main(String[] args) {
        Account model = new Account();
        AccountView view = new AccountView();

        AccountController controller = new AccountController(model, view);

    }
    
}
