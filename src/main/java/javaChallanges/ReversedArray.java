package javaChallanges;

import java.util.Arrays;
import java.util.Scanner;

public class ReversedArray {
    static Scanner scanner = new Scanner(System.in);

    public static int getLength() {
        int length = scanner.nextInt();
        scanner.nextLine();
        return length;
    }

    public static int[] getIntegers(int number) {
        int[] myArray = new int[number];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return myArray;
    }

    public static void reverse(int[] array) {

        int maxIndex = array.length - 1;
        int halfArray = array.length / 2;
        for (int i = 0; i < halfArray; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
