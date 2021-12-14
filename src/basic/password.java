import javax.swing.*;

public class password {
    public static void main(String[] args) {
        JFrame fra = new JFrame("login");
        JPanel pan = new JPanel();
        fra.add(pan);
        JLabel name =new JLabel("Enter your name ");
        JTextField texname = new JTextField(10);
        JLabel pass = new JLabel("Enter your password");
        JPasswordField texpass = new JPasswordField(10);
        JButton b1 = new JButton("login");
        JButton b2 = new JButton("Cancel");
        pan.add(name);
        pan.add(texname);
        pan.add(pass);
        pan.add(texpass);
        texpass.setEchoChar('#');
        pan.add(b1);
        pan.add(b2);
        fra.setSize(500,500);
        fra.setVisible(true);
    }
}
