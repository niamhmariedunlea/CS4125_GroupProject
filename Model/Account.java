package Model;

public class Account {

    //private int userID;
    private String ulEmail;
    private String password;
    private String firstName;
    private String lastName;

    public Account(){};

    public Account(String ulEmail, String password, String firstName, String lastName)
    {
        this.ulEmail = ulEmail;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /* 
    public int getUserID()
    {
        return userID;
    }

    public void setUserID(int userID)
    {
        this.userID = userID;
    }
    */

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

    public String toCsvString() {
        return ulEmail + "," + password + "," + firstName + "," + lastName;
    }

    public static Account fromCsvString(String csvString) {
        String[] fields = csvString.split(",");
        Account account = new Account();
        account.setUlEmail(fields[0]);
        account.setPassword(fields[1]);
        account.setFirstName(fields[2]);
        account.setLastName(fields[3]);
        return account;
    }

    public int getUserID() {
        return 0;
    }

    public void setUserID(int userID) {
    }
}
