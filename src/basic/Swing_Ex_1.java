import javax.swing.*;
public class Swing_Ex_1 extends JPanel{

    public static void main(String[] args) {

        JFrame jf1 = new JFrame("text area");
        JLabel label =new JLabel("Name");
        JTextField nametex = new JTextField("Enter your name ");
        JLabel address = new JLabel("Address");
        JTextField adtex = new JTextField("Enter your address");
        JButton b1 = new JButton("Process");

        JPanel pan = new JPanel();
        JPanel pan2 = new JPanel();
        b1.setBounds(50,100,95,30);
        pan.add(label);

        pan.add(nametex);
        pan.add(address);
        pan.add(adtex);
        pan.add(b1);
//        jf1.setLayout();
        jf1.setVisible(true);
        jf1.setSize(500,500);
        jf1.add(pan2);
        jf1.add(pan);
    }
}
