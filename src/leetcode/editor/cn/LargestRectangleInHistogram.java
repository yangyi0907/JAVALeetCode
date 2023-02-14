package leetcode.editor.cn;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 题目Id：84
 * 题目：柱状图中最大的矩形
 *
 * @author yangyi
 */
public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        Solution solution = new LargestRectangleInHistogram().new Solution();
        solution.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int largestRectangleArea(int[] heights) {
            int n = heights.length;
            int[] lMin = new int[n];
            Arrays.fill(lMin, n);
            int[] rMin = new int[n];
            Arrays.fill(rMin, -1);
            LinkedList<Integer> stack = new LinkedList<>();
            for (int i = 0; i < heights.length; i++) {
                while (!stack.isEmpty() && heights[stack.peekLast()] > heights[i]) {
                    int t = stack.removeLast();
                    lMin[t] = i;
                }
                stack.addLast(i);
            }
            stack.clear();
            for (int i = heights.length - 1; i >= 0; i--) {
                while (!stack.isEmpty() && heights[stack.peekLast()] > heights[i]) {
                    int t = stack.removeLast();
                    rMin[t] = i;
                }
                stack.addLast(i);
            }
            int res = 0;
            for (int i = 0; i < heights.length; i++) {
                int len = lMin[i] - rMin[i] - 1;
                res = Math.max(res, len * heights[i]);
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 