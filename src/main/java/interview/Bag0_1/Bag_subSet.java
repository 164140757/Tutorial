package interview.Bag0_1;

/**
 * Given a non-empty array containing only positive integers,
 * find if the array can be partitioned into two subsets such that
 * the sum of elements in both subsets is equal.
 * <p>
 * Note:
 * <p>
 * Each of the array element will not exceed 100.
 * The array size will not exceed 200.
 */
public class Bag_subSet {
    public static boolean canPartition(int[] nums) {
        int sum = getSum(nums);
        if (sum % 2 != 0) {
            return false;
        }
        int W = sum / 2;
        boolean[] dp = new boolean[W+1];
        dp[0] = true;
        for (int num : nums) {
            for (int i = W; i >= 1;i --){
                if(i>=num){
                    dp[i] = dp[i] || dp[i-num];
                }
            }
        }
        return dp[W];
    }

    private static int getSum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
       int[]test = {1, 2, 3, 2};
        System.out.println(Bag_subSet.canPartition(test));
    }
}
