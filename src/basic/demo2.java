import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Dem extends JFrame implements ActionListener{
    JButton b1,b2;
   public Dem(){
       setLayout(null);
       b1 = new JButton("open");
       add(b1);
       b1.setBounds(50,50,80,30);

       b2 = new JButton("close");
       add(b2);
       b2.setBounds(200,50,80,30);

       b1.addActionListener(this);
       b2.addActionListener(this);


    }
    public void actionPerformed(ActionEvent e){
       if(e.getSource()==b1){
           b1.setLabel("0");
       }
       if(e.getSource()==b2){
           b2.setLabel("X");
       }
    }
}

public class demo2 {
    public static void main(String[] args) {
        Dem D2 = new Dem();
        D2.setVisible(true);
        D2.setSize(500,500);
        D2.setDefaultCloseOperation(D2.EXIT_ON_CLOSE);
    }
}
