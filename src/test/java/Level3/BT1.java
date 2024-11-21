package Level3;

public class BT1 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 8, 10, 15};
        int target = 18;

        int[] result = twoSum(numbers, target);

        if (result.length > 0) {
            System.out.println("[" + numbers[result[0] - 1] + ", " + numbers[result[1] - 1] + "]");
        } else {
            System.out.println("Not found ^_^");
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            }
            if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
        return new int[]{};
    }
}
