import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class RegisterView extends JFrame implements ActionListener {

    Container c;
    JLabel title, label1, label2, label3, label4;
    JTextField user, fname, lname;
    JPasswordField password;
    JButton registerbtn;

    RegisterView(){
        setTitle("Register");
        setSize(400, 700);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Register");
        title.setBounds(90, 100, 300, 100);
        title.setFont(new Font("Calibri", Font.BOLD, 50));
        c.add(title);

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

        
        c.add(label1);
        c.add(label2);
        c.add(label3);
        c.add(label4);


        user = new JTextField();
        user.setBounds(160, 200, 200, 45);
        c.add(user);

        password = new JPasswordField();
        password.setBounds(160, 300, 200, 45);
        c.add(password);

        
        fname = new JTextField();
        fname.setBounds(160, 400, 200, 45);
        c.add(fname);

        lname = new JTextField();
        lname.setBounds(160, 500, 200, 45);
        c.add(lname);

        registerbtn = new JButton("Register");
        registerbtn.setBounds(50, 600, 240, 50);
        c.add(registerbtn);


        registerbtn.addActionListener(this);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("User Email: " + user.getText());
        System.out.println("Password: " + password.getText());
        System.out.println("First Name: " + fname.getText());
        System.out.println("Last Name: " + lname.getText());
    }
}
/* class RegisterForm {
    
    public static void main(String args[]) {
        Myframe frame = new Myframe();
    }
}*/

