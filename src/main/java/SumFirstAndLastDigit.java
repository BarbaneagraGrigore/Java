public class SumFirstAndLastDigit {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        } else {
            int lastDigit = number % 10;
            while (number > 9) {
                number /= 10;
            }
            return lastDigit + number;
        }
    }
}
