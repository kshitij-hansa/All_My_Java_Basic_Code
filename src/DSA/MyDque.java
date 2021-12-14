package DSA;

class Node<E>{
    E data;
    Node<E> Next,Previous;
    public Node(E data){
        this.data=data;
        this.Next=this.Previous=null;
    }
}

public class MyDque<E> {
    Node<E> Head,Tail;

    public void addf(E ele){
        Node<E>toadd=new Node<>(ele);
        if (Head==null){
            Head=Tail=toadd;
            return;
        }
        Head.Previous=toadd;
        toadd.Next=Head;
        Head=toadd;
    }
    public void addL(E ele){
        Node<E>toadd = new Node<>(ele);
        if (Tail==null){
            Head=Tail=toadd;
        }
         Tail.Next=toadd;
        toadd.Previous=Tail;
        Tail=toadd;
    }
    public void SeeHead(){
        System.out.println(Head.data);

    }
    public void RemoveH(){
        Head=Head.Next;
        Head.Previous=null;
    }
    public E RemoveH2(){
        if(Head==null){
            return null;
        }
        Node<E>to=Head;
        Head=Head.Next;
        Head.Previous=null;
        return to.data;
    }
    public void SeeTail(){
        System.out.println(Tail.data);
    }

}
