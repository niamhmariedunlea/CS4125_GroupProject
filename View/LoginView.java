package View;

import javax.swing.*;

import Controller.LoginController;

import java.awt.*;
import java.awt.event.*;
<<<<<<< HEAD
=======
import java.io.IOException;
>>>>>>> origin/week8


public class LoginView extends JFrame {

    private JLabel userEmail, userPass, title;
    private JTextField user;
    private JPasswordField password;
    private JButton loginbtn, registerbtn;
    private LoginController controller;
<<<<<<< HEAD
    private RegisterView registerView;
=======

>>>>>>> origin/week8

    public LoginView(){

        title = new JLabel("Login");
        title.setBounds(90, 150, 300, 100);
        title.setFont(new Font("Calibri", Font.BOLD, 50));
        add(title);

        userEmail = new JLabel("User Email");
        userEmail.setFont(new Font("Calibri", Font.BOLD, 25));
        userEmail.setBounds(10, 300, 120, 30);
        add(userEmail);

        userPass = new JLabel("Password");
        userPass.setFont(new Font("Calibri", Font.BOLD, 25));
        userPass.setBounds(10, 400, 120, 30);
        add(userPass);

        user = new JTextField();
        user.setBounds(160, 300, 200, 45);
        add(user);

        password = new JPasswordField();
        password.setBounds(160, 400, 200, 45);
        add(password);

        loginbtn = new JButton("Login");
        loginbtn.setBounds(50, 500, 140, 50);
        add(loginbtn);
        loginbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
                String email = user.getText();
                String newpassword = new String(password.getPassword());
                // Pass the file path to the controller when calling authenticateUser
                controller.authenticateUser("user_data.csv", email, newpassword);
=======
                try {
                    controller.authenticate();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
>>>>>>> origin/week8
            }
        });
 
         
        registerbtn = new JButton("Register");
        registerbtn.setBounds(210, 500, 140, 50);
        add(registerbtn);
        registerbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
=======
                /* 
>>>>>>> origin/week8
                dispose();
                registerView = new RegisterView();
                registerView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                registerView.setVisible(true);
<<<<<<< HEAD

            }
        });
        

=======
                */
                controller.handleRegButtonClick(); // Use the controller method

            }
        });
    
>>>>>>> origin/week8
        //revalidate();
        //repaint();
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

<<<<<<< HEAD
    public void updateView(String newData) {
        userEmail.setText(newData);
    }

=======
>>>>>>> origin/week8
    public void addLoginButtonListener(ActionListener listener) 
    {
        loginbtn.addActionListener(listener);
    }

<<<<<<< HEAD
=======
    public void addRegisterButtonListener(ActionListener listener) {
        registerbtn.addActionListener(listener);
    }

>>>>>>> origin/week8
    public void setController(LoginController controller) {
        this.controller = controller;
    }

    public void showLoginResult(boolean isAuthenticated) {
        if (isAuthenticated) {
            JOptionPane.showMessageDialog(this, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
<<<<<<< HEAD
=======


>>>>>>> origin/week8
        } else {
            JOptionPane.showMessageDialog(this, "Login failed. Invalid email or password.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
