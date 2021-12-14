import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Swing extends JFrame {
    public Swing(String title){
        JButton b1=new JButton("Upper");
        JButton b2=new JButton("Save");
        JButton b3=new JButton("Click");
        JButton b4=new JButton("Delete");
        JButton b5=new JButton("Move");
        JButton b6=new JButton("Lower");

        // adding shortcut key to the button
        b1.setMnemonic('u');
        b2.setMnemonic('s');
        b3.setMnemonic('c');
        b4.setMnemonic('d');
        b5.setMnemonic('m');
        b6.setMnemonic('l');

        // adding tip to the button
        b1.setToolTipText("It contain the upper side of the part");
        b2.setToolTipText("It contain the save text to the person");
        b3.setToolTipText("It contain the click chaking text");
        b4.setToolTipText("It contain the delete text to the person");
        b5.setToolTipText("It contain the movement type of the person");
        b6.setToolTipText("It contain the lower side of the part ");

        //creating panel
        JPanel pan1 =new JPanel();

        // adding button to the panel
        pan1.add(b1);
        pan1.add(b2);
        pan1.add(b3);
        pan1.add(b4);
        pan1.add(b5);
        pan1.add(b6);
        setContentPane(pan1);

    }
    public static void main(String[] args) {
        Swing f = new Swing("My first class");
        f.setVisible(true);
        f.setSize(500,500);
    }
}
