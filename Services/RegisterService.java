package Services;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import Model.Account;

public class RegisterService {

    private static final String CSV_FILE_PATH = "accounts.csv";

        public Account register(String email, String password, String firstname, String lastname) {

        if (!email.endsWith("ul.ie")) {
                // Email doesn't end with "ul.ie", handle this case (throw an exception, return an error response, etc.)
                throw new IllegalArgumentException("You must be a current UL staff member or student!");
        }
        // Logic to create a new account
        Account newAccount = new Account();
        newAccount.setUlEmail(email);
        newAccount.setPassword(password);
        newAccount.setFirstName(firstname);
        newAccount.setLastName(lastname);

        // Write the new account to the CSV file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CSV_FILE_PATH, true))) {
            writer.write(newAccount.toCsvString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception based on your needs
        }

        return newAccount;
    }
    
}
