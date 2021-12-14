package Examples;

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//         1) Fibonacci Series
        /*
        long a = 0;
        long b = 1;
        long c = 0;
        System.out.println("Enter your length of Fibonacci Series ");
        int l = sc.nextInt();
        System.out.print(a);
        System.out.print(b);
        for(int x=0;x<=l;x++){
            c=a+b;
            System.out.println(" "+c);
            a=b;
            b=c;
        }
         */

        // 2) Prime Number
        /*
        System.out.println("Enter your number");
        int num=sc.nextInt();
        int n=0;

        for(int i=2;i<=num-1;i++){
            if(num%i==0){
                n=n+1;
            }
        }
        if(n>0){
            System.out.println("your number is not Prime");
        }
        else{
            System.out.println("Your number is Prime");
        }
         */

        // 3) Palindrome
        /*
        System.out.println("Enter your number");
        int num=sc.nextInt();
        int sum=0;
        int rim;
        int num2=num;
        for(int i=0;i<=num;i++){
            rim=num%10;
            sum=(sum*10)+rim;
            num=num/10;
            System.out.println(sum);
        }
        if(sum==num2){
            System.out.println("Number is Palindrom");
        }
        else {
            System.out.println("Number is Not-Palindrom");
        }
         */

        //4) Factorial
        /*
        System.out.println("Enter your number");
        int num = sc.nextInt();
        int r=1,sum=0;

        for(int i=1;i<=num;i++){
            r=r*i;
        }
        System.out.println("The Factorial of the number is "+r);
         */

        //  Armstrong number
        /*
        System.out.println("Enter your number");
        int num=sc.nextInt();
        int sum=0;
        int rim;
        int num2=num;
       while (num!=0){
            rim=num%10;
            sum= sum+(rim*rim*rim);
            num=num/10;
        }

        if (sum==num2){
            System.out.println("your number "+num2+"is Armstrong  "+sum);
        }
        else{
            System.out.println("your number "+num2+"is Not-Armstrong  "+sum);
        }
         */

        // ASCII value
        /*
        char ch1 = 'a';
        char ch2 = 'b';
        int asciivalue1 = ch1;
        int asciivalue2 = ch2;
        System.out.println("The ASCII value of " + ch1 + " is: " + asciivalue1);
        System.out.println("The ASCII value of " + ch2 + " is: " + asciivalue2);
         */
        // table of 1 to 20
        /*
        int x = 1;
        for (int i = 1;i<=10;i++){
            for (int j = 1;j<=20;j++){
                System.out.printf("%-5s",j*i);
            }
            System.out.println("");
        }
         */
    }
}
