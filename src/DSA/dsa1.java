package DSA;
import java.util.*;

public class dsa1 {
        public static void main(String[] args) {
         // Shorting the array
            /*
            int[] a = {1,-2,45,3,0,-5,-1,78,5};
            Arrays.sort(a);
            for (int ele:a) {
                System.out.print(ele);

            }
             */
            Scanner sc = new Scanner(System.in);
//           String b = sc.hasNext();
//            System.out.println(b);

            // Making Arraylist
            int i=0;
            ArrayList<Object> arr = new ArrayList<>();//  Making arraylist obj
            ArrayList<Object> arr2 = new ArrayList<>();//

            arr.add(12);                                //  Adding the component in the arraylist
            arr.add(33);
            arr.add(23);
            arr.add(123);
            arr.add(3+12);
            arr.add(13);
            arr.add(82);
            arr.add(46);
            arr.add(67);

            arr2.add(1);                                  //   Adding the component in the 2nd arraylist
            arr2.add(2);
            arr2.add(4);
            arr2.add(6);
            System.out.println(arr);                     // Printing the Array list of arr


            arr2.addAll(arr);                   //   Adding the two Arraylist arr + arr2

                System.out.println(arr2);               // printing the array list of arr2
            int n =12;
            int x=23;
            String g=String.valueOf(x);
            String s= String.valueOf(n);
            System.out.println(s+g);



        }
    }

