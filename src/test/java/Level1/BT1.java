package Level1;

public class BT1 {
    public static void main (String[] args){
        String input1 = "Cybersoft";
        String input2 = "Hello World";

        System.out.println("Input: " + input1 + " -> Output: " + removeVowels(input1));
        System.out.println("Input: " + input2 + " -> Output: " + removeVowels(input2));
    }

    public static String removeVowels(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }
}
