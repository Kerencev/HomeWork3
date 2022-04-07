import java.util.Arrays;

public class MissedNumber {

    public static int find(int[] arr) {

        int actualSum = 0;
        int sum = 0;

        actualSum = Arrays.stream(arr).sum();
        sum = (arr.length + 1) * (arr.length + 2) / 2;

        return sum - actualSum;
    }
}
