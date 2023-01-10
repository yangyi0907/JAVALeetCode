package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目Id：剑指 Offer 29
 * 题目：顺时针打印矩阵
 *
 * @author yangyi
 */
public class ShunShiZhenDaYinJuZhenLcof {
    public static void main(String[] args) {
        Solution solution = new ShunShiZhenDaYinJuZhenLcof().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] spiralOrder(int[][] matrix) {
            int m = matrix.length, n = matrix[0].length;
            if (m == 0 || n == 0){
                return new int[0];
            }
            int[] ans = new int[n * m];
            int index = 0;
            int a = 0, b = n - 1, c = m - 1, d = 0;
            while (true) {
                for (int j = d; j <= b; j++) {
                    ans[index++] = matrix[a][j];
                }
                a++;
                if (index == m * n) {
                    break;
                }
                for (int i = a; i <= c; i++) {
                    ans[index++] = matrix[i][b];
                }
                b--;
                if (index == m * n) {
                    break;
                }
                for (int j = b; j >= d; j--) {
                    ans[index++] = matrix[c][j];
                }
                c--;
                if (index == m * n) {
                    break;
                }
                for (int i = c; i >= a; i--) {
                    ans[index++] = matrix[i][d];
                }
                d++;
                if (index == m * n) {
                    break;
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 