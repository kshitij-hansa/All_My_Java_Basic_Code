package Sagar;

import java.util.Scanner;

public class Swaan2
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        to denote the Dear allowance and House rent
        System.out.println("Enter your salary:");
        int Salary = sc.nextInt();
        float DR = (Salary/100)*40;
        float HR = (Salary/100)*20;

        System.out.println("Your Dear allowance is = "+DR);
        System.out.println("Your House rent is = "+HR);
    }
}
