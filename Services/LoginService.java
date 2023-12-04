package Services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import Model.Account;

public class LoginService {

    private static final String CSV_FILE_PATH = "accounts.csv";


    public boolean authenticate(String email, String password) {
        // Logic to verify login credentials
        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Account account = Account.fromCsvString(line);
                if (account.getUlEmail().equals(email) && account.getPassword().equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception based on your needs
        }
        return false;
    }

    public boolean isAdminAccount(String email){
        return email.equals("admin@gmail.com"); // check if the account is admin 
    }


    /* 

    public boolean authenticateUser(String filePath, String email, String password) {
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        String line;
            while ((line = reader.readLine()) != null) {
                String[] userData = line.split(",");
                if (userData.length == 2 && userData[0].equals(email) && userData[1].equals(password)) {
                    return true; // Authentication successful
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; // Authentication failed
    }
    */
    
}
