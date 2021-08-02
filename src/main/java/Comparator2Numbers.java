public class Comparator2Numbers {
    public static void findMaxMin(int number, int number2) {

        if (number > number2) {
            System.out.println(number + " is bigger than " + number2);
        } else if (number2 > number) {
            System.out.println(number2 + " is bigger than " + number);
        } else {
            System.out.println(number + " and " + number2 + " are equal!");
        }
    }
}
