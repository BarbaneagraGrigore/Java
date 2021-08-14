package udemy;

public class HealthyBurger extends Hamburger {

    public HealthyBurger(String meat) {
        super("Healthy", "Brown Rye", meat);
    }

    private int addSoi(boolean isMeatSoi) {
        return (isMeatSoi) ? 12 : 0;
    }

    private int addAvocado(int numberOfAvocado) {
        int priceAvocado = 12;
        return (numberOfAvocado > 0) ? numberOfAvocado * priceAvocado : 0;
    }

    public int getTotalPrice(int numberCarrot, int numberLettuce, int numberTomato, int numberOfAvocado, boolean isMeatSoi) {
        return addCarrot(numberCarrot) + addLettuce(numberLettuce) + addTomato(numberTomato) + getBasePrice()
                + addAvocado(numberOfAvocado) + addSoi(isMeatSoi);
    }
}
