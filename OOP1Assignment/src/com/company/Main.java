package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 =65 ;
        int num2 =6;
        int num3=5;
        System.out.print("Enter KCSE grade: " );
        num1= input.nextInt();
        if(num1>65){System.out.println("Admitted." );}
        else if(num1<65){System.out.println("Rejected." );}

        System.out.print("Enter Interview questions score: ");
        num2= input.nextInt();
        if(num2>6){System.out.println("Admitted.");}
        else if(num2<6){System.out.println("Rejected.");}

        System.out.print("Enter Confidence level score: ");
        num3= input.nextInt();
        if(num3>5){System.out.println("Admitted.");}
        else if(num3<5){System.out.println("Rejected");}



    }
}
