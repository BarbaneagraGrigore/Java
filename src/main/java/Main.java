import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give an integer number: ");
        int number = scanner.nextInt();
        System.out.println("Give another integer number: ");
        int number2 = scanner.nextInt();

        System.out.println("Give a text: ");
        Scanner scanner1 = new Scanner(System.in);
        String text = scanner1.nextLine();

        System.out.println("Give a operation from +,-,/,* : ");
        Scanner scanner3 = new Scanner(System.in);
        char operator = scanner3.next().charAt(0);

        scanner1.close();
        scanner.close();
        scanner3.close();

        PrintedText.printText(text);
        RemoverOfLetter.removeX(text);
        PrintedNumbers.printNumbers(number);
        MaximumOfArray.largest();
        RandomPopulatedArray.populateArray(number);
        RandomPopulatedDoubleArray.populateDoubleArray(number, number2);
        Comparator2Numbers.findMaxMin(number,number2);
        Calculator.calculate(number,number2,operator);
        Swiper.swipeNumbers(number,number2);
        PrintedNumbersWhileLoop.displayWithWhileLoop(number);

        AverageOfArray.findAverageOfArray(number);
    }
}
