import Controller.LoginController;
import Controller.RegisterController;


import Services.LoginService;
import Services.RegisterService;

import View.LoginView;
import View.RegisterView;

public class Main {
    public static void main(String[] args){
        // Create an instance of LoginService
        LoginService loginService = new LoginService();
        RegisterService registerService = new RegisterService();

        // Create an instance of LoginView
        LoginView loginView = new LoginView();
        RegisterView registerView = new RegisterView();

        // Create an instance of LoginController and pass both LoginService and LoginView
        LoginController loginController = new LoginController(loginService, loginView);
        RegisterController registerController = new RegisterController(registerService, registerView);

        // Set the LoginView in the LoginController
        loginController.setLoginView(loginView);
        registerController.setRegisterView(registerView);

    }
    
}
