package Array;

public class maxArray {

    static int [] array = {10, 324, 45, 90, 9808};

    // Method to find maximum in arr[]
    static int largest() {
        int i;

        // Initialize maximum element
        int max = array[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < array.length; i++)
            if (array[i] > max)
                max = array[i];

        return max;
    }

    // Driver method
    public static void main(String[] args) {
        System.out.println("Largest in given array is " + largest());
    }
}