package Level1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BT5 {
    public static void main (String [] args) {
        System.out.println("Output: " + firstLetter("Ng N Minh Anh"));
        System.out.println("Output: " + firstLetter("Greenwich University"));
    }

    public static String firstLetter(String str){
        return Arrays.stream(str.trim().split("\\s+"))
                .map(word -> word.substring(0, 1).toUpperCase())
                .collect(Collectors.joining(" "));
    }
}
