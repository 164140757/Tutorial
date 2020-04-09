package interview.Bag0_1;

public class Bag0_1 {
    // W 为背包总体积
    // N 为物品数量
    // weights 数组存储 N 个物品的重量
    // values 数组存储 N 个物品的价值
    public static int knapsack(int W, int N, int[] weights, int[] values) {
        int[] dp = new int[W+1];
        for (int i = 1; i < N + 1; i++) {
            int weight = weights[i-1];
            int value = values[i-1];
            for (int j = W; j > 0; j--) {
                if (j >= weight) {
                    dp[j] = Math.max(dp[j], dp[j - weight] + value);
                }
            }
        }
        return dp[W];
    }

    public static void main(String[] args) {
        int[] weights = {2,3,1,4};
        int[] values = {1,2,5,2};
        int W = 8;
        int N = 4;
        System.out.println(knapsack(8,4,weights,values));
    }
}
