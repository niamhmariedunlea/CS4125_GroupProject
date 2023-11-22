package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CurrentRentalView extends JFrame {

    private JLabel title;
    private TextField scooterID, scooterBattery, scooterStatus, startDate, endDate, price;
    private JButton needsRepairBtn, returnBtn;


    public CurrentRentalView(){
        title = new JLabel("Current Rental");
        title.setBounds(60, 10, 300, 100);
        title.setFont(new Font("Calibri", Font.BOLD, 40));
        add(title);

        scooterID = new TextField("Scooter ID");
        scooterID.setFont(new Font("Calibri", Font.BOLD, 25));
        scooterID.setBounds(20, 120, 150, 50);
        scooterID.setBackground(Color.GRAY);
        add(scooterID);

        scooterBattery = new TextField("Scooter Battery");
        scooterBattery.setFont(new Font("Calibri", Font.BOLD, 25));
        scooterBattery.setBounds(20, 200, 150, 150);
        scooterBattery.setBackground(Color.GRAY);
        add(scooterBattery);

        scooterStatus = new TextField("State");
        scooterStatus.setFont(new Font("Calibri", Font.BOLD, 25));
        scooterStatus.setBounds(20, 375, 250, 50);
        scooterStatus.setBackground(Color.GRAY);
        add(scooterStatus);

        startDate = new TextField("Start Date");
        startDate.setFont(new Font("Calibri", Font.BOLD, 25));
        startDate.setBounds(200, 120, 150, 50);
        startDate.setBackground(Color.GRAY);
        add(startDate);      

        endDate = new TextField("End Date");
        endDate.setFont(new Font("Calibri", Font.BOLD, 25));
        endDate.setBounds(200, 200, 150, 50);
        endDate.setBackground(Color.GRAY);
        add(endDate);

        price = new TextField("Current Price");
        price.setFont(new Font("Calibri", Font.BOLD, 25));
        price.setBounds(200, 280, 150, 50);
        price.setBackground(Color.GRAY);
        add(price);

        // Changes the state to Repair 
        needsRepairBtn = new JButton("Repair");
        needsRepairBtn.setBounds(40, 500, 140, 100);
        needsRepairBtn.setBackground(Color.ORANGE);
        add(needsRepairBtn);
 
         // Ends the rental and changes the state to Available 
        returnBtn = new JButton("End Rental");
        returnBtn.setBounds(210, 500, 140, 100);
        returnBtn.setBackground(Color.GREEN);
        add(returnBtn);


        setSize(400, 700);
        setLayout(null);
        setResizable(false);
        setLocation(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
}
