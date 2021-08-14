import udemy.DeluxeHamburger;
import udemy.Hamburger;
import udemy.HealthyBurger;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Original", "White", "Medium");

        System.out.println("Price for extra carrot is: " + hamburger.getPriceCarrot(1));
        System.out.println("Price for extra lettuce is: " + hamburger.getPriceLettuce(2));
        System.out.println("Price for extra tomato is: " + hamburger.getPriceTomato(3));
        System.out.println("Price for your hamburger is: " + hamburger.getTotalPrice(1, 2, 3));

        Hamburger defaultHamburger = new Hamburger("Simple", "Grey", "Raw");
        System.out.println("Price for your hamburger is: " + hamburger.getTotalPrice(0, 0, 0));

        HealthyBurger healthyBurger = new HealthyBurger("Chicken");
        System.out.println("Price for your healthy hamburger is: " + healthyBurger.getTotalPrice(0, 0, 0, 0, true));

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("White", "Pork");
        System.out.println("Price for your deluxe hamburger is: " + deluxeHamburger.getTotalPrice(0, 0, 0, 0, false, 1, 1));
    }
}