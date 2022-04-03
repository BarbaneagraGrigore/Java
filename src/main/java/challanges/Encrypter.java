package challanges;

public class Encrypter {

    public static String textEncryption(String string) {
        String textWithoutSpace = string.replaceAll(" ", "");
        double root = Math.sqrt(textWithoutSpace.length());
        int row = (int) Math.floor(root);
        int column = root > row ? row + 1 : row;

        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < column; i++) {
            int index = i;
            while (index < textWithoutSpace.length()) {
                encrypted.append(textWithoutSpace.charAt(index));
                index += column;
            }
            encrypted.append(" ");
        }
        return String.valueOf(encrypted);
    }
//    imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau
}
