package DSA;

import java.util.*;

public class Queue_Q {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        Printing k element in an array
//        do this Q by Youtube
//        System.out.println("What kth element do you wont");
//        int k=sc.nextInt();

//        int[]a={12,43,5,9,34,98,409,34,3,9,9,23,5,45,23,12,34,34,8};
        PriorityQueue<Integer> pq=new PriorityQueue<>();// in this type of Queue we add element in (min-heap)
/*

        for(int i=0;i<k;i++){
            pq.add(a[i]);
        }
        for (int i=k;i<a.length;i++){
            if(pq.peek()<a[i]){
                pq.remove();
                pq.add(a[i]);
            }
        }
        System.out.println(pq.peek());

 */

/*        do this by My method
        for (int i=0;i<a.length;i++){
            pq.add(a[i]);
        }
        for(int i=0;i<a.length-k;i++){
            pq.remove();
        }
        System.out.println(pq.peek());

 */
        int []a={1,2,3,4,5};
        for (int i=0;i<a.length;i++){
            pq.add(a[i]);
        }
        int ans=0;
        while (pq.size()>1){
            int first=pq.remove();
            int second=pq.remove();
            int sum=first+second;
            ans+=sum;
            pq.add(sum);
        }
        System.out.println(pq.peek());

//      Find the Medial element of the Linklist
        LinkedList<Integer>Array1=new LinkedList<>();
        PriorityQueue<Integer>Max_heap=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer>Min_heap=new PriorityQueue<>();





    }
}
