package Services;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import Model.Account;

public class RegisterService {

    private static final String CSV_FILE_PATH = "accounts.csv";

        public Account register(String email, String password, String firstname, String lastname) {
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


/*
    public boolean registerUser(String filePath, String email, String newpassword, String firstname, String lastname) {
    try (PrintWriter writer = new PrintWriter(new FileWriter(filePath, true))) {
            // Append user data to the CSV file
            writer.println(String.format("%s,%s,%s,%s",
                    email,
                    newpassword,
                    firstname,
                    lastname));
                    return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    */
    
}
