package View;

import java.awt.BorderLayout;
import java.awt.Font;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controller.AdminController;
import Model.Scooter;

public class AdminView extends JFrame {
    private JLabel title;
    private DefaultTableModel tableModel;
    private JButton addButton;
    private JButton deleteButton;
    private AdminController controller;

    public AdminView() throws IOException{

        String[] columns = {"Scooter ID", "QR Code", "Current Position", "Status", "Battery"};
        //String [][] data = controller.readCSV("accounts.csv");

        tableModel = new DefaultTableModel(columns, 0);
        JTable scooterTable = new JTable(tableModel);
        scooterTable.setBounds(90, 150, 300, 300);

        JScrollPane scrollPane = new JScrollPane(scooterTable);

        // Create "Add Scooter" button
        addButton = new JButton("Add Scooter");
        // Add action listener for the "Add Scooter" button
        addButton.addActionListener(e -> {
    // Example: Prompt the user for input (you can use a dialog or any other method)
            String scooterID = JOptionPane.showInputDialog("Enter Scooter ID:");
            String qrCode = JOptionPane.showInputDialog("Enter QR Code:");
            String currentPosition = JOptionPane.showInputDialog("Enter Current Position:");
            String status = JOptionPane.showInputDialog("Enter Status:");

            // Handle adding the scooter
            controller.handleAddScooter(scooterID, qrCode, currentPosition, status);
        });
        addButton.setBounds(0, 500, 400, 50);
        add(addButton);

        deleteButton = new JButton("Delete Selected Scooter");
        deleteButton.addActionListener(e -> {
        // Get the selected row from the table
        int selectedRow = scooterTable.getSelectedRow();
    
        // Check if a row is selected
        if (selectedRow >= 0) {
        // Get the scooter ID from the selected row
            String scooterIDToDelete = (String) tableModel.getValueAt(selectedRow, 0);

            // Handle deleting the scooter
            controller.handleDeleteScooter(scooterIDToDelete);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a scooter to delete.", "No Scooter Selected", JOptionPane.WARNING_MESSAGE);
        }
        });
        deleteButton.setBounds(0, 550, 400, 50);
        add(deleteButton);

        // Add the delete button to the view
        //add(deleteButton, BorderLayout.SOUTH);

        title = new JLabel("Admin Page");
        //title.setBounds(90, 100, 300, 100);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(new Font("Calibri", Font.BOLD, 50));
        add(title);

        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(title, BorderLayout.NORTH);
        //add(addButton, BorderLayout.SOUTH);


        setSize(400, 700);
        //setLayout(null);
        setResizable(false);
        //setLocation(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }


    public void setController(AdminController controller) {
        this.controller = controller;

        // After setting the controller, initialize data
        try {
            controller.initializeData("scooters.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updateTable(String[][] data) {
        // Clear existing data in the table model
        tableModel.setRowCount(0);

        // Add new data to the table model
        for (String[] rowData : data) {
            tableModel.addRow(rowData);
        }
    }

    public void addRowToTable(Scooter scooter) {
        // Add a new row to the JTable with scooter details
        Object[] rowData = {scooter.getScooterID(), scooter.getQrCode() ,scooter.getCurrentPosition(), scooter.getStatus(), scooter.getBatteryLevel()};
        tableModel.addRow(rowData);
    }

    public void removeRowFromTable(String scooterIDToDelete) {
        // Find the row index based on the scooter ID
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            if (tableModel.getValueAt(i, 0).equals(scooterIDToDelete)) {
                // Remove the row from the table model
                tableModel.removeRow(i);
                break;
            }
        }
    }
    
}
