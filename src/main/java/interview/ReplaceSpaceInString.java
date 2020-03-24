package interview;

/**
 * 将一个字符串中的空格替换成 "%20"。
 *
 * Input:
 * "A B"
 *
 * Output:
 * "A%20B"
 */
public class ReplaceSpaceInString {
    public static String replaceSpace(StringBuffer str) {
        int p1 = str.length() - 1;
        // exaggerate
        for (int i = 0; i <= p1; i++) {
            if (str.charAt(i) == ' ') {
                str.append("  ");
            }
        }
        int p2 = str.length() - 1;
        // replace
        for (; p1 >= 0 && p2>p1 ; p1--) {
            if (str.charAt(p1) == ' ') {
                str.setCharAt(p2--, '0');
                str.setCharAt(p2--, '2');
                str.setCharAt(p2--, '%');
            } else {
                str.setCharAt(p2--, str.charAt(p1));
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String test = "helloworld ";
        System.out.println(ReplaceSpaceInString.replaceSpace(new StringBuffer(test)));
    }
}
