package udemy;

public class DeluxeHamburger extends Hamburger {
    private int chips;
    private int drinks;

    public DeluxeHamburger(String breadRollType, String meat) {
        super("Deluxe", breadRollType, meat);
    }

    private int addChips(int numberBagChips) {
        int priceChips = 6;
        return priceChips * numberBagChips;
    }

    private int addDrinks(int numberOfDrinks) {
        int priceDrink = 6;
        return numberOfDrinks * priceDrink;
    }

    public int getTotalPrice(int numberCarrot, int numberLettuce, int numberTomato, int numberOfAvocado, boolean isMeatSoi, int numberBagChips, int numberOfDrinks) {
        return addCarrot(numberCarrot) + addLettuce(numberLettuce) + addTomato(numberTomato) + getBasePrice()
                + addChips(numberBagChips) + addDrinks(numberOfDrinks);
    }
}

