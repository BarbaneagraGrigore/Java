package Chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base cost of the plan: ");
        double baseCost = scanner.nextDouble();

        System.out.print("Enter overage minutes: ");
        double overageMinutes = scanner.nextInt();

        scanner.close();

        double overageCharge = calculateOverages(overageMinutes);
        double tax = calculateTax(baseCost + overageCharge);

        calculateAndPrintBill(baseCost, overageCharge, tax);
    }

    public static double calculateOverages(double extraMinutes) {
        double rate = 0.25;
        double overage = extraMinutes * rate;
        return overage;
    }

    public static double calculateTax(double subtotal) {
        double rate = 0.15;
        double tax = subtotal * rate;
        return tax;
    }

    public static void calculateAndPrintBill(double baseCost, double overage, double tax) {
        double finalTotal = baseCost + overage + tax;

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", baseCost));
        System.out.println("Overage: $" + String.format("%.2f", overage));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", finalTotal));
    }
}

