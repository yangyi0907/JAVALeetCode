package leetcode.editor.cn;

/**
 * 题目Id：718
 * 题目：最长重复子数组
 *
 * @author yangyi
 */
public class MaximumLengthOfRepeatedSubarray {
    public static void main(String[] args) {
        Solution solution = new MaximumLengthOfRepeatedSubarray().new Solution();
        solution.findLength(new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 0, 1, 1});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findLength(int[] nums1, int[] nums2) {
            int[][] dp = new int[nums1.length + 1][nums2.length + 1];
            int res = 0;
            for (int i = 1; i < dp.length; i++) {
                for (int j = 1; j < dp[0].length; j++) {
                    if (nums1[i - 1] == nums2[j - 1]) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                        res = Math.max(res, dp[i][j]);
                    } else {
                        dp[i][j] = 0;
                    }
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 