    package DSA;

    public class New_Linklist<E> {
        Node2<E> Start;
        int size;
        void addend(E ele){
            Node2<E> toadd=new Node2<>(ele);

            if(Start==null){
                Start=toadd;
                size++;
                return;
            }

                Node2<E> copy=Start;
                while (copy.next!=null){
                    copy=copy.next;
                }
                copy.next=toadd;
            size++;

        }
        void deletf(){
            if (Start==null){
                System.out.println("your linklist is empty");
            }
            else {
                Start=Start.next;
                size--;
            }
        }

        void addatposition(int a,E ele){
            Node2<E> toadd =new Node2<>(ele);
            Node2<E>copy=Start;
            for (int i = 0; i <a-1 ; i++) {
                copy=copy.next;
            }
            toadd.next=copy.next;
            copy.next=toadd;
            size++;
        }
           void addinfirst(E ele){
            Node2<E> toaddinfirst=new Node2<>(ele);
            Node2<E> copy=Start;
            Start=toaddinfirst;
            toaddinfirst.next=copy;
            size++;
           }
           void deletepoint(int pos){
               if (Start==null)
                   System.out.println("your linklist is empty");
               else if(pos<1&&pos>size)
                   System.out.println("your postgen is invalade");
               else if(pos==1)
                   deletf();
               else if(pos==size)
                   deletend();
               else if(pos>1&&pos<size){
                   Node2<E>temp,temp1;
                   temp=Start;
                   for (int i = 0; i <pos-1 ; i++) {
                       temp=temp.next;
                   }
                   temp1=temp.next;
                   temp=temp1.next;
                   size--;
               }

           }
        void deletend(){
            if (Start==null){
                System.out.println("your linklist is empty");
            }
            else {
                Node2 copy=Start;
                for (int i = 0; i <size-2; i++) {
                    copy=copy.next;
                }
                copy.next=null;
                size--;

            }

        }
          void print(){
                Node2<E>copy=Start;
                while (copy!=null){
                    System.out.print(copy.data+" ");
                    copy=copy.next;
                    System.out.println(size);
                }
          }
          public void Revers(){
            Node2<E> temp=Start;
              for (int i = 0; i <size; i++) {
                  temp=temp.next;
                  Node2<E>temp2=Start;
                  Start=temp;
                  Start=temp2;
//                  if(temp==null){
//                      break;
//                  }
              }
          }


        static class Node2<E>{                 // Creating Node2 class
            E data;
            Node2<E> next;
            public Node2(E data){                 // Creating Node2 constructor
                   this.data=data;
                   next=null;
            }
        }

    }
