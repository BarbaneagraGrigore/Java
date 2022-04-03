package challanges;

public class CalculatorFeetAndInchesToCentimeters {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double cm = (feet * 12) * 2.54;
            cm += inches * 2.54;
            System.out.println(feet + " feet, " + inches + " inches = " + cm + " centimeters.");
            return cm;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double feet = inches / 12;
            double remainingInches = 0;
            double remainingFeet;
            double wholeFeet;
            if (feet - Math.floor(feet) == 0) {
                System.out.println(inches + " inches is equal to " + feet + " feet.");
                return calcFeetAndInchesToCentimeters(feet, remainingInches);
            } else {
                remainingFeet = feet % 10;
                wholeFeet = feet - remainingFeet;
                remainingInches = inches - wholeFeet * 12;
                System.out.println(inches + " inches is equal to " + wholeFeet + " feet and " + remainingInches + " remaining inches");
            }
            return calcFeetAndInchesToCentimeters(wholeFeet, remainingInches);
        } else {
            return -1;
        }
    }
}
