package leetcode.editor.cn;

/**
 * 题目Id：643
 * 题目：子数组最大平均数 I
 *
 * @author yangyi
 */
public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        Solution solution = new MaximumAverageSubarrayI().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double findMaxAverage(int[] nums, int k) {
            int sum = 0;
            int n = nums.length;
            for (int i = 0; i < k; i++) {
                sum += nums[i];
            }
            int maxSum = sum;
            for (int i = k; i < n; i++) {
                sum = sum - nums[i - k] + nums[i];
                maxSum = Math.max(maxSum, sum);
            }
            return 1.0 * maxSum / k;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

} 