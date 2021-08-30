package udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GroceryList {
    private final ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    public void removeGroceryItem(String newItem) {
        int position = findItem(newItem);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        System.out.println("The removed item is: " + groceryList.get(position));
        groceryList.remove(position);
    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        return position >= 0;
    }
}
//Run below in main
//
//    private static final Scanner scanner = new Scanner(System.in);
//    private static final GroceryList groceryList = new GroceryList();
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
//                    groceryList.printGroceryList();
//                    break;
//                case 2:
//                    addItem();
//                    break;
//                case 3:
//                    modifyItem();
//                    break;
//                case 4:
//                    removeItem();
//                    break;
//                case 5:
//                    searchForItem();
//                    break;
//                case 6:
//                    processArrayList();
//                    break;
//                case 7:
//                    quit = true;
//                    break;
//            }
//        }
//    }
//
//    public static void printInstructions() {
//        System.out.println("\nPress");
//        System.out.println("\t 0 - To print choice options.");
//        System.out.println("\t 1 - To print the list of grocery items.");
//        System.out.println("\t 2 - To add an item to the list.");
//        System.out.println("\t 3 - To modify an item in the list.");
//        System.out.println("\t 4 - To remove an item from the list.");
//        System.out.println("\t 5 - To search for an item in the list.");
//        System.out.println("\t 6 - To quit the application.");
//    }
//
//    public static void addItem() {
//        System.out.print("Please enter a grocery item: ");
//        groceryList.addGroceryItem(scanner.nextLine());
//    }
//
//    public static void modifyItem() {
//        System.out.print("Enter item that you want to be modified: ");
//        String oldItem = scanner.nextLine();
//        System.out.print("Enter replacement item: ");
//        String newItem = scanner.nextLine();
//        groceryList.modifyGroceryItem(oldItem, newItem);
//    }
//
//    public static void removeItem() {
//        System.out.print("Enter item name: ");
//        String item = scanner.nextLine();
//        groceryList.removeGroceryItem(item);
//    }
//
//    public static void searchForItem() {
//        System.out.println("Item to search for: ");
//        String searchItem = scanner.nextLine();
//        if (groceryList.onFile(searchItem)) {
//            System.out.println("Found " + searchItem + " in our grocery list.");
//        } else {
//            System.out.println(searchItem + " is not in the grocery list.");
//        }
//    }
//
//    public static void processArrayList() {
//        ArrayList<String> newArray = new ArrayList<>(groceryList.getGroceryList());
//        String[] array = new String[newArray.size()];
//        array = newArray.toArray(array);
//        System.out.println(Arrays.toString(array));
//    }
