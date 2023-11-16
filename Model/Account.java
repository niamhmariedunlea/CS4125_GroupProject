package Model;
public class Account {

    private int userID;
    private String ulEmail;
    private String password;
    private String firstName;
    private String lastName;

    public Account(){};

    public Account(int userID, String ulEmail, String password, String firstName, String lastName)
    {
        this.userID = userID;
        this.ulEmail = ulEmail;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getUserID()
    {
        return userID;
    }

    public void setUserID(int userID)
    {
        this.userID = userID;
    }

    public String getUlEmail()
    {
        return ulEmail;
    }

    public void setUlEmail(String ulEmail)
    {
        this.ulEmail = ulEmail;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    
}
