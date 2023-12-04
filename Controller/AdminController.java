package Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Model.RepairState;
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

    public AdminController(AdminView adminView) {
        this.view = adminView;
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
        // Scooter newScooter = new Scooter(
        //     Integer.parseInt(scooterID),
        //     Long.parseLong(qrCode),
        //     currentPosition,
        //     status
    //);

    // Add the new scooter to the CSV file
    //addToCSV(newScooter);

    // Add the new scooter to the JTable in the AdminView
    //view.addRowToTable(newScooter);
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

    public void handleDeleteScooter(String scooterIDToDelete) {
        // Remove the scooter from the CSV file
        removeFromCSV(scooterIDToDelete);
    
        // Remove the scooter from the JTable in the AdminView
        view.removeRowFromTable(scooterIDToDelete);
    }

    private void removeFromCSV(String scooterIDToDelete) {
        // Input file path
        String filePath = "scooters.csv";

        // Create a list to store the lines to keep
        List<String> linesToKeep = new ArrayList<>();
    
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
    
            // Read each line from the CSV file
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into columns
                String[] columns = line.split(",");
    
                // Check if the scooterID matches the one to be deleted
                if (!columns[0].equals(scooterIDToDelete)) {
                    // If not, add the line to the list
                    linesToKeep.add(line);
                }
            }
    
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        // Write the lines back to the original file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : linesToKeep) {
                writer.write(line);
                writer.newLine();
            }
    
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ArrayList<Scooter> readScootersFromCSV() {
        String filePath = "scooters.csv";
        ArrayList<Scooter> scooters = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] columns = line.split(",");
                int scooterID = Integer.parseInt(columns[0]);
                Long qrCode = Long.parseLong(columns[1]);
                String currentPosition = columns[2];
                String status = columns[3];

                // Create a Scooter instance and add it to the ArrayList
                //Scooter scooter = new Scooter(scooterID, qrCode, currentPosition, status);
                //scooters.add(scooter);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return scooters;
    }

    private void writeScootersToCSV(ArrayList<Scooter> scooters) {
        String filePath = "scooters.csv";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Scooter scooter : scooters) {
                String line = scooter.getScooterID() + "," + scooter.getQrCode() + ","
                        + scooter.getCurrentPosition() + "," + scooter.getStatus()
                        + "," + scooter.getBatteryLevel();
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Scooter findScooterByID(int targetID) {
        ArrayList<Scooter> scooters = readScootersFromCSV();
        for (Scooter scooter : scooters) {
            if (scooter.getScooterID() == targetID) {
                return scooter;
            }
        }
        // If no scooter with the matching ID is found, return null
        return null;
    }

    private void setScooterToRepair(String scooterIDToRepair) {
        Scooter scooter = findScooterByID(Integer.parseInt(scooterIDToRepair));
        if (scooter != null) {
            scooter.requestStateChange(new RepairState());
        }
    }

    public void handleSetToRepair(String scooterIDToRepair) throws IOException {
        // Change the status of the scooter to "Repair"
       // setScooterToRepair(scooterIDToRepair);
       findScooterByIDAndUpdateStatus(Integer.parseInt(scooterIDToRepair));

        // Update the table in the AdminView
        view.updateTable(readCSV("scooters.csv"));

    }

    private Scooter findScooterByIDAndUpdateStatus(int targetID) {
        // Read all scooters from the CSV
        ArrayList<Scooter> scooters = readScootersFromCSV();

        // Find the scooter with the matching ID and update its status
        for (Scooter scooter : scooters) {
            if (scooter.getScooterID() == targetID) {
                scooter.requestStateChange(new RepairState());
                break; // No need to continue iterating
            }
        }

        // Write the modified scooters back to the CSV
        writeScootersToCSV(scooters);

        // Return the updated scooter or null if not found
        return scooters.stream()
                .filter(s -> s.getScooterID() == targetID)
                .findFirst()
                .orElse(null);
    }
}

