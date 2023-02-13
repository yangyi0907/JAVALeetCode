package leetcode.editor.cn;

/**
 * 题目Id：746
 * 题目：使用最小花费爬楼梯
 *
 * @author yangyi
 */
public class MinCostClimbingStairs {
    public static void main(String[] args) {
        Solution solution = new MinCostClimbingStairs().new Solution();
        solution.minCostClimbingStairs(new int[]{1, 100});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minCostClimbingStairs(int[] cost) {
            int n = cost.length;
            if (n == 1) {
                return 0;
            }
            int[] dp = new int[n + 2];
            dp[1] = 0;
            dp[2] = 0;
            for (int i = 3; i < dp.length; i++) {
                dp[i] = Math.min(dp[i - 1] + cost[i - 2], dp[i - 2] + cost[i - 3]);
            }
            return dp[n + 1];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 