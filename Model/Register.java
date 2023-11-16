package Model;

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
    
}
