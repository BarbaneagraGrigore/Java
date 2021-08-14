package udemy;

public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private final int basePrice;
    private final int priceLettuce = 5;
    private final int priceTomato = 6;
    private final int priceCarrot = 7;

    public int getPriceLettuce(int numberLettuce) {
        return priceLettuce * numberLettuce;
    }

    public int getPriceTomato(int numberTomato) {
        return priceTomato * numberTomato;
    }

    public int getPriceCarrot(int numberCarrot) {
        return priceCarrot * numberCarrot;
    }

    public Hamburger(String name, String breadRollType, String meat) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = 50;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public int getTotalPrice(int numberCarrot, int numberLettuce, int numberTomato) {
        return addCarrot(numberCarrot) + addLettuce(numberLettuce) + addTomato(numberTomato) + basePrice;
    }

    public int addCarrot(int numberCarrot) {
        if (numberCarrot >= 0) {
            return numberCarrot * priceCarrot;
        }
        return -1;
    }

    public int addLettuce(int numberLettuce) {
        if (numberLettuce >= 0) {
            return numberLettuce * priceLettuce;
        }
        return -1;
    }

    public int addTomato(int numberTomato) {
        if (numberTomato >= 0) {
            return numberTomato * priceTomato;
        }
        return -1;
    }
}
