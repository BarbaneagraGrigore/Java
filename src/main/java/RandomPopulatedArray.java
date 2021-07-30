import java.util.Arrays;
import java.util.Random;

public class RandomPopulatedArray {
    public static void populateArray(int size) {

        Random random = new Random();

        int[] myArray = new int[size];
        for (int i = 0; i < size; i++) {
            myArray[i] = random.nextInt();
        }
        System.out.println("Contents of the array are: " + Arrays.toString(myArray));
    }
}

