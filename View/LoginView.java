import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Myframe extends JFrame implements ActionListener {

    Container c;
    JLabel label1, label2, title;
    JTextField user;
    JPasswordField password;
    JButton loginbtn, registerbtn;

    Myframe(){
        setTitle("Login");
        setSize(400, 700);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Welcome");
        title.setBounds(90, 150, 300, 100);
        title.setFont(new Font("Calibri", Font.BOLD, 50));
        c.add(title);

        label1 = new JLabel("User Email");
        label1.setFont(new Font("Calibri", Font.BOLD, 25));
        label2 = new JLabel("Password");
        label2.setFont(new Font("Calibri", Font.BOLD, 25));

        label1.setBounds(10, 300, 120, 30);
        label2.setBounds(10, 400, 120, 30);

        c.add(label1);
        c.add(label2);

        user = new JTextField();
        user.setBounds(160, 300, 200, 45);
        c.add(user);

        password = new JPasswordField();
        password.setBounds(160, 400, 200, 45);
        c.add(password);

        loginbtn = new JButton("Login");
        loginbtn.setBounds(50, 500, 140, 50);
        c.add(loginbtn);

        registerbtn = new JButton("Register");
        registerbtn.setBounds(210, 500, 140, 50);
        c.add(registerbtn);
        registerbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0)
            {
                String email = user.getText();
                String pass = user.getText();

                RegisterView registerForm = new RegisterView();
                registerForm.setVisible(true);

            }
        });

        loginbtn.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        System.out.println("User Email: " + user.getText());
        System.out.println("Password: " + password.getText());

    }

}
class LoginView {
    public static void main(String args[]) {
        Myframe frame = new Myframe();

    }
    
}
