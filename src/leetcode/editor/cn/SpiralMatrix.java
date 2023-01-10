package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目Id：54
 * 题目：螺旋矩阵
 *
 * @author yangyi
 */
public class SpiralMatrix {
    public static void main(String[] args) {
        Solution solution = new SpiralMatrix().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> ans = new ArrayList<>();
            int m = matrix.length, n = matrix[0].length;
            int a = 0, b = n - 1, c = m - 1, d = 0;
            while (true) {
                for (int j = d; j <= b; j++) {
                    ans.add(matrix[a][j]);
                }
                a++;
                if (ans.size() == m * n){
                    break;
                }
                for (int i = a; i <= c; i++) {
                    ans.add(matrix[i][b]);
                }
                b--;
                if (ans.size() == m * n){
                    break;
                }
                for (int j = b; j >= d; j--) {
                    ans.add(matrix[c][j]);
                }
                c--;
                if (ans.size() == m * n){
                    break;
                }
                for (int i = c; i >= a; i--) {
                    ans.add(matrix[i][d]);
                }
                d++;
                if (ans.size() == m * n){
                    break;
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 