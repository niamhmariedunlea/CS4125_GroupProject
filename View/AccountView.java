
/*
 * Author: Niamh Dunlea 
 * Date: October/November 2023
 */

public class AccountView extends IUserLogin {
    public boolean queryAccount;
    public boolean insertAccount;
    public boolean updateAccount;


    public void displayAccountInformation(int userID, String ulEmail, String firstName, String lastName){
        System.out.println("Account information: ");
            System.out.println("User ID: " + userID);
            System.out.println("User email: " + ulEmail);
            System.out.println("Name: " + firstName + lastName);
       
        }
}
