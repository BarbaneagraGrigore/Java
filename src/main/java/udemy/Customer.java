package udemy;

import java.util.ArrayList;

public class Customer {
    private final String name;
    private final ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String name, double initialAmount) {
        this.name = name;
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

}
