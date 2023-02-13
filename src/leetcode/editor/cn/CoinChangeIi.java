package leetcode.editor.cn;

/**
 * 题目Id：518
 * 题目：零钱兑换 II
 *
 * @author yangyi
 */
public class CoinChangeIi {
    public static void main(String[] args) {
        Solution solution = new CoinChangeIi().new Solution();
        solution.change(5, new int[]{1, 2, 5});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int change(int amount, int[] coins) {
            int n = coins.length;
            int[][] dp = new int[n + 1][amount + 1];
            for (int i = 0; i < dp.length; i++) {
                dp[i][0] = 1;
            }
            for (int j = 1; j < dp[0].length; j++) {
                for (int i = 1; i < dp.length; i++) {
                    if (j >= coins[i - 1]) {
                        dp[i][j] = dp[i][j - coins[i - 1]] + dp[i - 1][j];
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }
            return dp[n][amount];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 