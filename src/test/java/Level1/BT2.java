package Level1;

import java.util.Arrays;

public class BT2 {
    public static void main (String [] args) {
        System.out.println("Output: " + findSecondLargest(new int[] {2, 4, 6, 8, 10, 12}));
        System.out.println("Output: " + findSecondLargest(new int[] {0, 5, 10}));
        System.out.println("Output: " + findSecondLargest(new int[] {19}));
    }

    public static int findSecondLargest(int[] arr) {
        int[] sortArr = Arrays.stream(arr)
                .distinct()
                .sorted()
                .toArray();
        if (sortArr.length < 2) {
            return Integer.MIN_VALUE;
        }
        return sortArr[sortArr.length - 2];
    }
}