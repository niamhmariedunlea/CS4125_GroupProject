package Controller;

import Model.Account;
import Services.RegisterService;
import View.*;

public class RegisterController {

    private RegisterView view;
    private RegisterService registerService;

    public RegisterController(RegisterService registerService, RegisterView view) {
        this.registerService = registerService;
        this.view = view;
        this.view.setController(this);
    }

    public void handleButtonClick() {
        String email = view.getUserEmail();
        String password = new String(view.getUserPassword());
        String firstname = view.getUserFname();
        String lastname = view.getUserLname();

        // Call the register method in the RegisterService
        Account newAccount = registerService.register(email, password, firstname, lastname);

        // You can update the view or handle the result as needed
        view.showRegisterResult(newAccount != null);
    }

    public void setRegisterView(RegisterView view) {
        this.view = view;
    }
}