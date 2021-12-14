package DSA;

public class linklist2 <E>{
    private int size=1;
    private Node start;

    public linklist2(){
    }
    public void addatfirst(E ele){
        Node n=new Node();
        n.setData(ele);
        n.setNext(start);
        size++;
    }

    public void addatlast(E ele){
        Node n,t;
        n=new Node();
        n.setData(ele);
       t=start;
        if(t==null){
            start=n;
        }
        else {
            while (t.getNext()!=null){
                t=t.getNext();
           }
            t.setNext(n);
           size++;
        }
    }
    public void addatpost(int pos,E ele){
        if (pos==1){
            addatfirst(ele);
        }
        else if(pos==size+1){
            addatlast(ele);
        }
        else if(pos>1&&pos<size){
            Node n,t;
            n=new Node(ele,null);
            t=start;
            for(int i=1;i<pos-1;i++){
                t=t.getNext();
            }
            n.setNext(t.getNext());
            t.setNext(n);
            size++;
        }
        else{
            System.out.println("The position of your element is not available");
        }

    }

    public boolean isEmpty(){
        if(start==null){
            return (true);
        }
        else {
            return (false);
        }
    }
    public int getlistsize(){
        return (size);
    }
    public void print(){
        Node t;
        if (isEmpty()){
            System.out.println("the list is Empty");
        }
        else{
            t=start;
            for (int i=1;i<=size;i++){
                System.out.print(" "+t.getData());
                t=t.getNext();
            }
        }
    }

  static   class Node<E>{
        private E data;
        private Node next;
        public Node(){
        }
        public Node(E d,Node n){
            data=d;
            next=n;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

    }

}

