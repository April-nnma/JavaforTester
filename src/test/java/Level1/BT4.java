package Level1;

public class BT4 {
    public static void main (String [] args) {
        String input1 = "Xin chào các bạn";
        String input2 = "Hello World";

        System.out.println("Input: \"" + input1 + "\" -> Output: " + countWords(input1));
        System.out.println("Input: \"" + input2 + "\" -> Output: " + countWords(input2));
    }

    public static int countWords(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        String[] words = str.split("\\s+");
        return words.length;
    }
}
