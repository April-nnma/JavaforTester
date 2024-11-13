public class BT3 {
    public static void main (String [] args) {
        System.out.println("Input: 10 -> Output: " + sumEven(10));
        System.out.println("Input: 20 -> Output: " + sumEven(20));
    }

    public static int sumEven(int n) {
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
