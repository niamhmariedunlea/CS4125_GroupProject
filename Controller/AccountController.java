package Controller;

import Model.Account;
import View.*;

public class AccountController {
    private Account model;
    private AccountView view;

    public AccountController(Account model, AccountView view)
    {
        this.model = model;
        this.view = view;
    }
    
    private String firstName;
    private String lastName;

    public int getUserID()
    {
        return model.getUserID();
    }

    public void setUserID(int userID)
    {
        model.setUserID(userID);
    }

    public String getUlEmail()
    {
        return model.getUlEmail();
    }

    public void setUlEmail(String ulEmail)
    {
        model.setUlEmail(ulEmail);
    }

    public String getPassword()
    {
        return model.getPassword();
    }

    public void setPassword(String password)
    {
        model.setPassword(password);
    }

    public String getFirstName()
    {
        return model.getFirstName();
    }

    public void setFirstName(String firstName)
    {
        model.setFirstName(firstName);
    }

    public String getLastName()
    {
        return model.getLastName();
    }

    public void setLastName(String lastName)
    {
        model.setLastName(lastName);
    }

    
}
