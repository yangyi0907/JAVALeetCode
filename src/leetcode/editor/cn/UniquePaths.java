package leetcode.editor.cn;

/**
 * 题目Id：62
 * 题目：不同路径
 *
 * @author yangyi
 */
public class UniquePaths {
    public static void main(String[] args) {
        Solution solution = new UniquePaths().new Solution();
        solution.uniquePaths(3, 7);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int uniquePaths(int m, int n) {
            int[][] dp = new int[m + 1][n + 1];
            for (int i = 0; i <= m; i++) {
                dp[i][0] = 0;
            }
            for (int i = 0; i <= n; i++) {
                dp[0][i] = 0;
            }
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == 1 && j == 1) {
                        dp[i][j] = 1;
                        continue;
                    }
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
            return dp[m][n];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 