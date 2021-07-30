import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give an integer number: ");
        int number = scanner.nextInt();
        scanner.close();

//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Give a text: ");
//        String text = scanner1.nextLine();
//        scanner1.close();

//        PrintedText.printText(text);
        PrintedNumbers.printNumbers(number);
        MaximumOfArray.largest();
        RandomPopulatedArray.populateArray(number);

    }
}
