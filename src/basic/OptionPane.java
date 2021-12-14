import javax.swing.*;

public class OptionPane extends JFrame {
    public OptionPane() {
        setLayout(null);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {

/*       It is the dialog box 2rd method of the Dialog class(showInputDialog)
        String name=JOptionPane.showInputDialog("Enter Name");
        if(name.equals("kshitij")){
            OptionPane d = new OptionPane();

        }
        else {

        }
 */


//        It is the dialog box 3rd method of the Dialog class(Message)


        JOptionPane.showMessageDialog(null,"Welcome to Javatpoint","title",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"Welcome to Javatpoint.","title",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null," Welcome to Javatpoint","title",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Welcome to Javatpoint","title",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"Welcome to Javatpoint","title",JOptionPane.ERROR_MESSAGE);


       /*
        It is the dialog box 4th method of the Dialog class  (Confirm)
       Dialog d = new Dialog();
       int a = JOptionPane.showConfirmDialog(d,"Confirm to close");
       if(a==JOptionPane.YES_OPTION){
          d.setDefaultCloseOperation(d.EXIT_ON_CLOSE);
       }
       else {

       }



        */

    }
}
