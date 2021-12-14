package Geeks_for_Geeks;

public class Array {
    public static void main(String[] args) {
//        WAP to revers a
        int []a = {12,213,34,6,76,34,23,7,3254,878,34,678,45};
        for (int ele:a             ) {
            System.out.print(ele+",");
        }
        System.out.println(" ");
        int last=a.length-1;
        for(int i=0;i<a.length/2;i++){
            int temp=a[i];
             a[i]=a[last];
             a[last]=temp;
             last--;
        }
        for (int ele:a             ) {
            System.out.print(ele+",");

        }
    }
}
