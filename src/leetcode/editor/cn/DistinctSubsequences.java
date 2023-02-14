package leetcode.editor.cn;

/**
 * 题目Id：115
 * 题目：不同的子序列
 *
 * @author yangyi
 */
public class DistinctSubsequences {
    public static void main(String[] args) {
        Solution solution = new DistinctSubsequences().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int numDistinct(String s, String t) {
            int[][] dp = new int[s.length() + 1][t.length() + 1];
            for (int i = 0; i < s.length(); i++) {
                dp[i][0] = 1;
            }
            for (int i = 1; i < dp.length; i++) {
                for (int j = 1; j < dp[0].length; j++) {
                    if (s.charAt(i - 1) == t.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }
            return dp[s.length()][t.length()];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 