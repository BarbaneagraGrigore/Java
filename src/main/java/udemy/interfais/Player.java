package udemy.interfais;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();

        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);
        values.add(3, this.weapon);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if ((savedValues != null) && (savedValues.size() > 0)) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }
    }
}
//psvm {ISaveable player = new Player("Hammer", 10, 15);
//        System.out.println(player);
//        saveObject(player);
//        loadObject(player);
//        System.out.println(player);
//
//        ISaveable monster = new Monster("Orc", 120, 100);
//        System.out.println("Strength " + ((Monster) monster).getStrength());
//        System.out.println(monster);
//        saveObject(monster);}
//public static List<String> readValues() {
//        Scanner scanner = new Scanner(System.in);
//        List<String> values = new ArrayList<>();
//
//        boolean quit = false;
//        int index = 0;
//
//        System.out.println("Choose\n" + " 1 to enter a string\n"
//                + " 2 to quit");
//
//        while (!quit) {
//            System.out.println("Choose an option: ");
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (choice) {
//                case 1:
//                    System.out.println("Enter a string: ");
//                    String stringInput = scanner.nextLine();
//                    values.add(index, stringInput);
//                    index++;
//                    break;
//                case 2:
//                    quit = true;
//                    break;
//            }
//        }
//        return values;
//    }
//
//    public static void saveObject(ISaveable objectToSave) {
//        for (int i = 0; i < objectToSave.write().size(); i++) {
//            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");
//        }
//    }
//
//    public static void loadObject(ISaveable objectToLoad) {
//        List<String> values = readValues();
//        objectToLoad.read(values);
//    }
