package Model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Register {

    private String email;
    private String password;
    private String fname;
    private String lname;
 
    public Register(){}
 
    public Register(String email, String password, String fname, String lname){
        this.email = email;
        this.password = password;
        this.fname = fname;
        this.lname = lname;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getFname()
    {
        return fname;
    }

    public void setFname(String fname) 
    {
        this.fname = fname;
    }

        public String getLname()
    {
        return lname;
    }

    public void setLname(String lname) 
    {
        this.lname = lname;
    }

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
}
