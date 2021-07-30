public class Comparator2Numbers {
    public static void findMaxMin(int number, int number2) {

        if (number > number2) {
            System.out.println("num1 is the maxim number: " + number);
        } else if (number2 > number) {
            System.out.println("num2 is the maxim number: " + number2);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
