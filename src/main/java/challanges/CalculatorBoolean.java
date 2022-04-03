package challanges;

public class CalculatorBoolean {
    public static boolean calculateBoolean(String[] array) {
        boolean result = Boolean.parseBoolean(array[0]);

        if (array.length > 1) {
            for (int i = 1; i < array.length; i++) {
                if (i % 2 == 0) {
                    if (array[i - 1].equals("&&")) {
                        return result && Boolean.parseBoolean(array[i]);
                    } else {
                        return result || Boolean.parseBoolean(array[i]);
                    }
                }
            }
            return result;
        } else {
            return result;
        }
    }
}
