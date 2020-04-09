package interview;

import java.util.Arrays;

public class LengthOfLIS {
    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;
        for (int num : nums) {
            int i = Arrays.binarySearch(dp, 0, len, num);
            if (i < 0) {
                i = -i - 1;
            }
            dp[i] = num;
            if (i == len) {
                len++;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] test = {0, 8, 4, 12, 2};
        System.out.println(lengthOfLIS(test));
    }
}
