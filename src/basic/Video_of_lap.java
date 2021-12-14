import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class Video_of_lap extends JFrame {
    JLabel lab;
   public Video_of_lap(){
        lab = new JLabel("On My Way");
       lab.setFont(new Font("MV Boli",Font.PLAIN,100));
       add(lab);
       lab.setBackground(Color.black);
       lab.setOpaque(true);

       lab.setVerticalAlignment(JLabel.TOP);
       lab.setHorizontalAlignment(JLabel.CENTER);
//       time 24 of the video
       Border bro = BorderFactory.createLineBorder(Color.green, 3);
       lab.setBorder(bro);
       JLabel lab1 = new JLabel("on your Way");
       add(lab1);
       lab.add(lab1);


    }
    public static void main(String[] args) {

            Video_of_lap fra = new Video_of_lap();
            fra.setSize(1000,1000);
            fra.setVisible(true);
            fra.setDefaultCloseOperation(fra.EXIT_ON_CLOSE);
            fra.add(fra.lab);
//       fra.pack();


    }
}
