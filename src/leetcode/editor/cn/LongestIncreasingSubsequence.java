package leetcode.editor.cn;

import java.util.Arrays;

/**
 * 题目Id：300
 * 题目：最长递增子序列
 *
 * @author yangyi
 */
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Solution solution = new LongestIncreasingSubsequence().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLIS(int[] nums) {
            int[] dp = new int[nums.length];
            int res = 1;
            Arrays.fill(dp, 1);
            for (int i = 1; i < dp.length; i++) {
                for (int j = 0; j < i; j++) {
                    if (nums[i] > nums[j]) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                        res = Math.max(res, dp[i]);
                    }
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 