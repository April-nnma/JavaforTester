public class BT1 {
    public static void main (String[] args){
        String input1 = "Cybersoft";
        String input2 = "Hello World";

        System.out.println("Input: " + input1 + " -> Output: " + removeVowels(input1));
        System.out.println("Input: " + input2 + " -> Output: " + removeVowels(input2));
    }

    public static String removeVowels(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!isVowel(ch)) {
                result += ch;
            }
        }
        return result.toString();
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
