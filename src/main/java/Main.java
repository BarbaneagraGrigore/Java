import java.io.IOException;
import java.util.Scanner;

import static challanges.Decrypter.transformStringLength;
import static challanges.Encrypter.*;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Please insert the text and press Enter: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();

        System.out.println("You entered the following text: " + text);
        System.out.println("The text without spaces looks like this: " + text.replaceAll(" ", ""));
        System.out.println("The length of the text without spaces is: " + text.replaceAll(" ", "").length());

        String text2 = text;

        if (Math.floor(Math.sqrt(text.replaceAll(" ", "").length())) != (int) Math.ceil(Math.sqrt(text.replaceAll(" ", "").length()))) {
            text2 = transformStringLength(text);
        }

        System.out.println();
        printInColumnsAndRowsTheNormalText(text2);
        System.out.println("--------------------");
        System.out.println(encryptText(text2));
        System.out.println("--------------------");
        printInColumnsAndRowsEncryptedText(encryptText(text2).replaceAll(" ", ""));
        System.out.println("--------------------");
        System.out.println(printFromTheEncryptedText(encryptText(text2).replaceAll(" ", "")));
        System.out.println("--------------------");
        System.out.println(printFromTheEncryptedText(encryptText(text2).replaceAll(" ", "")).replaceAll(" ", ""));
        System.out.println("--------------------");
        saveSpaces(text);
        System.out.println("--------------------");
        System.out.println(transformStringToListOfChars(text, printFromTheEncryptedText(encryptText(text2).replaceAll(" ", "")).replaceAll(" ", "")));
        System.out.println("--------------------");
        System.out.println(printTheDecryptedText(text, printFromTheEncryptedText(encryptText(text2).replaceAll(" ", "")).replaceAll(" ", "")));
    }
}


//        reverse("12ab3!");
//        format();


//    public static void reverseString(String string) {
//        StringBuilder sb = new StringBuilder(string);
//        System.out.println(sb.reverse());
//    }
//
//    public static boolean stringHasDigits(String string) {
//        return string.matches(".*\\d.*");
//    }
//
//    public static boolean stringHasSymbols(String string) {
//        Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
//        return string.matches(String.valueOf(special));
//    }
//
//    public static void reverse(String string) {
//        if (stringHasDigits(string) || (stringHasSymbols(string))) {
//            System.out.println(reverseStringWithDigitsAndSymbols(string));
//        } else {
//            reverseString(string);
//        }
//    }
//
//    public static String reverseStringWithDigitsAndSymbols(String string) {
//        char[] stringToChar = string.toCharArray();
//        int startArray = 0;
//        int endArray = stringToChar.length - 1;
//        while (startArray < endArray) {
//            if (!Character.isAlphabetic(stringToChar[startArray])) {
//                startArray++;
//            } else if (!Character.isAlphabetic(stringToChar[endArray])) {
//                endArray--;
//            } else {
//                char temporary = stringToChar[startArray];
//                stringToChar[startArray] = stringToChar[endArray];
//                stringToChar[endArray] = temporary;
//                startArray++;
//                endArray--;
//            }
//        }
//        return new String(stringToChar);
//    }