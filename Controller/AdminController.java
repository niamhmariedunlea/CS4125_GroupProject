package Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Model.Scooter;
import View.AdminView;

public class AdminController {

    private AdminView view;
    private Scooter model;

    public AdminController(AdminView view, Scooter model){
        this.view = view;
        this.model = model;
        this.view.setController(this);
    }

    public String[][] readCSV(String filePath) throws IOException {
        List<String[]> allData = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line into individual columns
                String[] row = line.split(",");

                // Add the row to the list
                allData.add(row);
            }
        }

                // Convert List to 2D array
                String[][] dataArray = new String[allData.size()][];
                dataArray = allData.toArray(dataArray);
        
                return dataArray;
            }

    public void initializeData(String filePath) throws IOException {
        String[][] data = readCSV(filePath);
        view.updateTable(data);
    }
            

    public void handleAddScooter(String scooterID, String qrCode, String currentPosition, String status) {
        Scooter newScooter = new Scooter(
            Integer.parseInt(scooterID),
            Long.parseLong(qrCode),
            currentPosition,
            status
    );

    // Add the new scooter to the CSV file
    addToCSV(newScooter);

    // Add the new scooter to the JTable in the AdminView
    view.addRowToTable(newScooter);
    }


    private void addToCSV(Scooter scooter) {
        // Add logic to write the scooter details to the CSV file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("scooters.csv", true))) {
            // Format the scooter details as a CSV line
            String csvLine = String.format("%d,%d,%s,%s\n", scooter.getScooterID(), scooter.getQrCode(),
                    scooter.getCurrentPosition(), scooter.getStatus());

            // Write the line to the CSV file
            writer.write(csvLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
