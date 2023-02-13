package leetcode.editor.cn;

/**
 * 题目Id：474
 * 题目：一和零
 *
 * @author yangyi
 */
public class OnesAndZeroes {
    public static void main(String[] args) {
        Solution solution = new OnesAndZeroes().new Solution();
        solution.findMaxForm(new String[]{"10", "0", "1"}, 1, 1);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findMaxForm(String[] strs, int m, int n) {
            int[][][] dp = new int[strs.length + 1][m + 1][n + 1];
            for (int i = 1; i < dp.length; i++) {
                int[] nums = getNums(strs[i - 1]);
                for (int j = 0; j < dp[0].length; j++) {
                    for (int k = 0; k < dp[0][0].length; k++) {
                        if (j >= nums[0] && k >= nums[1]) {
                            dp[i][j][k] = Math.max(dp[i - 1][j][k], dp[i - 1][j - nums[0]][k - nums[1]] + 1);
                        } else {
                            dp[i][j][k] = dp[i - 1][j][k];
                        }
                    }
                }
            }
            return dp[strs.length][m][n];
        }

        public int[] getNums(String strs) {
            int n0 = 0, n1 = 0;
            for (int i = 0; i < strs.length(); i++) {
                if (strs.charAt(i) == '0') {
                    n0++;
                } else {
                    n1++;
                }
            }
            return new int[]{n0, n1};
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 