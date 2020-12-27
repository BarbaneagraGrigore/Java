package Problem0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("PLease enter an integer number: ");
        int input = scanner.nextInt();
        System.out.println("The entered number is: " + input);

        Integer[] intTable = new Integer[input];

        for(int i = 1; i <= input; i++){
            intTable[i-1] = i;
        }

        for(int j = 0; j < intTable.length; j++){
            System.out.println(intTable[j]);
        }
    }
}
