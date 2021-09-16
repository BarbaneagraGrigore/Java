package java.university.Chapter3;

import java.util.Scanner;

public class Dollar {
    public static void main(String[] args) {
        double penny = 0.01;
        double nickels = 0.05;
        double dimes = 0.10;
        double quarters = 0.25;
        int dollar = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to 'Change for a Dollar'! " +
                "Your goal is to enter enough change to make exactly $1.00");

        System.out.println("How many pennies would you like?");
        double numberOfPennies = scanner.nextDouble();

        System.out.println("How many nickels would you like?");
        double numberOfNickels = scanner.nextDouble();

        System.out.println("How many dimes would you like?");
        double numberOfDimes = scanner.nextDouble();

        System.out.println("How many quarters would you like?");
        double numberOfQuarters = scanner.nextDouble();

        scanner.close();

        double sum = numberOfDimes * dimes + numberOfNickels * nickels + numberOfQuarters * quarters + numberOfPennies * penny;
        double more = sum - dollar;
        double less = dollar - sum;

        if (sum > dollar) {
            System.out.println("It's more than one dollar by $" + String.format("%.2f", more) + " " + "cents.");
        } else if (sum < dollar) {
            System.out.println("You went under by $" + String.format("%.2f", less) + " " + "cents.");
        } else {
            System.out.println("You won the game!");
        }
    }
}
