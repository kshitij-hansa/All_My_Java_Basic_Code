class Mythread implements Runnable{
    public void run(){
        System.out.println("the thread is ");
    }
}
public class Thread {
    public static void main(String[] args) {
        Mythread t1= new Mythread();
        t1.run();
    }
}
