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
    }
    
}
