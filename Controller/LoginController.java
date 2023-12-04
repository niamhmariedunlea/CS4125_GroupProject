package Controller;

import java.io.IOException;

import Model.Homepage;
import Services.LoginService;
import Services.RegisterService;
import View.AdminView;
import View.HomepageView;
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
        this.view.addLoginButtonListener(e -> {
            try {
                authenticate();
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }); // Add listener for the login button
        this.view.addRegisterButtonListener(e -> handleRegButtonClick()); // Add listener for the register button

    }

    public void authenticate() throws IOException {
        // Delegate authentication to the LoginService
        String email = view.getUserEmail();
        String password = new String(view.getUserPassword());
        boolean loginResult = service.authenticate(email, password);

        // check if admin is logging in 
        if(loginResult){
            boolean isAdminAccount = service.isAdminAccount(email);
            // if the email is of the admin user then create the view to be displayed for the admin
            if (isAdminAccount){
                AdminView adminView = new AdminView();
                AdminController adminController = new AdminController(adminView);
                adminView.setController(adminController);
                adminController.initializeData("scooters.csv"); // file to populate the data 
                adminView.setVisible(true);
            } else {
                view.showLoginResult(true);
                view.setVisible(false);
                HomepageView homepageView = new HomepageView();
                HomepageController homepageController = new HomepageController(homepageView, null);
                homepageView.setController(homepageController);
                homepageView.setVisible(true);
            } 
        }
            else {
                view.showLoginResult(false);
            }
        }
    

    public void setLoginView(LoginView loginView) {
        this.view = loginView;
    }


    public void handleRegButtonClick() {
            RegisterView registerView = new RegisterView();
            RegisterController registerController = new RegisterController(new RegisterService(), registerView);
            registerView.setController(registerController);

            // Hide the login view
            view.setVisible(false);

            // Make the register view visible
            registerView.setVisible(true);
    }
    
}

