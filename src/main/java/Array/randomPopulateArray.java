package Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class randomPopulateArray {
    public static void main(String args[]) {
        Random random = new Random();

        System.out.println("Enter the required size of the array: ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        s.close();

        int myArray[] = new int[size];
// we can use myArray.length or size for i<
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt();
        }
        System.out.println("Contents of the array are: " + Arrays.toString(myArray));
    }
}

