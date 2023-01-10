package leetcode.editor.cn;

/**
 * 题目Id：59
 * 题目：螺旋矩阵 II
 *
 * @author yangyi
 */
public class SpiralMatrixIi {
    public static void main(String[] args) {
        Solution solution = new SpiralMatrixIi().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[][] generateMatrix(int n) {
            int[][] matrix = new int[n][n];
            int a = 0, b = n - 1, c = n - 1, d = 0;
            int k = 1;
            n *= n;
            while (k <= n) {
                for (int j = d; j <= b; j++) {
                    matrix[a][j] = k++;
                }
                a++;
                for (int i = a; i <= c; i++) {
                    matrix[i][b] = k++;
                }
                b--;
                for (int j = b; j >= d; j--) {
                    matrix[c][j] = k++;
                }
                c--;
                for (int i = c; i >= a; i--) {
                    matrix[i][d] = k++;
                }
                d++;
            }
            return matrix;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 