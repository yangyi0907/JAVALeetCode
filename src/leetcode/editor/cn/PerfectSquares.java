package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 题目Id：279
 * 题目：完全平方数
 *
 * @author yangyi
 */
public class PerfectSquares {
    public static void main(String[] args) {
        Solution solution = new PerfectSquares().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int numSquares(int n) {
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                int t = i * i;
                if (t > n) {
                    break;
                }
                list.add(t);
            }
            int[][] dp = new int[list.size() + 1][n + 1];
            for (int i = 0; i < dp.length; i++) {
                Arrays.fill(dp[i], Integer.MAX_VALUE);
                dp[i][0] = 0;
            }
            for (int i = 1; i < dp.length; i++) {
                for (int j = 1; j < dp[0].length; j++) {
                    int m = list.get(i - 1);
                    if (j >= m) {
                        dp[i][j] = Math.min(dp[i][j - m] + 1, dp[i - 1][j]);
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }
            return dp[list.size()][n];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 