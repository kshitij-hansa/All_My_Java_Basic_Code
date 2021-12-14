package DSA;

public class MyQueue<F> {

    Node<F>Start,rear;

   public void enqueue(F ele){
       Node<F> toadd=new Node<>(ele);
       if(Start==null) {
           Start=rear= toadd;
           return;
       }
       rear.next=toadd;
       rear=rear.next;

   }
   public F dqueue(){
       if(Start==null) {
           return null;
       }

       Node<F>temp=Start;
       Start=Start.next;
       if(Start==null){
           rear=null;
       }
       return temp.data;
   }
   public void print(){
       if(Start==null){
           System.out.println("your Queue is empty");
           return;
       }

       Node<F>com=Start;
       while (com!=null){
           System.out.println(com.data+"");
           com=com.next;
       }



   }






    static class Node<F>{
        Node<F>next;
        F data;
        public Node(F data){
            this.data=data;
            next=null;
        }
    }
}
