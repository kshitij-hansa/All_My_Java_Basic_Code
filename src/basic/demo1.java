import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Demo extends JFrame implements ActionListener{
    JTextField tf;
   public Demo(){
       // Setting the title of the Frame
       setTitle("Example");
       // Making the font Size of the words
       Font fon = new Font("",Font.BOLD,10);

       // Making the Button in the Frame
       JButton b1 = new JButton("open in Swing ");
       add(b1);               // ==> adding the button in the Frame

       b1.setSize(120,30);   //==> adding the size of the button
       b1.setLocation(30,10);// ==> adding the location of the button in the Frame
       b1.addActionListener(this);   //===> adding the button on the ActionListeners


       setLayout(new FlowLayout());     //==>  Setting the Layout Management in the Frame

       JCheckBox cb1 = new JCheckBox("Java");   //===
       add(cb1);                                        //===
                                                           //===> Adding the click Box in the Frame
       JCheckBox cb2 = new JCheckBox("AWT");       //===
       add(cb2);                                    //===

       ButtonGroup bg = new ButtonGroup();                // == Making the group of the button to make the only one Button click

       JRadioButton r1 = new JRadioButton("Male");  // ==> Making the radio Button
       add(r1);
       bg.add(r1);                                        // ===> Adding the Radio Button in the Button Group
       JRadioButton r2 = new JRadioButton("Female");
       add(r2);
       bg.add(r2);



       JLabel name = new JLabel(" name ");   // ==> Adding the Label( Single line ) in the Frame
       add(name);

        tf =new JTextField(20);  // ==>Adding the Text Field in the Frame
       add(tf);
       tf.setBounds(160,10,200,30);  //===> Adding the Size & location in the Frame

       JLabel lab = new JLabel("enter your password");
       add(lab);
       lab.setFont(fon);

       JPasswordField tp =new JPasswordField("password",20);
       add(tp);
       tp.setEchoChar('#');  // ==> Making the password field new hide shape

       JComboBox cb = new JComboBox();
       cb.addItem("java");
       cb.addItem("Swing");                        // ===> Adding Items in the combo Box
       cb.addItem("awt");
       cb.addItem("combo");
       add(cb);

       // Making another Combo Box2 and Adding array into this
       String s[] = {"Math","SST","Science","Hindi","English"};  // ==> Making Array
       JComboBox Cb2 = new JComboBox(s);                        //  ==> Adding array into combo box2
       add(Cb2);

       JList lis = new JList(s);
       add(new JScrollPane(lis));
       lis.setVisibleRowCount(3);

       // Action Listener is making

       // Step 1 is implements the (ActionListener),and ( Import the java.awt.event.*)
       // Step 2 create the method for ActionPerformed
       // Step 3 Add the button on Action listener




    }
    public void actionPerformed(ActionEvent e){
      //  System.out.println("click on the button");  // ===> if u click on the b1(Button) this massage will see on the compiler
        tf.setText("Enter your name");

    }
}

public class demo1 {
    public static void main(String[] args) {
        Demo D1 = new Demo();
        D1.setSize(500,500);
        D1.setVisible(true);
        D1.setResizable(false);
        D1.setLocation(20,40);
        D1.setDefaultCloseOperation(D1.EXIT_ON_CLOSE);
    }
}
