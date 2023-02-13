package leetcode.editor.cn;

/**
 * 题目Id：377
 * 题目：组合总和 Ⅳ
 *
 * @author yangyi
 */
public class CombinationSumIv {
    public static void main(String[] args) {
        Solution solution = new CombinationSumIv().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int combinationSum4(int[] nums, int target) {
            int n = nums.length;
            int[][] dp = new int[n + 1][target + 1];
            for (int i = 0; i < dp.length; i++) {
                dp[i][0] = 1;
            }
            for (int i = 1; i < dp.length; i++) {
                for (int j = 1; j < dp[0].length; j++) {
                    if (j >= nums[i - 1]) {
                        dp[i][j] = dp[i][j - nums[i - 1]] + dp[i - 1][j];
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }
            return dp[n][target];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 