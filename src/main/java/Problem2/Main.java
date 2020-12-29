package Problem2;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        int num1;
        int num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter 2nd number: ");
        num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.println("num1 is the maxim number: " + num1);
        }
        else if(num2 > num1){
            System.out.println("num2 is the maxim number: " + num2);
        }
        else {
            System.out.println("The numbers are equal!");
        }
    }

}
