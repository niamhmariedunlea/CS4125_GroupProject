package View;

import javax.swing.*;

import Controller.RegisterController;

import java.awt.*;
import java.awt.event.*;


 public class RegisterView extends JFrame {

    JLabel title, label1, label2, label3, label4;
    JTextField user, fname, lname;
    JPasswordField password;
    JButton registerbtn;
    RegisterController controller;

    public RegisterView(){

        title = new JLabel("Register");
        title.setBounds(90, 100, 300, 100);
        title.setFont(new Font("Calibri", Font.BOLD, 50));
        add(title);

        label1 = new JLabel("User Email");
        label1.setFont(new Font("Calibri", Font.BOLD, 25));
        label2 = new JLabel("Password");
        label2.setFont(new Font("Calibri", Font.BOLD, 25));
        label3 = new JLabel("First Name");
        label3.setFont(new Font("Calibri", Font.BOLD, 25));
        label4 = new JLabel("Last Name");
        label4.setFont(new Font("Calibri", Font.BOLD, 25));

        label1.setBounds(10, 200, 120, 30);
        label2.setBounds(10, 300, 120, 30);
        label3.setBounds(10, 400, 120, 30);
        label4.setBounds(10, 500, 120, 30);

        
        add(label1);
        add(label2);
        add(label3);
        add(label4);


        user = new JTextField();
        user.setBounds(160, 200, 200, 45);
        add(user);

        password = new JPasswordField();
        password.setBounds(160, 300, 200, 45);
        add(password);

        
        fname = new JTextField();
        fname.setBounds(160, 400, 200, 45);
        add(fname);

        lname = new JTextField();
        lname.setBounds(160, 500, 200, 45);
        add(lname);

        registerbtn = new JButton("Register");
        registerbtn.setBounds(50, 600, 240, 50);
        add(registerbtn);
        registerbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = user.getText();
                String newpassword = new String(password.getPassword());
                String firstname = fname.getText();
                String lastname = lname.getText();
                // Pass the file path to the controller when calling authenticateUser
                controller.registerUser("account_data.csv", email, newpassword, firstname, lastname);
            }
        });

        setSize(400, 700);
        setLayout(null);
        setResizable(false);
        setLocation(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    
    }

    public String getUserEmail() 
    {
        return user.getText();
    }

    public char[] getUserPassword() 
    {
        return password.getPassword();
    }

    public String getUserFname()
    {
        return fname.getText();
    }

    public String getUserLname()
    {
        return lname.getText();
    }

    public void updateView(String newData) {
        user.setText(newData);
    }
        
    public void setController(RegisterController controller) {
        this.controller = controller;
    }
    

    public void addRegisterButtonListener(ActionListener listener) 
    {
        registerbtn.addActionListener(listener);
    }

    public void showRegisterResult(boolean isRegistered) {
        if (isRegistered) {
            JOptionPane.showMessageDialog(this, "Registration successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Registration failed. Try Again!.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

