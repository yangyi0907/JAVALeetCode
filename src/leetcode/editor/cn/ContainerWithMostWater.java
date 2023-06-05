package leetcode.editor.cn;

/**
 * 题目Id：11
 * 题目：盛最多水的容器
 *
 * @author yangyi
 */
public class ContainerWithMostWater {
    public static void main(String[] args) {
        Solution solution = new ContainerWithMostWater().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxArea(int[] height) {
            int res = 0;
            int i = 0, j = height.length - 1;
            while (i < j) {
                res = Math.max(res, (j - i) * Math.min(height[i], height[j]));
                if (height[i] < height[j]) {
                    i++;
                } else {
                    j--;
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 