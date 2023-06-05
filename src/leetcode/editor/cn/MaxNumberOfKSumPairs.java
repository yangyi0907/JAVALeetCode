package leetcode.editor.cn;

import java.util.Arrays;

/**
 * 题目Id：1679
 * 题目：K 和数对的最大数目
 *
 * @author yangyi
 */
public class MaxNumberOfKSumPairs {
    public static void main(String[] args) {
        Solution solution = new MaxNumberOfKSumPairs().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxOperations(int[] nums, int k) {
            Arrays.sort(nums);
            int i = 0, j = nums.length - 1;
            int n = 0;
            while (i < j) {
                int sum = nums[i] + nums[j];
                if (sum > k) {
                    j--;
                } else if (sum < k) {
                    i++;
                } else {
                    n++;
                    i++;
                    j--;
                }
            }
            return n;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 