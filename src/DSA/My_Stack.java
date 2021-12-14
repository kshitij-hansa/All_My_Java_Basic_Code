package DSA;

public class My_Stack<E> {
    int size;
    My_Node<E> Start;

    void push(E ele){
        My_Node<E>toadd=new My_Node<>(ele);
        if (Start==null){
            Start=toadd;
            size++;
        }
        else {
            My_Node<E>copy=Start;
            Start=toadd;
            toadd.next=copy;
            size++;
        }
    }
    void empty(){
        if(Start==null) System.out.println("Your Stack is empty");
        else System.out.println("Your Stack is not-empty");
    }
    void see(){
        My_Node<E>com=Start;
        System.out.println(com.data);
    }
    void pop(){
        if (Start==null){
            System.out.println("your Stack is empty");
            size--;
        }
        else {
            Start=Start.next;
            size--;
        }
    }
    void print(){
         My_Node<E>copy=Start;
         while (copy!=null){
             System.out.println(copy.data+" ");
             copy=copy.next;
         }
    }

  static class My_Node<E> {
      E data;
      My_Node<E> next;
      public My_Node(E data){
          this.data=data;
          next=null;
      }
  }
}
