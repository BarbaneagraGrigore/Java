package udemy;

import com.google.gson.Gson;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;

    private final ArrayList<Contacts> mobilePhone;
    private final Gson gson = new Gson();

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.mobilePhone = new ArrayList<>();
    }

    public boolean addNewContact(Contacts contacts) {
        if (findContact(contacts.getName()) >= 0) {
            System.out.println("Contact is already on file.");
            return false;
        }
        mobilePhone.add(contacts);
        return true;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        } else if (findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() +
                    " already exits. Update was not successful");
            return false;
        }

        this.mobilePhone.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    private int findContact(Contacts contacts) {
        return this.mobilePhone.indexOf(contacts);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.mobilePhone.size(); i++) {
            Contacts contacts = this.mobilePhone.get(i);
            if (contacts.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public void printContacts() {
        System.out.println("You have " + mobilePhone.size() + " contacts in your mobile phone.");
        for (int i = 0; i < this.mobilePhone.size(); i++) {
            System.out.println((i + 1) + ". " + this.mobilePhone.get(i).getName() + " -> "
                    + this.mobilePhone.get(i).getPhoneNumber());
        }
    }

    public String queryContact(Contacts contacts) {
        if (findContact(contacts) >= 0) {
            return contacts.getName();
        }
        return null;
    }

    public Contacts queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.mobilePhone.get(position);
        }
        return null;
    }

    public boolean remove(Contacts contacts) {
        int foundPosition = findContact(contacts);
        if (foundPosition < 0) {
            System.out.println(contacts.getName() + " was not found.");
            return false;
        }
        this.mobilePhone.remove(foundPosition);
        System.out.println(contacts.getName() + " was deleted.");
        return true;
    }
}
//run this in main
//    private static final Scanner scanner = new Scanner(System.in);
//
//    private static final MobilePhone mobilePhone = new MobilePhone("123 123 123");
//
//    private static final Contacts contacts = new Contacts();
//
//
//    public static void main(String[] args) {
//        boolean quit = false;
//        int choice;
//
//        while (!quit) {
//            System.out.println("Enter your choice: ");
//            choice = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (choice) {
//                case 0:
//                    printInstructions();
//                    break;
//                case 1:
//                    add();
//                    break;
//                case 2:
//                    updateContact();
//                    break;
//                case 3:
//                    removeContact();
//                    break;
//                case 4:
//                    mobilePhone.printContacts();
//                    break;
//                case 5:
//                    queryContact();
//                    break;
//                case 6:
//                    quit = true;
//                    break;
//            }
//        }
//    }
//
//    private static void printInstructions() {
//        System.out.println("\n Press ");
//        System.out.println("\t 0 - Print instructions.");
//        System.out.println("\t 1 - Add contacts.");
//        System.out.println("\t 2 - Update contacts.");
//        System.out.println("\t 3 - Remove contacts.");
//        System.out.println("\t 4 - Print contacts.");
//        System.out.println("\t 5 - Query contacts.");
//        System.out.println("\t 6 - Quit.");
//    }
//
//    private static void add() {
//        System.out.print("Enter the name: ");
//        String name = scanner.nextLine();
//        System.out.print("Enter the phone number: ");
//        String phoneNumber = scanner.nextLine();
//        Contacts newContact = Contacts.createContact(name, phoneNumber);
//        if (mobilePhone.addNewContact(newContact)) {
//            System.out.println("New contact added: name : "
//                    + newContact.getName() + " , phone = " + newContact.getPhoneNumber());
//        } else {
//            System.out.println("Cannot add, " + newContact.getName() + " already on file.");
//        }
//    }
//
//    private static void updateContact() {
//        System.out.println("Enter existing contact name: ");
//        String name = scanner.nextLine();
//        Contacts existingContactRecord = mobilePhone.queryContact(name);
//        if (existingContactRecord == null) {
//            System.out.println("Contact not found.");
//        } else {
//            System.out.println("Enter new contact name: ");
//            String newName = scanner.nextLine();
//            System.out.println("Enter new contact phoneNumber: ");
//            String newNumber = scanner.nextLine();
//
//            Contacts newContact = Contacts.createContact(newName, newNumber);
//            if (mobilePhone.updateContact(existingContactRecord, newContact)) {
//                System.out.println("Successfully updated record.");
//            } else {
//                System.out.println("Error updating record.");
//            }
//        }
//    }
//
//    public static void removeContact() {
//        System.out.println("Enter existing contact name: ");
//        String name = scanner.nextLine();
//        Contacts existingContactRecord = mobilePhone.queryContact(name);
//        if (existingContactRecord == null) {
//            System.out.println("Contact not found.");
//        } else {
//            if (mobilePhone.remove(existingContactRecord)) {
//                System.out.println("Successfully deleted.");
//            } else {
//                System.out.println("Error deleting contact.");
//            }
//        }
//    }
//
//    private static void queryContact() {
//        System.out.println("Enter existing contact name: ");
//        String name = scanner.nextLine();
//        Contacts existingContactRecord = mobilePhone.queryContact(name);
//        if (existingContactRecord == null) {
//            System.out.println("Contact not found.");
//        } else {
//            System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());
//        }
//    }
