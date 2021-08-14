package javaChallanges;

public class DataTypes {
    public static void typeDataTypes(int number) {
        for (int i = 0; i < 1; i++) {
            try {
                if (number >= -128 && number <= 128)
                    System.out.println("* byte");
                if (number >= -Math.pow(2, 15) && number <= Math.pow(2, 15) - 1)
                    System.out.println("* short");
                if (number >= -Math.pow(2, 31) && number <= Math.pow(2, 31) - 1)
                    System.out.println("* int");
                if (number >= -Math.pow(2, 63) && number <= Math.pow(2, 63) - 1)
                    System.out.println("* long");
            } catch (Exception e) {
                System.out.println(number + " can't be fitted anywhere.");
            }
        }
    }
}