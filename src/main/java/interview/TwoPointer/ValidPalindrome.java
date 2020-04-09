package interview.TwoPointer;

/**
 * Given a non-empty string s,
 * you may delete at most one character.
 * Judge whether you can make it a palindrome.
 * Example 1:
 * Input: "aba"
 * Output: True
 * Example 2:
 * Input: "abca"
 * Output: True
 * Explanation: You could delete the character 'c'.
 */
public class ValidPalindrome {
    public static boolean validPalindrome(String s) {
        if (s == null) {
            return false;
        }
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
        }
        return true;
    }

    private static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if(s.charAt(i) == s.charAt(j)){
                i ++;
                j --;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String test = "cbbcc";
        System.out.println(validPalindrome(test));
    }
}
