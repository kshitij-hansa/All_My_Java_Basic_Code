package DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Arrays_in_DSA {

    public static void main(String[] args) {
        int []a=new int[10];
        for (int i = 0; i <a.length; i++) {
            a[i]=i+1;
        }
        Scanner sc = new Scanner(System.in);
        // Majority Elements in Arrays------------------------------------------------------

        // (1) The Algorithm for solving this Q is
        //  (Boyer-Moore Majority vote Algorithm)

       /*
        System.out.println("Enter the size of the Array");

        int num=sc.nextInt();
        int [] a=new int[num];
        for (int i = 0; i <num; i++) {
            System.out.println("Enter the value for Array in :"+i+"Place");
            a[i]=sc.nextInt();
        }
        System.out.println("Your Array is ");
        for (int z:a) {
            System.out.print(" "+z);
        }
        System.out.println(" ");
        // finding the Major number who is greater than haf of array length in the array
           // Step 1 Shorted the array
        Arrays.sort(a);
        int count=1,temp=a[0];
        int q=0;

        for(int i=0;i<a.length;i++){

            if (temp==a[i]){
                count++;
                }

            else {
                temp=a[i];
                count=1;
            }
            if(count>a.length/2) {
                System.out.println("Your number is ");
                System.out.println(temp);
                q++;
                break;
            }

        }
        if (q==0){
            System.out.println("your number is not greater than haf of array");
        }
        */

//         Maximum Sum in Sub-array
        // (2) The Algorithm for solving this Q is
        //(Kaden's Algorithm)
/*
        int[] array = {-1, 2, -3, 4, 28, -28, 4, 32};
        Find_Sub_Array(array);
    }

    static void Find_Sub_Array(int a[]) {
        int max_sum = 0;
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            if (sum > max_sum) {
                max_sum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

//        else {
//            max_sum=lastNum;
//        }

        System.out.println("The max-sum of the sub-array is : " + max_sum);
    }
}

 */


//         Stocks Buying and Selling in arrays----------------
        /*
        int[]a={3,9,19,1,5};
        int max_profit=0;
        int min_profit=a[0];
        for (int i = 0; i <a.length; i++) {
            min_profit=Math.min(max_profit,a[i]);
            int profit=a[i]-min_profit;
            max_profit=Math.max(profit,max_profit);
        }
        System.out.println(max_profit);

         */
//        Rain-water trapping problem
/*
        int[]a={1,4,0,9,8,2,4,8,6,7};
        System.out.println(trapping(a));

    }
    static int trapping(int a[]){
        int length=a.length;
        int []left=new int[length];
        int []right=new int[length];
        left[0]=a[0];
        for (int i=1;i<length;i++){
            left[i]=Math.max(left[i-1],a[i]);
        }
        right[length-1]=a[length-1];
        for (int i=length-2;i>0;i--){
            right[i]=Math.max(right[i+1],a[i]);
        }
        int ans=0;
        for (int i = 0; i <length; i++) {
            ans+=Math.min(left[i],right[i])-a[i];
        }
        return ans;
        }
 */
//         Bubble Sorting of arrays
/*
        int []a={1,3,6,9,4,2,94,49,0,6,6,3,5};
        int temp=0;
        int num=0;
        for(int i=0;i<a.length-1;i++){

            for (int j = 0; j <a.length-i-1; j++) {
                if(a[j]>a[j+1]){
                    a[j]=a[j]^a[j+1];
                    a[j+1]=a[j]^a[j+1];
                    a[j]=a[j]^a[j+1];

                }
                temp++;
            }
            num++;
        }
        for (int x:a) {
            System.out.print(x+",");
        }

    }
 */
        // Insertion Sort of array
/*
        int[]a={9,8,5,1,3,7,8};

        for(int i=1;i<a.length;i++){
            int temp=a[i];
            int j=i-1;
            while (j>=0 && a[j]>temp){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
        for (int x:a) {
            System.out.print(x+", ");
            }
 */
        // Selection Sort of the array
/*
        int[] a = {9, 8, 5, 1, 3, 7, 8};
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j]) {
                    min=j;
                }
            }
            if(min!=a[i]){
              int temp=a[i];
              a[i]=a[min];
              a[min]=temp;


            }
        }
        for (int x:a) {
            System.out.println(x);

        }
 */
        // Binary Search
/*
        int[] a = {1,2,3,4,5,6,7,8};

//        In the Binary Search you have to sort the array
//        when you have not sorted array you can not do the binary search
        int low =0,high=a.length-1;

        System.out.println("find the number in the array");
        int num=sc.nextInt();
        while (high>=low){
            int mid=low+high/2;
            if(a[mid]==num){
                System.out.println("Your number in the place of :"+mid);
                break;
            }
            if(num<a[mid]){
                high=mid+1;
            }
            if(num>a[mid]){
                low=mid+1;
            }

        }
 */
//        Finding the element in an Infinite Sorted array
/*
        System.out.println("set the size of the array");
        int size=sc.nextInt();
        int[] a=new int[size];
        for (int i = 0; i <a.length-1; i++) {
            a[i]=i*2;
        }
        int low = 0, high = 1;
        System.out.println("find the element");
        int num=sc.nextInt();
        System.out.println(num);
        while(a[high]<num){
            low=high;
            high=high*2;
        }

        while (high>=low){
            int mid=(high+low)/2;
            if(a[mid]==num){
                System.out.println("Your number in the plece of :"+mid);
                break;
            }
            if(a[mid]<num){
                low=mid+1;
            }
            if(a[mid]>num){
                high=mid-1;
            }
        }

 */
//         Finding the element in the Sorted & Rotated array
/*
        int []a={4,5,6,7,8,9,1,2,3};
        int low =0,high=a.length-1;
        System.out.println("find the number in the array");
        int num=sc.nextInt();
        while (high>=low){
            int mid=(high+low)/2;
            if(a[mid]==num){
                System.out.println("the number in the place :"+mid);
                break;
            }
            if(a[mid]>a[low]){
                if(num>=a[low]&&num<a[mid])
                {
                    high=mid-1;
                }
                else {
                    low=mid-1;
                }

            }
            else {
                if(num>a[mid]&&num<=a[high]){
                    low=mid+1;
                }
                else {
                    high=mid-1;
                }
            }
        }

 */
//      Find the Sub-Array with the given sum
/*
        int []a={10,15,-5,15,-10,5};
        int sum=5;
        HashMap<Integer,Integer>HM=new HashMap<>();
        int curren=0,start=0,end=-1;
        for (int i = 0; i <a.length-1; i++) {
            curren+=a[i];
            if(curren-sum==0){
                start=0;
                end=i;
                break;
            }
            if(HM.containsKey(curren-start)){
                start=HM.get(curren-start)+1;
                end=i;
                break;
            }
            HM.put(curren,i);
        }
        if(end==-1){
            System.out.println("Not found");
        }
        else {
            System.out.println(start+" "+end);
        }
 */
//        Rotation of array
//        Method 1st


        /*
        System.out.println("how many number do you wont to rotate");
        int num=sc.nextInt();
        for (int i = 0; i <num; i++) {
            int temp=a[0];
//            System.out.print(temp);
            for(int j=0;j<a.length-1;j++){
                a[j]=a[j+1];
            }
            a[a.length-1]=temp;
        }
        for (int x:a             ) {
            System.out.println(x+" ");

        }
        */
//        Search an element in a sorted and rotated array
//        Method 2nd
/*
        System.out.println("Enter your number");
        int num=sc.nextInt();
        int n=0;
        for (int i=0;i<a.length;i++){
            if(num==a[i]){
                System.out.println("The number in the place of = "+i);
                n++;
                break;
            }
        }
        if(n==0){
            System.out.println("your number is not in the array");
        }
 */


    }
}
