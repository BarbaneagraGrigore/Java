package udemy.bank;

import java.util.ArrayList;

public class Bank {
    private final String name;
    private final ArrayList<Branch> branch;

    public Bank(String name) {
        this.name = name;
        this.branch = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branch.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (Branch branch : this.branch) {
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch: " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println((i + 1) + " customer name: " + branchCustomer.getName());
                if (showTransactions) {
                    System.out.println("Transactions: ");

                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println((j + 1) + " Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}

// run below in main
//    Bank bank = new Bank("National Australia Bank");
//
//        bank.addBranch("Adelaide");
//
//                bank.addCustomer("Adelaide", "George", 50.12);
//                bank.addCustomer("Adelaide", "Mike", 150.12);
//                bank.addCustomer("Adelaide", "Johnathan", 2310.12);
//
//                bank.addBranch("Sydney");
//                bank.addCustomer("Sydney", "Bob", 1310.12);
//
//                bank.addCustomerTransaction("Adelaide", "George", 44.12);
//                bank.addCustomerTransaction("Adelaide", "George", 1244.12);
//                bank.addCustomerTransaction("Adelaide", "Johnathan", 44.12);
//
//                bank.listCustomers("Adelaide", true);
//                bank.listCustomers("Sydney", true);
//
//                bank.addBranch("Melbourne");
//                if (!bank.addCustomer("Melbourne", "Brian", 5.54)) {
//                System.out.println("Error Melbourne branch does not exist.");
//                }
//
//                if(!bank.addBranch("Adelaide")){
//                System.out.println("Adelaide branch already exist.");
//                }
//                }
