package challanges;

public class Swiper {
    public static void swipeNumbers(int number, int number2) {
        int num3;

        System.out.println("Before swapping numbers: " + number + " , " + number2);

        num3 = number;
        number = number2;
        number2 = num3;

        System.out.println("After swapping: " + number + " , " + number2);
    }
}


