import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.script.*;

class calculate extends JFrame implements ActionListener{
//    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10, b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;

    JButton b[] = new JButton[20];
    JTextField tf;
   public calculate(){
       setLayout(null);
       Font fo = new Font(" ",Font.BOLD,30);
       tf =new JTextField(20);
       add(tf);
       tf.setBounds(0,0,400,100);
       tf.setFont(fo);
       tf.setHorizontalAlignment(JTextField.RIGHT);

       int k=0;
       int x=0;
       int y=100;
       int w=100;
       int h=100;
       for (int i=1;i<=5;i++){
           for (int j=1;j<=4;j++){
               b[k] = new JButton();
               b[k].setBounds(x,y,w,h);
               add(b[k]);
               b[k].addActionListener(this);
               b[k].setFont(fo);
               k++;
               x=x+100;
           }
           x=0;
           y=y+100;
       }
       b[0].setLabel("B");
       b[1].setLabel("C");
       b[2].setLabel("1/x");
       b[3].setLabel("sqrt");
       b[4].setLabel("7");
       b[5].setLabel("8");
       b[6].setLabel("9");
       b[7].setLabel("/");
       b[8].setLabel("4");
       b[9].setLabel("5");
       b[10].setLabel("6");
       b[11].setLabel("*");
       b[12].setLabel("1");
       b[13].setLabel("2");
       b[14].setLabel("3");
       b[15].setLabel("-");
       b[16].setLabel("0");
       b[17].setLabel(".");
       b[18].setLabel("=");
       b[19].setLabel("+");

//       b1 = new JButton("B");
//       add(b1);
//       b1.setBounds(0,100,100,100);
//       b2 = new JButton("C");
//       add(b2);
//       b2.setBounds(100,100,100,100);
//       b3 = new JButton("1/x");
//       add(b3);
//       b3.setBounds(200,100,100,100);
//       b4 = new JButton("sqrt");
//       add(b4);
//       b4.setBounds(300,100,100,100);
//       b5 = new JButton("7");
//       add(b5);
//       b5.setBounds(0,200,100,100);
//       b6 = new JButton("8");
//       add(b6);
//       b6.setBounds(100,200,100,100);
//       b7 = new JButton("9");
//       add(b7);
//       b7.setBounds(200,200,100,100);
//       b8 = new JButton("/");
//       add(b8);
//       b8.setBounds(300,200,100,100);
//       b9 = new JButton("4");
//       add(b9);
//       b9.setBounds(0,300,100,100);
//       b10 = new JButton("5");
//       add(b10);
//       b10.setBounds(100,300,100,100);
//       b11 = new JButton("6");
//       add(b11);
//       b11.setBounds(200,300,100,100);
//       b12 = new JButton("*");
//       add(b12);
//       b12.setBounds(300,300,100,100);
//       b13 = new JButton("1");
//       add(b13);
//       b13.setBounds(0,400,100,100);
//       b14 = new JButton("2");
//       add(b14);
//       b14.setBounds(100,400,100,100);
//       b15 = new JButton("3");
//       add(b15);
//       b15.setBounds(200,400,100,100);
//       b16 = new JButton("-");
//       add(b16);
//       b16.setBounds(300,400,100,100);
//       b17 = new JButton("0");
//       add(b17);
//       b17.setBounds(0,500,100,100);
//       b18 = new JButton(".");
//       add(b18);
//       b18.setBounds(100,500,100,100);
//       b19 = new JButton("=");
//       add(b19);
//       b19.setBounds(200,500,100,100);
//       b20 = new JButton("+");
//       add(b20);
//       b20.setBounds(300,500,100,100);

    }
    public void actionPerformed(ActionEvent a){
       if(a.getSource()==b[0]){
           String s1 = tf.getText();
           tf.setText(s1.substring(0,s1.length()-1));
       }
       else if(a.getSource()==b[1]){
           tf.setText("");

       }
       else if (a.getSource()==b[2]){
           String s3 = tf.getText();
           double d1 = Double.parseDouble(s3);
           d1=1/d1;
           tf.setText(String.valueOf(d1));

       }
       else if(a.getSource()==b[3]){
          String s2= tf.getText();
          double d = Double.parseDouble(s2);
          tf.setText(String.valueOf(Math.sqrt(d)));

        }
//       else if(a.getSource()==b[18]){                    // ======> pro 1
//          String s4= tf.getText();
//           System.out.println("s4 : "+ s4);
//          ScriptEngineManager sem = new ScriptEngineManager();
//          ScriptEngine se = sem.getEngineByName("nashorn");
//           try {
//               tf.setText(""+se.eval(s4));
//           } catch (Exception e) {
//               System.out.println(e);
//           }

//       }
       else{
            JButton B = (JButton) a.getSource();
            String s = tf.getText() + B.getLabel();
            tf.setText(s);
        }

    }




}
    public class calculator {
    public static void main(String[] args) {
        calculate cal = new calculate();
        cal.setSize(420,635);
        cal.setVisible(true);
        cal.setDefaultCloseOperation(cal.EXIT_ON_CLOSE);
        cal.setResizable(false);

    }
}
