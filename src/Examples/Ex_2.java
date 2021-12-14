package Examples;

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1)Reverse a Number
    /*    System.out.println("Enter your number ");
        int a = sc.nextInt();
        int sum=0,r;
        while (a!=0){
            r=a%10;
            sum=(sum*10)+r;
            a=a/10;
        }
        System.out.println(sum);
     */
        // Converting the Number into Word
        /*
        System.out.println("Enter your Number");
        int num = sc.nextInt();
        if (num>0 && num<999){
            int f = num%10;
            int d = num/10;
            int s = num%10;
            int t = num/100;
            System.out.println(num);
            String tin[] ={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
            String ten[] ={"","","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
            String hu="Hundred";
            if(num<20) {
                System.out.println(tin[num]);
            }
          if(num>20&&num<100){
              System.out.println(ten[f]+" "+tin[s]);
          }
             if (num>100){
                System.out.println(tin[t]+" "+hu+" "+ten[s]+" "+tin[f]);
            }
        }
        else {
            System.out.println("your number is more then 4 digit number");
        }
         */
        //  automorphism number--------------------------------------------------------------
        /*
        System.out.println("Enter your number ");
        int n =sc.nextInt();
        String lin = String.valueOf(n);
        int len=lin.length();
        int sq = n*n;
        int k=0;
        k=(int)Math.pow(10,len);

        int last=sq%k;
        System.out.println(last);
        if(last==n){
            System.out.println("your number is  Automorphism ");
        }
        else {
            System.out.println("your number is Not-Automorphism ");
        }
         */
        //  Peterson Number--------------------------------------------
//        System.out.println("Enter your Number ");
//        int num=sc.nextInt();
//        int cop=num;
//
//        int r,d,sum=0,val=0,a=1;
//
//        String Num= String.valueOf(num);
//        int n =Num.length();
////        System.out.println(n);
//
//
//        for (int i=0;i<n;i++){
//            r=cop%10;
////            System.out.println(r);
////            System.out.println(cop);
//            cop=cop/10;
//            for(int j=r;j>=1;j--){
//                sum=sum*j;
//            }
//            System.out.println(sum);
//        }

        for (int i = 0; i <10; i++) {
            if(i==3){
                if(i==3){
                    System.out.println(i);
                    break;
                }
            }
            System.out.println(i);
        }
        





    }
}
