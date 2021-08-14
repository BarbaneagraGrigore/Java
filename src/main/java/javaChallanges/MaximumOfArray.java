package javaChallanges;

public class MaximumOfArray {

    // Method to find maximum in arr[]
    public static void largest() {

        int [] array = {10, 324, 45, 90, 9808};

        int i;

        // Initialize maximum element
        int max = array[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < array.length; i++)
            if (array[i] > max)
                max = array[i];

        System.out.println("The maximum number from the array is: " + max);
    }
}