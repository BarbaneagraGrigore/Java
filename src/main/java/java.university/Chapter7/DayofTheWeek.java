package java.university.Chapter7;

import java.util.Scanner;

public class DayofTheWeek {
    public static void main(String[] args) {
        String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number for the day of the week: ");

        int day = scanner.nextInt();
        scanner.close();

        System.out.println("Corresponding day: " + daysOfTheWeek[day - 1]);
    }
}
