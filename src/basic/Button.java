import javax.swing.*;

public class Button extends JPanel {
    Button(){

    }
    public static void main(String[] args) {

        JFrame fre = new JFrame("Example 1 are Start");
       // JPanel pan = new JPanel();
       // fre.add(pan);
        JTextField tf = new JTextField("on my way ",10);
        fre.add(tf);
        JButton b1 = new JButton("Save");
        b1.setBounds(50,100,95,30);

        JButton b2 = new JButton("Delete");
        b2.setBounds(80,120,80,40);

        tf.setBounds(50,50, 150,20);

        fre.add(b1);
        fre.add(b2);
        fre.setSize(500,500);
        fre.setLayout(null);
        fre.setVisible(true);

    }
}
