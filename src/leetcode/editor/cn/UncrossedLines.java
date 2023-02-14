package leetcode.editor.cn;

/**
 * 题目Id：1035
 * 题目：不相交的线
 *
 * @author yangyi
 */
public class UncrossedLines {
    public static void main(String[] args) {
        Solution solution = new UncrossedLines().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxUncrossedLines(int[] nums1, int[] nums2) {
            int[][] dp = new int[nums1.length + 1][nums2.length + 1];
            for (int i = 1; i < dp.length; i++) {
                for (int j = 1; j < dp[0].length; j++) {
                    if (nums1[i - 1] == nums2[j - 1]) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
            }
            return dp[nums1.length][nums2.length];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 