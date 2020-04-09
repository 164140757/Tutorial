package interview.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a string and a string dictionary, find the longest string
 * in the dictionary that can be formed by deleting some characters
 * of the given string. If there are more than one possible results,
 * return the longest word with the smallest lexicographical order.
 * If there is no possible result, return the empty string.
 * Example 1:
 * Input:
 * s = "abpcplea", d = ["ale","apple","monkey","plea"]
 * <p>
 * Output:
 * "apple"
 * Example 2:
 * Input:
 * s = "abpcplea", d = ["a","b","c"]
 * <p>
 * Output:
 * "a"
 */
public class LongestWordInDictionary {
    public static String findLongestWord(String s, List<String> d) {
        String longestWord = "";
        for (String s1 : d) {
            int l1 = longestWord.length(), l2 = s1.length();
            if (l1 > l2 || (l1 == l2 && longestWord.compareTo(s1) < 0)) {
                continue;
            }
            if (isSubString(s, s1)) {
                longestWord = s1;
            }
        }
        return longestWord;
    }

    private static boolean isSubString(String s, String s1) {
        int i = 0, j = 0;
        while (i < s.length() && j < s1.length()) {
            if (s.charAt(i) == s1.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == s1.length();
    }

    public static void main(String[] args) {
        String s = "abpcplea";
        List<String> list = new ArrayList<>(Arrays.asList("ale","apple","monkey","plea"));
        System.out.println(findLongestWord(s,list));
    }
}
