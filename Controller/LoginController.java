package Controller;

import Services.LoginService;
import View.LoginView;
import View.RegisterView;

public class LoginController {
    
    private LoginView view; 
    private LoginService service;

    public LoginController(LoginService service, LoginView view)
    {
        this.service = service;
        this.view = view;
        this.view.setController(this); // Set the controller in the view
        this.view.addLoginButtonListener(e -> authenticate()); // Add listener for the login button

    }

public void authenticate() {
    // Delegate authentication to the LoginService
    String email = view.getUserEmail();
    String password = new String(view.getUserPassword());
    boolean loginResult = service.authenticate(email, password);
    view.showLoginResult(loginResult);
}

public void setLoginView(LoginView loginView) {
    this.view = loginView;
}


public static void handleRegButtonClick() {
    RegisterView registerView = new RegisterView();
}

    
}
