package DSA;

import java.util.Scanner;

public class Heap_Method_DSA {
    public static void main(String[] args) {
//        I can't Solve this Method
        Scanner sc =new Scanner(System.in);
//        Creating the array as a heap
//        int[]a=new int[7];
//        a[0]=50;
//        a[1]=40;
//        a[2]=30;
//        a[3]=20;
//        a[4]=10;
//        In the Max-heap Add Method only add after last element
//        Add(a,5,23);
//
//        for (int x:a) {
//            System.out.println(x+",");
//        }
//       In delete method we delete the First element of the Max-heap
//        delete(a,a.length-1);
//
//        for (int x:a) {
//            System.out.println(x+",");
//        }

//        WAP to convert a array to Max-Heap
        int[]a={0,1,2,3,4,5,6,7,8,9,10};

        for (int x:a             ) {
            System.out.print(x+",");

        }
        Max_Heap(a);
        System.out.println(" ");
 for (int x:a             ) {
            System.out.print(x+",");

        }

//        Max_Heap(a);


    }
//    creating my own Max-heap
    public static void Max_Heap(int[]a){
        for(int i=a.length/2;i>0;i--){
            sub_heap(a,i);
        }
        return;
    }
    public static void sub_heap(int[]a,int i){
        if(i*2>a.length){
            return;
        }
        int right=0,left=0;
        if(i*2+1<a.length){
            right=i*2+1;
        }
        if(i*2>a.length) {
            left=i*2;
        }
       if(a[i]<a[left]){
           int temp=a[i];
           a[i]=a[left];
           a[left]=temp;
           sub_heap(a, left);
       }
        if(a[i]<a[right]){
            int temp=a[i];
            a[i]=a[right];
            a[right]=temp;
            sub_heap(a,right);
        }
    }

    public static void Add(int []a,int last,int number){
        last++;
        a[last]=number;
        int i=last;
        while (i>1){
            int parant=i/2;
            if(a[parant]<a[i]){
                int temp=a[parant];
                a[parant]=a[i];
                a[i]=temp;
                i=parant;
            }
            else {
                return;
            }
        }

    }
    public static void delete(int[]a,int length){
        a[1]=a[length];
        length=length-1;
        int i=1;
        int larger;
        while(i<length){
            int left=i*2;
            int right=i*2+1;
            if(a[left]>a[right]){
               larger =left;
            }
            else {
                larger=right;
            }
            if (a[i]<a[larger]){
                int temp=a[i];
                a[i]=a[larger];
                a[larger]=temp;
                i=larger;
            }
            else {
                return;
            }
        }

    }
}
