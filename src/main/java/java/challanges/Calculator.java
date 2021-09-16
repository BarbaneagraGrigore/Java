package java.challanges;

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

    public static float multiply(float firstNumber, float secondNumber) {
        if (firstNumber >= 0 && firstNumber <= 100 && secondNumber >= 0 && secondNumber <= 100) {
            return firstNumber * secondNumber;
        } else return 0;
    }

    public static float subtract(float firstNumber, float secondNumber) {
        if (secondNumber >= 0 && firstNumber > secondNumber) {
            return firstNumber - secondNumber;
        } else return -1;
    }

    public static float divide(float numberToBeDivided, float divisor) {
        if (divisor >= 0 && numberToBeDivided >= divisor) {
            if (divisor == 0) {
                throw new IllegalArgumentException("Argument 'divisor' is 0");
            }
            return numberToBeDivided / divisor;
        } else return 0;
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










