package challanges;

import java.util.HashSet;

public class Pairs {
    public static int findPairs(int[] array) {
        int[] arr = new int[]{10, 20, 10, 10, 21, 23, 23, 10};
        HashSet<Integer> unmatched = new HashSet<>();
        int pairs = 0;
        for (int j : arr) {
            if (!unmatched.add(j)) {
                unmatched.remove(j);
                pairs++;
            }
        }
        return pairs;
    }
}
