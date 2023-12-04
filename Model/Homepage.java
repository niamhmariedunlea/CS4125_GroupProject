// package Model;

// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;
// import java.util.List;

// public class Homepage {

//     private String email;
//     private String password;
//     private ScooterFactory scooterFactory;
 
//     public Homepage(){
//         this.scooterFactory = new ScooterFactory();
//     }

//     public List<Scooter> createScooterList() {
//         return scooterFactory.createScooterListf(5);
//     }

//     public boolean authenticateUser(String filePath, String email, String password) {
//         try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
//             String line;
//             while ((line = reader.readLine()) != null) {
//                 String[] userData = line.split(",");
//                 if (userData.length == 2 && userData[0].equals(email) && userData[1].equals(password)) {
//                     return true; // Authentication successful
//                 }
//             }
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//         return false; // Authentication failed
//     }
    
// }
