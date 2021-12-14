public class Exception_Try_Catch {
    public static void main(String[] args) {
        int a=21;
        int b=0;
        try {
            int c=a/b;
            System.out.println(c);
        }
        catch (Exception v){
            System.out.println("We can not solve this problem (Sorry)");
            System.out.println(v);
        }
        System.out.println("Ending the program");
          }
}
