package String;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your string: ");
        String removeX = scanner.next();

        scanner.close();

        System.out.println(removeX.replaceAll("(^x|x$)|x", "$1"));
    }
}


