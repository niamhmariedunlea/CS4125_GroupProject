package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class LoginView extends JFrame {

    private JLabel userEmail, userPass, title;
    private JTextField user;
    private JPasswordField password;
    private JButton loginbtn, registerbtn;

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
 
         
        registerbtn = new JButton("Register");
        registerbtn.setBounds(210, 500, 140, 50);
        add(registerbtn);
        

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

    public void updateView(String newData) {
        userEmail.setText(newData);
    }

    public void addLoginButtonListener(ActionListener listener) 
    {
        loginbtn.addActionListener(listener);
    }

}
