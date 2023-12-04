package Controller;

import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import Model.Register;
import View.*;

public class RegisterController {

    private RegisterView view;
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

}