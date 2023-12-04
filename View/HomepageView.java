package View;

import javax.swing.*;
import javax.swing.event.ListSelectionListener;
import Model.Scooter;
import Model.ScooterFactory;
import java.util.List;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HomepageView extends JFrame {
    private JList<String> scooterList;
    private DefaultListModel<String> listModel;
    private JLabel title2;
    private JLabel subTitle;
    private JButton rentButton;
    private JButton returnButton;

    public HomepageView() {
        title2 = new JLabel("Scooter List");
        title2.setBounds(120, 50, 300, 100);
        title2.setFont(new Font("Calibri", Font.BOLD, 30));

        subTitle = new JLabel("Double click a Scooter for more details");
        subTitle.setBounds(100, 100, 300, 30);
        subTitle.setFont(new Font("Calibri", Font.ITALIC, 12));

        listModel = new DefaultListModel<>();
        scooterList = new JList<>(listModel);
        scooterList.setBounds(50, 150, 300, 400);
        scooterList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        rentButton = new JButton("Rent");
        rentButton.setBounds(50, 550, 100, 30);

        returnButton = new JButton("Return");
        returnButton.setBounds(250, 550, 100, 30);

        add(title2);
        add(subTitle);
        add(scooterList);
        add(rentButton);  // Added rent button to the frame
        add(returnButton);  // Added return button to the frame

        setSize(400, 650);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null); // Center the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // Display scooters when the frame is created
        displayScooters(ScooterFactory.createScootersFromCSV("scooters.csv"));

        // Add a selection listener
        scooterList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                String selectedScooter = scooterList.getSelectedValue();
                // Do something with the selected scooter, e.g., show details
                System.out.println("Selected Scooter: " + selectedScooter);
            }
        });
    }

    private void showScooterDetailsPopup(Scooter selectedScooter) {
        String scooterDetails = "Scooter ID: " + selectedScooter.getScooterID() + "\n"
                + "Status: " + selectedScooter.getStatus() + "\n"
                + "Type: " + selectedScooter.getType() + "\n"
                + "Speed: " +selectedScooter.getTypeSpeed()+ "\n"
                + "Price/KM: " + selectedScooter.getPrice()+ "\n"
                + "Battery Level: " + selectedScooter.getBatteryLevel()+ "\n"
                + "QrCode: " + selectedScooter.getQrCode()+ "\n"
                + "Current Location: " + selectedScooter.getCurrentPosition();

        JOptionPane.showMessageDialog(this, scooterDetails, "Scooter Details", JOptionPane.INFORMATION_MESSAGE);
    }

    public void displayScooters(List<Scooter> scooters) {
        listModel.removeAllElements(); // Clear the existing list
        for (Scooter scooter : scooters) {
            String scooterInfo = scooter.getScooterID() + " - " + scooter.getStatus() + " Location: " + scooter.getCurrentPosition();
            listModel.addElement(scooterInfo);
        }
    }

    public void addRentButtonListener(ActionListener listener) {
        rentButton.addActionListener(listener);
    }

    public void addReturnButtonListener(ActionListener listener) {
        returnButton.addActionListener(listener);
    }

    public void addScooterListSelectionListener(ListSelectionListener listener) {
        scooterList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) { // Double-click detected
                    int selectedIndex = getSelectedScooterIndex();
                    if (selectedIndex != -1) {
                        Scooter selectedScooter = ScooterFactory.createScootersFromCSV("scooters.csv").get(selectedIndex);
                        showScooterDetailsPopup(selectedScooter);
                    }
                }
            }
        });

        scooterList.addListSelectionListener(listener);
    }

    public void setRentButtonEnabled(boolean enabled) {
        rentButton.setEnabled(enabled);
    }

    public void setReturnButtonEnabled(boolean enabled) {
        returnButton.setEnabled(enabled);
    }

    public int getSelectedScooterIndex() {
        return scooterList.getSelectedIndex();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new HomepageView());
    }
}