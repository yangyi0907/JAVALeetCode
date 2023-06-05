package leetcode.editor.cn;

/**
 * 题目Id：1004
 * 题目：最大连续1的个数 III
 *
 * @author yangyi
 */
public class MaxConsecutiveOnesIii {
    public static void main(String[] args) {
        Solution solution = new MaxConsecutiveOnesIii().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int longestOnes(int[] nums, int k) {
            int res = 0;
            int zeroN = 0;
            int i = 0, j = 0;
            while (j < nums.length) {
                if (nums[j] == 0) {
                    zeroN++;
                }
                while (zeroN > k) {
                    if (nums[i] == 0) {
                        zeroN--;
                    }
                    i++;
                }
                res = Math.max(res,j - i + 1);
                j++;
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 