package Examples;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int a= A.length()+B.length();
        System.out.println(a);


        int result = A.compareTo( B );

        if(result>0)
            System.out.println("Yes");
        else if(result<0)
            System.out.println("No");
        else
            System.out.println("Equal");



        String i=upperCaseFirst(A);
        String o=upperCaseFirst(B);
        System.out.println(i+" "+o);


    }
    public static String upperCaseFirst(String val) {
        char[] arr = val.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        return new String(arr);
    }
}
