package javaChallanges;

import java.util.Arrays;
import java.util.Random;

public class RandomPopulatedDoubleArray {
    public static void populateDoubleArray(int number, int number2) {
        Random random = new Random();

        int[][] myArray = new int[number][number2];

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number2; j++) {
                myArray[i][j] = random.nextInt();
            }
        }
        System.out.println("Contents of the double array are: " + Arrays.deepToString(myArray));
    }

}

