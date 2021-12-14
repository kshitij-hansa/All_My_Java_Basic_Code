package Examples;

import java.util.Scanner;

class day{
    int d,m,y;
    public String findday(int day, int month, int year){
        this.d=day;
        this.m=month;
        this.y=year;
        int m2;
        switch (m){
            case 1:m2=0;
                break;
            case 2:m2=3;
                break;
            case 3:m2=3;
                break;
            case 4:m2=6;
                break;
            case 5:m2=1;
                break;
            case 6:m2=4;
                break;
            case 7:m2=6;
                break;
            case 8:m2=2;
                break;
            case 9:m2=5;
                break;
            case 10:m2=0;
                break;
            case 11:m2=3;
                break;
            case 12:m2=5;
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + m);
        }
        int y1=0;
        if(y>2000&&y<2099||y>2400&&y<2499||y>2800&&y<2899) y1=y1+6;

        else if(y>2100&&y<2199||y>2500&&y<2599||y>2900&&y<3000) y1=y1+4;

        else if(y>2200&&y<2299||y>2600&&y<2699)y1=y1+2;

        else if(y>2300&&y<2399||y>2700&&y<2799||y>1900&&y<1999) y1=y1*0;


        int y2=y%100;
        int y3=y2/4;
        int day2=0;
        if (d<0||d>31||m<0||m>12){
            System.out.println("your enter the date is invallade");
        }
        else {
            if(y%4==0 && y%100==0 || y%400==0){
                day2=day2+d+m2+y2+y1+y3-1;
            }
            else {
                day2=day2+d+m2+y2+y1+y3;

            }
        }
        int d2=day2%7;
        String[]s={"Sunday","Monday","tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.println(s[d2]);
        return s[d2];

    }
}
public class day_and_time {
    public static void main(String[] args) {
      day Day=new day();
        System.out.println("Enter your date month and year");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
      Day.findday(a,b,c);
    }
}
