import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileWriter;

public class Demo5 extends JFrame implements ActionListener , KeyListener {
    JCheckBox b1,b2;
    JTextField tf;
    JRadioButton r1,r2;
    JComboBox cb;
    public Demo5(){
         tf = new JTextField("Enter your Name",20);
        tf.setBounds(100,30,100,25);
        add(tf);
        setLayout(null);
        ButtonGroup bg = new ButtonGroup();
        ButtonGroup bg2 = new ButtonGroup();
        b1= new JCheckBox("java");
        add(b1);
        bg.add(b1);
        b1.setBounds(50,150,50,25);
         b2 = new JCheckBox("C++");
        add(b2);
        bg.add(b2);

        b2.setBounds(150,150,50,25);
         r1 = new JRadioButton("Male");
        add(r1);
        bg2.add(r1);
        r1.setBounds(70,250,100,25);
         r2 = new JRadioButton("Female");
        add(r2);
        bg2.add(r2);
        r2.setBounds(200,250,100,25);

        JButton ch = new JButton("click");
        add(ch);
        ch.setBounds(100,300,50,25);
        ch.addActionListener(this);

        String a[]= {"anuj","kshitij","hansa","sagar","kumar"};
        cb = new JComboBox(a);
        add(cb);
        cb.setBounds(300,30,60,30);

        tf.setForeground(Color.green);
        tf.addKeyListener(this);

    }


    public void actionPerformed(ActionEvent ae){

        String Cb1 = b1.getText();
        String Cb2 = b2.getText();
        String R1 = r1.getText();
        String R2 = r1.getText();
        String Tf = tf.getText();

        //putting the value of ComboBox in the textField
//        String s = (String)cb.getSelectedItem();
//        tf.setText(s);
        String s1 = "";
        s1 = s1.concat(" "+R1).concat(" "+R2).concat(" "+Cb1).concat(" "+Cb2).concat(" "+Tf);
        System.out.println(s1);

        try {
            String filename = "javat.txt";
            FileWriter fw = new FileWriter(filename,true);
            fw.write(s1+"\n");
            fw.close();
            JOptionPane.showMessageDialog(this,"your information is save");
        }
        catch (Exception e) {
            e.printStackTrace();
        }


        // Putting the value of checkbox into textField
//        String s= "";
//        if(b1.isSelected()){
//            s=b1.getLabel();
//            tf.setText(s);
//        }
//        else {
//            s=b2.getLabel();
//            tf.setText(s);
//        }
    }
    public static void main(String[] args) {
        Demo5 jt = new Demo5();
        jt.setSize(400,400);
        jt.setVisible(true);
        jt.setDefaultCloseOperation(jt.EXIT_ON_CLOSE);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
      String s= tf.getText();
      if(s.equals("Enter your name")){
          tf.setText(" ");
      }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
