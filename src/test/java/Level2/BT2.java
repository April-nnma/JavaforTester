package Level2;

public class BT2 {
    public static void main(String[] args) {

        String input1 = "madam";
        String input2 = "hello";
        String input3 = "Able was I saw Elba";

        System.out.println("Input: \"" + input1 + "\" -> Output: " + isPalindrome(input1));
        System.out.println("Input: \"" + input2 + "\" -> Output: " + isPalindrome(input2));
        System.out.println("Input: \"" + input3 + "\" -> Output: " + isPalindrome(input3));
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}