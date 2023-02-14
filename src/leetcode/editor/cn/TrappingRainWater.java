package leetcode.editor.cn;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 题目Id：42
 * 题目：接雨水
 *
 * @author yangyi
 */
public class TrappingRainWater {
    public static void main(String[] args) {
        Solution solution = new TrappingRainWater().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int trap(int[] height) {
            int n = height.length;
            int[] l = new int[n];
            int[] r = new int[n];
            l[0] = height[0];
            for (int i = 1; i < n; i++) {
                l[i] = Math.max(l[i - 1], height[i]);
            }
            r[n - 1] = height[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                r[i] = Math.max(r[i + 1], height[i]);
            }
            int res = 0;
            for (int i = 0; i < height.length; i++) {
                int count = Math.min(l[i], r[i]) - height[i];
                res += count;
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 