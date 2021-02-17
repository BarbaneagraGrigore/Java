package Problem6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("PLease enter an integer number: ");
        int input = scanner.nextInt();

        scanner.close();

        System.out.println("The entered number is: " + input);

        int i = 0;
        while(i<=input){
            System.out.println(i);
            i++;
        }


    }
}