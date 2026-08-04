import java.util.*;

class Result {

    public static int pickingNumbers(List<Integer> a) {

        int[] freq = new int[101];

        for (int num : a) {
            freq[num]++;
        }

        int maxLength = 0;

        for (int i = 1; i < 100; i++) {

            maxLength = Math.max(maxLength, freq[i] + freq[i + 1]);

        }

        return maxLength;
    }
}