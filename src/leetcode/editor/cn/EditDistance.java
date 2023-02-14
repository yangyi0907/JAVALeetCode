package leetcode.editor.cn;

/**
 * 题目Id：72
 * 题目：编辑距离
 *
 * @author yangyi
 */
public class EditDistance {
    public static void main(String[] args) {
        Solution solution = new EditDistance().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minDistance(String text1, String text2) {
            int[][] dp = new int[text1.length() + 1][text2.length() + 1];
            for (int i = 0; i <= text1.length(); i++) dp[i][0] = i;
            for (int j = 0; j <= text2.length(); j++) dp[0][j] = j;
            for (int i = 1; i < dp.length; i++) {
                for (int j = 1; j < dp[0].length; j++) {
                    if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1];
                    } else {
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    }
                }
            }
            return dp[text1.length()][text2.length()];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 