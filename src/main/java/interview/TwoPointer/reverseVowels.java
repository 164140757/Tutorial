package interview.TwoPointer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Write a function that takes a string as input and reverse only the vowels of a string.
 * <p>
 * Example 1:
 * <p>
 * Input: "hello"
 * Output: "holle"
 */
public class reverseVowels {
    public static String reverseVowels(String s) {
        if (s == null) {
            return null;
        }
        char[] result = new char[s.length()];
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u',
                'A', 'E', 'I', 'O', 'U'));
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);

            if (!vowels.contains(s.charAt(i))) {
                result[i++] = ci;
            }
            else if (!vowels.contains(s.charAt(j))) {
                result[j--] = cj;
            }
            else{
                // reverse
                result[i++] = cj;
                result[j--] = ci;
            }

        }
        return new String(result);
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseVowels(s));
    }
}
