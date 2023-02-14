package leetcode.editor.cn;

import java.sql.DriverPropertyInfo;
import java.util.Arrays;

/**
 * 题目Id：674
 * 题目：最长连续递增序列
 *
 * @author yangyi
 */
public class LongestContinuousIncreasingSubsequence {
    public static void main(String[] args) {
        Solution solution = new LongestContinuousIncreasingSubsequence().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findLengthOfLCIS(int[] nums) {
            int[] dp = new int[nums.length];
            int res = 1;
            Arrays.fill(dp, 1);
            for (int i = 1; i < dp.length; i++) {
                if (nums[i] > nums[i - 1]) {
                    dp[i] = dp[i - 1] + 1;
                    res = Math.max(res, dp[i]);
                } else {
                    dp[i] = 1;
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 