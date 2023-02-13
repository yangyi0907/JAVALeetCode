package leetcode.editor.cn;

/**
 * 题目Id：63
 * 题目：不同路径 II
 *
 * @author yangyi
 */
public class UniquePathsIi {
    public static void main(String[] args) {
        Solution solution = new UniquePathsIi().new Solution();
        solution.uniquePathsWithObstacles(new int[][]{{0,0}});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
            public int uniquePathsWithObstacles(int[][] obstacleGrid) {
                int m = obstacleGrid.length;
                int n = obstacleGrid[0].length;
                int[][] dp = new int[m][n];

                //如果在起点或终点出现了障碍，直接返回0
                if (obstacleGrid[m - 1][n - 1] == 1 || obstacleGrid[0][0] == 1) {
                    return 0;
                }

                for (int i = 0; i < m && obstacleGrid[i][0] == 0; i++) {
                    dp[i][0] = 1;
                }
                for (int j = 0; j < n && obstacleGrid[0][j] == 0; j++) {
                    dp[0][j] = 1;
                }

                for (int i = 1; i < m; i++) {
                    for (int j = 1; j < n; j++) {
                        dp[i][j] = (obstacleGrid[i][j] == 0) ? dp[i - 1][j] + dp[i][j - 1] : 0;
                    }
                }
                return dp[m - 1][n - 1];
            }

    }
//leetcode submit region end(Prohibit modification and deletion)

} 