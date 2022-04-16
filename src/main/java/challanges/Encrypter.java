package challanges;

import java.util.ArrayList;
import java.util.List;

public class Encrypter {
    static int columnValue;

    public static void printInColumnsAndRowsTheNormalText(String text) {
        String textWithoutSpace = text.replaceAll(" ", "");
        double root = Math.sqrt(textWithoutSpace.length());
        int row = (int) Math.floor(root);
        int column = root > row ? row + 1 : row;
        columnValue = column;

        for (int i = 0; i < textWithoutSpace.length(); i++) {
            System.out.print(textWithoutSpace.charAt(i));
            //    printăm până în nr 9, în 8 coloane, respectiv când i = 7 , și 7 modal de 8 egal cu 7 se face rând nou
            if (i % column == column - 1) {
                System.out.println();
            }
        }
    }

    public static String encryptText(String text) {
        String textWithoutSpace = text.replaceAll(" ", "");
        double root = Math.sqrt(textWithoutSpace.length());
        int row = (int) Math.floor(root);
        int column = root > row ? row + 1 : row;
        //        vom folosi stringbuilder pentru a modifica string-ul inițial
        StringBuilder encrypted = new StringBuilder();
        //        parcurgem prin elementele primei coloane
        for (int i = 0; i < column; i++) {
            int index = i;
            //        atâta timp cât poziția elementului nu este mai mare ca lungimea string-ului îl printăm
            while (index < textWithoutSpace.length()) {
//                folosing appens adăugăm caracterul la sfârșitul informației
                encrypted.append(textWithoutSpace.charAt(index));
                index += column;
            }
            encrypted.append(" ");
        }
        return new String(encrypted);
    }

    public static void printInColumnsAndRowsEncryptedText(String text) {
        for (int j = 0; j < columnValue; j++) {
            for (int i = j; i < text.length(); i += columnValue) {
                System.out.print(text.charAt(i));
            }
            System.out.println();
        }
    }

    public static String printFromTheEncryptedText(String text) {
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < columnValue; i++) {
            int index = i;
            while (index < text.length()) {
                encrypted.append(text.charAt(index));
                index += columnValue;
            }
            encrypted.append(" ");
        }
        return new String(encrypted);
    }

    public static void saveSpaces(String text) {
        char space = ' ';
        int index = text.indexOf(space);
        while (index != -1) {
            System.out.println("Space at index: " + index);
            index = text.indexOf(space, index + 1);
        }
    }

    public static List<Character> transformStringToListOfChars(String originalText, String text) {
        List<Character> chars = new ArrayList<>();
        char space = ' ';
        int index = originalText.indexOf(space);

        while (index != -1) {
            for (char letter : text.toCharArray()) {
                chars.add(letter);
                if (chars.size() - 1 == index) {
                    chars.add(index, space);
                    index = originalText.indexOf(space, index + 1);
                }
            }
        }
        return chars;
    }

    public static String printTheDecryptedText(String originalText, String text) {
        StringBuilder stringBuilder = new StringBuilder();
        List<Character> list = transformStringToListOfChars(originalText, text);

        for (Character character : list) {
            stringBuilder.append(character);
        }

        return new String(stringBuilder).replaceAll("\\+", "");
    }
}