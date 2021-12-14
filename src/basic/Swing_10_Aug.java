import javax.swing.*;

public class Swing_10_Aug extends JPanel {
   public Swing_10_Aug(){

       JLabel name =new JLabel("Enter your name ");
       JTextField texname = new JTextField(10);
       JLabel pass = new JLabel("Enter your password");
       JPasswordField texpass = new JPasswordField(10);
       JButton b1 = new JButton("login");
       JButton b2 = new JButton("Cancel");
       add(b1);
       add(b2);
       add(name);
       add(texname);
       add(pass);
       add(texpass);
       texpass.setEchoChar('#');

   }

    public static void main(String[] args) {
       Swing_10_Aug sw =new Swing_10_Aug();
        JFrame fra =new JFrame("password of demo");
        fra.setContentPane(sw);
        fra.setSize(500,500);
        fra.setVisible(true);

    }
}
