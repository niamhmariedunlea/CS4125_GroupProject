package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class LoginView {

    private JFrame frame;
    private JLabel userEmail, userPass, title;
    private JTextField user;
    private JPasswordField password;
    private JButton loginbtn;

    public LoginView(){

        frame = new JFrame("Escooter Rental"); 
        frame.setSize(400, 700);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        title = new JLabel("Login");
        title.setBounds(90, 150, 300, 100);
        title.setFont(new Font("Calibri", Font.BOLD, 50));
        frame.add(title);

        userEmail = new JLabel("User Email");
        userEmail.setFont(new Font("Calibri", Font.BOLD, 25));
        userEmail.setBounds(10, 300, 120, 30);
        frame.add(userEmail);

        userPass = new JLabel("Password");
        userPass.setFont(new Font("Calibri", Font.BOLD, 25));
        userPass.setBounds(10, 400, 120, 30);
        frame.add(userPass);

        user = new JTextField();
        user.setBounds(160, 300, 200, 45);
        frame.add(user);

        password = new JPasswordField();
        password.setBounds(160, 400, 200, 45);
        frame.add(password);

        loginbtn = new JButton("Login");
        loginbtn.setBounds(50, 500, 140, 50);
        frame.add(loginbtn);
 
        /* 
        registerbtn = new JButton("Register");
        registerbtn.setBounds(210, 500, 140, 50);
        frame.add(registerbtn);
        registerbtn.addActionListener(this);
        */

        frame.revalidate();
        frame.repaint();
    }

    public String getUserEmail() 
    {
        return user.getText();
    }

    public char[] getUserPassword() 
    {
        return password.getPassword();
    }

    public void addLoginButtonListener(ActionListener listener) 
    {
        loginbtn.addActionListener(listener);
    }

}
