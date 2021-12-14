import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class sum extends JFrame implements ActionListener{
    JButton sum;
    JTextField tf1,tf2,tf3;
    public sum(){
        setLayout(null);
        sum =new JButton("Sum + ");
        add(sum);
        sum.addActionListener(this);
        sum.setBounds(250,400,100,30);

        tf1 = new JTextField(20);
        add(tf1);
        tf1.setBounds(20,50,100,30);
        tf2 = new JTextField(20);
        add(tf2);
        tf2.setBounds(200,50,100,30);
        tf3 = new JTextField(20);
        add(tf3);
        tf3.setBounds(20,100,100,30);
    }
    public void actionPerformed(ActionEvent a){
        String s1 = tf1.getText();// ===>adding value of tf1 into String
        String s2 = tf2.getText();// ===> adding value of tf2 into String

        int x = Integer.parseInt(s1);// ===> String into Integer x
        int y = Integer.parseInt(s2);// ===> String into Integer y

        int z = x+y;   // adding value of x and y

        tf3.setText(""+z);

    }
}
public class demo3 {
    public static void main(String[] args) {
        sum add = new sum();
        add.setSize(500,500);
        add.setVisible(true);
        add.setDefaultCloseOperation(add.EXIT_ON_CLOSE);
    }
}
