public class GetDigitCount {
    public static int getDigitCount(int number) {
        if (number < 1) {
            return -1;
        }
        int count = 1;
        while (number > 9) {
            number /= 10;
            count++;
        }
        return count;
    }
}
