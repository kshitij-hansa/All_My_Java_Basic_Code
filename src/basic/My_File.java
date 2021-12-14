import java.io.File;

public class My_File {
    public static void main(String[] args) {


        // create a file object for the current location
        File file = new File("newFile.txt");
        String s="on my way";
        System.out.println(file.canRead());
        file.length();


    }
}
