package challanges;

import java.text.NumberFormat;
import java.util.Locale;

public class Currencies {

    public static void format() {
        double payment = 12324.134;

        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).getCurrency().getSymbol().replaceAll("CN", "") + payment;
        String us = NumberFormat.getCurrencyInstance(Locale.US).getCurrency().getSymbol() + payment;
        String france = payment + " " + NumberFormat.getCurrencyInstance(Locale.FRANCE).getCurrency().getSymbol();
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).getCurrency().getSymbol() + payment;

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
