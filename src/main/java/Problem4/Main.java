package Problem4;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        int num1, num2, num3;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of num1: ");
        num1 = sc.nextInt();

        System.out.print("Enter the value of num2: ");
        num2 = sc.nextInt();

        System.out.println("Before swapping numbers: "+num1 +"  "+ num2);

        num3 = num1;
        num1 = num2;
        num2 = num3;

        System.out.println("After swapping: "+num1 +"   " + num2);
    }
}


