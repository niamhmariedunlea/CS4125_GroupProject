package Model;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ScooterFactory {
    public static List<Scooter> createScootersFromCSV(String filePath) {
        List<Scooter> scooters = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {


            System.out.println("not working");

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");

                // Assuming the order of columns in the CSV: ScooterID,QRCode,Location,Status,Battery
                int scooterID = Integer.parseInt(parts[0].trim());
                Long qrCode = Long.parseLong(parts[1].trim());
                String location = parts[2].trim();
                String status = parts[3].trim();
                String battery = parts[4].trim();
                String scooterType = parts[5].trim();

                System.out.println("Adding Scooter");
                System.out.println(scooterID);
                System.out.println(qrCode);
                System.out.println(location);
                System.out.println(status);
                System.out.println(battery);
                System.out.println(scooterType);
                
                Scooter scooter;
                //CREATING DIFF SCOOTER TYPES (FACTORY)
                if(scooterType.equals("Fast")){
                    System.out.println("Creating Fast Scooter");
                    scooter = new ScooterFast(scooterID, qrCode, location, status);
                }
                else if(scooterType.equals("Medium")){
                    System.out.println("Creating Medium Scooter");
                    scooter = new ScooterMedium(scooterID, qrCode, location, status);
                }
                else{
                    System.out.println("Creating Slow Scooter");
                    scooter = new ScooterSlow(scooterID, qrCode, location, status);
                }
    {

                scooters.add(scooter);
            }

        }} catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println("returning: " + scooters.size());
        return scooters;
    }
}
