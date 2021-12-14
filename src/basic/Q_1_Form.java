import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

class new_w extends JFrame{
     String s;

    public new_w(String s,String s2){
        this.s= s;
        setLayout(null);
        JLabel l1 = new JLabel("Welcome");
        add(l1);
        l1.setBounds(10,10,100,25);
        setVisible(true);
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel lb2 = new JLabel("lb2");
        lb2.setText(s+" "+s2);
        add(lb2);
        lb2.setBounds(100,10,100,25);
    }
}

class Crating_form extends JFrame implements ActionListener{
    JTextField tf1,tf2, tf3, tf4, tf5;
    JLabel ta;
    JComboBox cb1, cb2, cb3;
    ButtonGroup bg;
    Crating_form(){
        setTitle("Crating_form");
        JLabel lab1 = new JLabel("NAME");
        add(lab1);
        lab1.setSize(50,25);
        lab1.setLocation(10,30);

        tf1 = new JTextField(20);
        add(tf1);
        tf1.setBounds(100,30,100,25);

//        JTextArea ta = new JTextArea(10,10);
//        add(ta);
//        ta.setBounds(200,30,250,400);

        JLabel lab2 = new JLabel("Last Name");
        add(lab2);
        lab2.setBounds(10,70,80,20);

         tf2 = new JTextField();
        add(tf2);
        tf2.setBounds(100,70,100,25);

        JLabel lab3 = new JLabel("E Mail");
        add(lab3);
        lab3.setBounds(10,110,80,20);

        tf3 = new JTextField();
        add(tf3);
        tf3.setBounds(100,110,100,25);

        JLabel lab4 = new JLabel("Contact No");
        add(lab4);
        lab4.setBounds(10,150,80,20);

        tf4 = new JTextField();
        add(tf4);
        tf4.setBounds(100,150,100,25);

        JLabel lab5 = new JLabel("Address");
        add(lab5);
        lab5.setBounds(10,190,80,20);

        tf5 = new JTextField();
        add(tf5);
        tf5.setBounds(100,190,100,25);

        JLabel ho = new JLabel("Hobbies");
        add(ho);
        ho.setBounds(300,10,100,25);

        ta = new JLabel();
        ta.setBounds(220,30,220,180);
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        Image img = new ImageIcon("C:\\Users\\kshit\\IdeaProjects\\Coding\\Image\\im.jpg").getImage();
        Image dimg = img.getScaledInstance(ta.getWidth(), ta.getHeight(),
                Image.SCALE_SMOOTH);
        ta.setIcon(new ImageIcon(dimg));
        add(ta);
//        add(new JScrollPane(ta));                     //=========> pub 2 how to add ScrollPane



        JLabel lab6 = new JLabel("Date");
        add(lab6);
        lab6.setBounds(10,230,80,25);

        cb1 = new JComboBox();
        add(cb1);
        for (int i= 1;i<=31;i++) {
            cb1.addItem(i);
        }
        cb1.setBounds(100,230,50,25);

       cb2 = new JComboBox();
        add(cb2);
        for (int i= 1;i<=12;i++) {
            cb2.addItem(i);
        }
        cb2.setBounds(160,230,50,25);

       cb3 = new JComboBox();
        add(cb3);
        for (int i= 1900;i<=2022;i++) {
            cb3.addItem(i);
        }
        cb3.setBounds(220,230,60,25);

        JLabel lab7 = new JLabel("Gender");
        add(lab7);
        lab7.setBounds(10,265,50,25);
         bg = new ButtonGroup();

        JRadioButton rb1 = new JRadioButton("Male");
        rb1.setActionCommand("M");
        add(rb1);
        bg.add(rb1);
        rb1.setBounds(70,265,70,25);

        JRadioButton rb2 = new JRadioButton("Female");
        rb2.setActionCommand("F");
        add(rb2);
        bg.add(rb2);
        rb2.setBounds(170,265,70,25);

        rb1.setSelected(true);

        JLabel lab8 = new JLabel("Language");
                add(lab8);
        lab8.setBounds(10,300,60,25);

        JCheckBox ch1 = new JCheckBox("C");
        add(ch1);
        ch1.setBounds(80,300,40,25);
        JCheckBox ch2 = new JCheckBox("J2EE");
        add(ch2);
        ch2.setBounds(150,300,80,25);
        JCheckBox ch3 = new JCheckBox("C++");
        add(ch3);
        ch3.setBounds(80,340,50,25);
        JCheckBox ch4 = new JCheckBox("Java");
        add(ch4);
        ch4.setBounds(150,340,60,25);

        JButton bu = new JButton("Submit");
        add(bu);
        bu.setBounds(100,380,80,30);
        bu.addActionListener(this);

        setLayout(null);

    }
    public void actionPerformed(ActionEvent ae){
        String name = tf1.getText();
        String last_name = tf2.getText();
        String email = tf3.getText();
        String contact = tf4.getText();
        String address = tf5.getText();
        String date = cb1.getSelectedItem().toString()+"-"+cb2.getSelectedItem().toString()+"-"+cb3.getSelectedItem().toString();
        String gender = bg.getSelection().getActionCommand();
//        String last_name = tf2.getText();
        String img = ta.getUIClassID();


        String data = "";
        data = data.concat(" "+name).concat(" "+last_name).concat(" "+email).concat(" "+contact).concat(" "+address).concat(" "+date).concat(" "+gender).concat(""+img);
        System.out.println(data);
//        new_w nw = new new_w(name, last_name);
        try
        {
            String filename= "Customer_data.txt";
            FileWriter fw = new FileWriter(filename,true); //the true will append the new data
            fw.write(data+"\n");//appends the string to the file
            fw.close();
            JOptionPane.showMessageDialog(this,"Customer Info is saved into "+ filename + "file");


            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showOpenDialog(null);
            File f = fileChooser.getSelectedFile();
            ta.setIcon(new ImageIcon(f.toString()));
            filename=f.getAbsolutePath();
            ta.setText(filename);

            String newpath = "upload/Image";
            File Directory = new File(newpath);
            if (!Directory.exists()){
                Directory.mkdirs();
            }


            File sourceFile =null;
            File destinationFile = null;
            String extension = filename.substring(filename.lastIndexOf('.')+1);
            sourceFile =new File(filename);
            destinationFile = new File(newpath+"newImage."+extension);
            Files.copy(sourceFile.toPath(),destinationFile.toPath());
        }
        catch(IOException ioe)
        {
            JOptionPane.showMessageDialog(this,"IOError Occured "+ ioe);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Other Error Occured "+ e);
        }



    }
}

public class Q_1_Form {
    public static void main(String[] args) {
        Crating_form cf = new Crating_form();
        cf.setSize(500,500);
        cf.setVisible(true);
        cf.setDefaultCloseOperation(cf.EXIT_ON_CLOSE);

        // new window was created

    }
}
