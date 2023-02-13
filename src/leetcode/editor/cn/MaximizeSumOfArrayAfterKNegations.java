package leetcode.editor.cn;

import java.util.Arrays;

/**
 * 题目Id：1005
 * 题目：K 次取反后最大化的数组和
 *
 * @author yangyi
 */
public class MaximizeSumOfArrayAfterKNegations {
    public static void main(String[] args) {
        Solution solution = new MaximizeSumOfArrayAfterKNegations().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int largestSumAfterKNegations(int[] A, int k) {
            if (A.length == 1) return k % 2 == 0 ? A[0] : -A[0];
            Arrays.sort(A);
            int sum = 0;
            int idx = 0;
            for (int i = 0; i < k; i++) {
                if (i < A.length - 1 && A[idx] < 0) {
                    A[idx] = -A[idx];
                    if (A[idx] >= Math.abs(A[idx + 1])) idx++;
                    continue;
                }
                A[idx] = -A[idx];
            }

            for (int i = 0; i < A.length; i++) {
                sum += A[i];
            }
            return sum;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 