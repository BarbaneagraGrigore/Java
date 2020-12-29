package Problem7;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("PLease enter an integer number: ");
        int input = scanner.nextInt();

        System.out.println("The entered number is: " + input);

        int i;
        int[] integers = new int[input];
        for (i=0; i<integers.length; i++){
            System.out.println(integers[i]);
        }
    }
}
