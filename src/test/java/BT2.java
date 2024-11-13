public class BT2 {
    public static void main (String [] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {0, 5, 10};
        int[] array3 = {15};

        System.out.println("Input: [1, 2, 3, 4, 5, 6] -> Output: " + findSecondLargest(array1));
        System.out.println("Input: [0, 5, 10] -> Output: " + findSecondLargest(array2));
        System.out.println("Input: [15] -> Output: " + findSecondLargest(array3));
    }

    public static int findSecondLargest(int [] arr){
        if (arr.length < 2) {
            return Integer.MIN_VALUE;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
            else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }
}
