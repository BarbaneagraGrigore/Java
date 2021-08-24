package javaChallanges;

public class Calculator {

    public static void calculate(int number, int number2, char operator) {
        int result = 0;

        switch (operator) {
            case '+':
                result = number + number2;
                break;
            case '-':
                result = number - number2;
                break;
            case '/':
                result = number / number2;
                break;
            case '*':
                result = number * number2;
                break;
        }
        System.out.println(number + " " + operator + " " + number2 + " = " + result);
    }

    //    calculates the sum of the even digits from the number
    public static void sumEvenDigits(int number) {
        System.out.println("The number you entered is: " + number);
        if (number < 0) {
            number *= -1;
        }
        int sum = 0;
        while (number != 0) {
            sum += (number % 2 == 0) ? number % 10 : 0;
            number /= 10;
        }
        System.out.println("The sum of the number you entered is: " + sum);
    }

    public static void sumFirstAndLastDigit(int number) {
        System.out.println("The number you entered is: " + number);

        int lastDigit = number % 10;

        if (lastDigit < 0) {
            lastDigit *= -1;
        }

        if (number < 0) {
            number *= -1;
        }

        int sum;
        while (number > 9) {
            number /= 10;
        }
        System.out.println("The sum of the first and last digit is: " + lastDigit + number);
    }
}










