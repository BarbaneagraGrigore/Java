package challanges;

public class Decrypter {

    public static String addChar(String str, char ch, int position) {
        return str.substring(0, position) + ch;
    }

    public static String transformStringLength(String text) {
        String addToTextElement = text.replaceAll(" ", "");
        char elementToAdd = '+';
        int times = 0;

        do {
            addToTextElement = addChar(addToTextElement, elementToAdd, text.replaceAll(" ", "").length() + times);
            times++;
        }
        while (Math.floor(Math.sqrt(addToTextElement.length())) != (int) Math.ceil(Math.sqrt(addToTextElement.length())));
        return addToTextElement;
    }
}
