import javax.swing.*;
import java.awt.*;

class demO extends JFrame{
  public demO(){
        setLayout(new FlowLayout());
        JTextField tf = new JTextField(20);
        add(tf);
        tf.setBounds(100,100,100,25);
        JCheckBox cb1 = new JCheckBox("Java");
        add(cb1);
        cb1.setBounds(50,200,50,25);
        JCheckBox cb2 = new JCheckBox("C++");
        add(cb2);
        cb2.setBounds(150,200,50,25);
        JButton b = new JButton("Click");
        add(b);
        b.setBounds(100,300,50,25);




    }
}

public class Demo4 {
    public static void main(String[] args) {
        demO d4 = new demO();
        d4.setVisible(true);
       d4.setSize(400,400);
        d4.setDefaultCloseOperation(d4.EXIT_ON_CLOSE);
        d4.setBackground(Color.green);
    }
}
