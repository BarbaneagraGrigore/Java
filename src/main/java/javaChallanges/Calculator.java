package javaChallanges;

public class Calculator {

    public static void calculate(int number, int number2, char operator) {

        int answer = 0;

        switch (operator) {

            case '+':
                answer = number + number2;
                break;
            case '-':
                answer = number - number2;
                break;
            case '/':
                answer = number / number2;
                break;
            case '*':
                answer = number * number2;
                break;
        }
        System.out.println(number + " " + operator + " " + number2 + " = " + answer);
    }
}










