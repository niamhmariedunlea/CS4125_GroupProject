package Controller;

<<<<<<< HEAD
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import Model.Register;
=======
import Model.Account;
import Services.RegisterService;
>>>>>>> origin/week8
import View.*;

public class RegisterController {

    private RegisterView view;
<<<<<<< HEAD
    private Register model; 


    public RegisterController(Register model, RegisterView view)
    {
        this.model = model;
        this.view = view;

        view.addRegisterButtonListener((ActionEvent e) -> 
        {
            view.getUserEmail();
            view.getUserPassword();

        });

        view.addRegisterButtonListener(e -> handleButtonClick());
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

public void registerUser(String filePath, String email, String newpassword, String firstname, String lastname) {
    boolean isRegistered = model.registerUser(filePath, email, newpassword, firstname, lastname);
    view.showRegisterResult(isRegistered);
}

=======
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
>>>>>>> origin/week8
}