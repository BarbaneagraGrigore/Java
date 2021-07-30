import java.util.Arrays;
import java.util.Random;

public class AverageOfArray {

    public static void findAverageOfArray(int number) {

        Random random = new Random();

        int[] myArray = new int[number];
        int total = 0;
        for (int i = 0; i < number; i++) {
            myArray[i] = random.nextInt();
        }

        System.out.println("Contents of the array are: " + Arrays.toString(myArray));

        for (int v : myArray) {
            total = total + v;
        }

        int average = total / myArray.length;

        System.out.println("The average is of the array is: " + average);
    }
}
