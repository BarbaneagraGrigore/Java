package challanges;

public class RemoverOfLetter {

    public static void removeX(String text) {
        System.out.println(text.replaceAll("(^x|x$)|x", "$1"));
    }
}


