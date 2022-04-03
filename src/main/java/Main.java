import java.io.IOException;

import static challanges.Encrypter.textEncryption;

public class Main {
    public static void main(String[] args) throws IOException {
//        reverse("12ab3!");

        String text = "if man was meant to stay on the ground god would have given us roots";

//        printStringInColumnsAndRows(string);
//        System.out.println(encryption(string));
        textEncryption(text);
    }


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
}