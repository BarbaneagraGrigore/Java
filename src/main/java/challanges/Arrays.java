package challanges;

import java.util.Random;

public class Arrays {

    private static final Random random = new Random();

    public static void reverseArray(int[] array) {
        int maxIndex = array.length - 1;
        int halfArray = array.length / 2;

        for (int i = 0; i < halfArray; i++) {
            int temporary = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temporary;
        }
        System.out.println("Reversed array = " + java.util.Arrays.toString(array));
    }

    public static void randomPopulateDoubleArray(int size, int size2) {
        int[][] array = new int[size][size2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size2; j++) {
                array[i][j] = random.nextInt();
            }
        }
        System.out.println("Contents of the double array are: " + java.util.Arrays.deepToString(array));
    }

    public static void randomPopulateArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        System.out.println("Contents of the array are: " + java.util.Arrays.toString(array));
    }

    public static void findAverage(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println("The average of the array is: " + (double) sum / array.length);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", type value was " + array[i]);
        }
    }

    //    sort from min to max
    public static int[] sortArray(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int k : array) {
            int numberOfBiggerNumbers = 0;

            for (int i : array) {
                if (k > i) numberOfBiggerNumbers++;
            }
            sortedArray[numberOfBiggerNumbers] = k;
        }
        return sortedArray;
    }

    public static void resizeArray(int[] array) {
        int[] baseData = new int[10];
        int[] myArray = baseData;

        baseData = new int[12];
        System.arraycopy(myArray, 0, baseData, 0, myArray.length);
    }

    public static void findMax(int[] array) {
        int max = 0;
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("The maximum number from the array is: " + max);
    }

    public static void findMin(int[] array) {
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println("The minimum number from the array is: " + min);
    }
}
