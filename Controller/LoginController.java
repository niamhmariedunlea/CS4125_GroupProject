package Controller;

import java.awt.event.ActionEvent;

import Model.Login;
import View.*;

public class LoginController {
    
    private LoginView view;
    private Login model; 

    public LoginController(Login model, LoginView view)
    {
        this.model = model;
        this.view = view;

        view.addLoginButtonListener((ActionEvent e) -> 
        {
            view.getUserEmail();
            view.getUserPassword();

        });

        view.addLoginButtonListener(e -> handleButtonClick());
    }



    private void handleButtonClick() {
        // Get user input from the view
        String userEmail = view.getUserEmail();
        //String userPass = view.getUserPassword();

        // Update the model
        model.setEmail(userEmail);

        // Update the view
        view.updateView(model.getEmail());
        //view.updateView(model.getPassword());
}

public void authenticateUser(String filePath, String email, String password) {
    boolean isAuthenticated = model.authenticateUser(filePath, email, password);
    view.showLoginResult(isAuthenticated);
}
    
}
