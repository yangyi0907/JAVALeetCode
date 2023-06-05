package leetcode.editor.cn;

/**
 * 题目Id：剑指 Offer 47
 * 题目：礼物的最大价值
 *
 * @author yangyi
 */
public class LiWuDeZuiDaJieZhiLcof {
    public static void main(String[] args) {
        Solution solution = new LiWuDeZuiDaJieZhiLcof().new Solution();
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxValue(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                dp[i][j] = Math.max(dp[i - 1][j],dp[i][j - 1]) + grid[i - 1][j - 1];
            }
        }
        return dp[n][m];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

} 