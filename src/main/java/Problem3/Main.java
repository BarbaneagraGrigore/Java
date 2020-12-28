package Problem3;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        double num1;
        double num2;
        char operator;
        double answer = 0.0D;

        Scanner scanObject = new Scanner (System.in);

        System.out.print("Please enter first number: ");
        num1 = scanObject.nextDouble();
        System.out.print("Please enter second number: ");
        num2 = scanObject.nextDouble();
        System.out.print("What operation? ");
        operator = scanObject.next().charAt(0);

        switch (operator) {

            case '+' : answer = num1 + num2;
                break;
            case '-' : answer = num1 - num2;
                break;
            case '/' : answer = num1 / num2;
                break;
            case '*' : answer = num1 * num2;
                break;
        }

        System.out.println(num1+" "+operator+" "+num2+" = "+answer);
    }
}










