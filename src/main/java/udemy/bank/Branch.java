package udemy.bank;

import java.util.ArrayList;

public class Branch {
    private final String name;
    private final ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer == null) {
            System.out.println("Customer with the name " + customerName + " does not exist.");
            return false;
        } else {
            existingCustomer.addTransaction(amount);
            return true;
        }
    }

    private Customer findCustomer(String customerName) {
        for (Customer customer : this.customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }
}
