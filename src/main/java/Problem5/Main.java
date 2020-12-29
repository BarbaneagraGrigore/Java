package Problem5;

import java.util.Scanner;

public class Main {
    Scanner scanObject = new Scanner (System.in);
    int x, y, z;

    public int sum(int x, int y) {
        System.out.print("Please enter the first number: ");
        x = scanObject.nextInt();

        System.out.print("Please enter the second number: ");
        y = scanObject.nextInt();
        return (x + y);
    }

    public int sum(int x, int y, int z) {
        System.out.print("Please enter the first number: ");
        x = scanObject.nextInt();

        System.out.print("Please enter the second number: ");
        y = scanObject.nextInt();

        System.out.print("Please enter the third number: ");
        z = scanObject.nextInt();
        return (x + y + z);
    }

    public static void main(String[]args) {
        Main s = new Main();
        System.out.println("The result is: " + s.sum(s.x, s.y));
        System.out.println("The result is: " + s.sum(s.x, s.y, s.z));
    }
}

class Second extends Main {
    Scanner scanObject = new Scanner (System.in);
    int x, y;

    public int sum(int x, int y) {
        System.out.print("Please enter the first number: ");
        x = scanObject.nextInt();

        System.out.print("Please enter the second number: ");
        y = scanObject.nextInt();
        return (x * y);
    }
}
class OverridingTest{
    public static void main(String [] args){
        Main dif = new Second();
        System.out.println();
    }
}

/*
class A {
    public void doSth() { /// }
    }

    class B extends A {
        public void doSth() { method overriden }

        public void doSth(String b) {  method overloaded  }

    }
*/