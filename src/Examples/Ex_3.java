package Examples;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    /* sum of natural Number-----------------------------------

    System.out.println("Enter your Number to find the sum of the natural ");
    int n = sc.nextInt();
    long A= (long) n *(n+1)/2;
    System.out.println("The sum of the Your number is :"+A);
    */

        /* printing the multiple table----------------------------

        System.out.println("Enter your Number to print the multiple table");
        int num=sc.nextInt();
        for (int i = 0; i <=10 ; i++) {
            System.out.printf (" %d X %d = %d", num,i, num*i);
            System.out.println("");
            }
         */

        // GCD of the two number
/*
        System.out.println("Enter your 1st Number ");
        int a= sc.nextInt();
        System.out.println("Enter your 2nd Number ");
        int b = sc.nextInt();
        int gcd=1;
        for (int i = 1; i <= a && i <= b; ++i) {

            if (a % i == 0 && b % i == 0)
                gcd = i;
        }
        System.out.println(gcd);
 */
        // To check a number contain number of digit
/*
        System.out.println("Enter the number ");
        int num =sc.nextInt();
        int a=0;
        while (num==0){
            System.out.println(num);
            num=num/10;
            a++;
        }
        System.out.println(a);
 */
        //  Armstrong Number----------------------------------
/*
        System.out.println("Enter your Number ");
        int num = sc.nextInt();
        int rem,qus,sum=0;
        while (num!=0){
            rem=num%10;
            sum= (int) (sum+Math.pow(rem,3));
            num=num/10;
        }
        System.out.println(sum);
 */
        // Java Program to Make a Simple Calculator Using switch...case-----------------------------
/*
        System.out.println("Enter Your 1st Number ");
        int a=sc.nextInt();
        System.out.println("Enter Your 2nd Number");
        int b=sc.nextInt();
        System.out.println("What do you won't ");
        System.out.println("add(+) Press 1");
        System.out.println("Subtract(-) Press 2");
        System.out.println("Multiplication(x) Press 3");
        System.out.println("divide(/) Press 4");
        int value=sc.nextInt();
        int i = switch (value) {
            case 1 -> a + b;
            case 2 -> a - b;
            case 3 -> a * b;
            case 4 -> a / b;
            default -> 0;
        };
        System.out.println("Your Ans is :"+i);
 */
    // Binary Number change into decimal---------------------------------------
     /*   System.out.println("Enter Your Binary Number");
        long num = sc.nextInt();
        String a = String.valueOf(num);
        long rem, que, sum = 0;
        for (int i = 0; i < a.length(); i++) {
            rem = num % 10;
            sum = (long) (sum + Math.pow(2, i)*rem);
            num = num / 10;
        }
        System.out.println(sum);
      */
/*
        String A=sc.next();
        String B=sc.next();
//        Enter your code here. Print output to STDOUT.
        int a= A.length()+B.length();
        System.out.println(a);


        int result = A.compareTo( B );

        if(result>0)
            System.out.println("Yes");
        else if(result<0)
            System.out.println("No");
        else
            System.out.println("Equal");
// */
//        int[]a={1,2,3,4};
//        int temp=1;
//        for (int x:a) {
//            temp*=x;
//        }
//        for(int i=0;i<a.length;i++){
//            a[i]=temp/a[i];
//        }
//        for (int x:a             ) {
//            System.out.print(x+",");
//
//        }


//        Swaping the 2 number
        int a =12;
        int b=21;
        System.out.println("the value of a is "+a);
        System.out.println("the value of b is "+b);
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("After the swaping the number of a and b");
        System.out.println("the value of a is "+a);
        System.out.println("the value of b is "+b);

    }
    }

