package Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class randomPopulateDoubleArray {
    public static void main(String args[]) {
        Random random = new Random();

        System.out.println("Enter the required size of 1st array: ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();

        System.out.println("Enter the required size of 2nd array: ");
        Scanner s1 = new Scanner(System.in);
        int size1 = s1.nextInt();

        s.close();
        s1.close();

        int myArray[][] = new int[size][size1];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size1; j++) {
                myArray[i][j] = random.nextInt();
            }
        }
        System.out.println("Contents of the array are: " + Arrays.toString(myArray));
    }

}

