package Problem8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("How many numbers you want to enter? ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double[] arr = new double[n];
        double total = 0;

        for(int i=0; i<arr.length; i++){
            System.out.print("Enter Element No."+(i+1)+": ");
            arr[i] = scanner.nextDouble();
        }

        scanner.close();
        for (double v : arr) {
            total = total + v;
        }

        double average = total / arr.length;

        System.out.format("The average is: %.3f", average);
    }
}
