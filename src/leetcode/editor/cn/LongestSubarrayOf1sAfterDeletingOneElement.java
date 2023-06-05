package leetcode.editor.cn;

/**
 * 题目Id：1493
 * 题目：删掉一个元素以后全为 1 的最长子数组
 *
 * @author yangyi
 */
public class LongestSubarrayOf1sAfterDeletingOneElement {
    public static void main(String[] args) {
        Solution solution = new LongestSubarrayOf1sAfterDeletingOneElement().new Solution();
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestSubarray(int[] nums) {
        int res = 0;
        int zeroN = 0;
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[j] == 0) {
                zeroN++;
            }
            while (zeroN > 1) {
                if (nums[i] == 0) {
                    zeroN--;
                }
                i++;
            }
            res = Math.max(res,j - i + 1);
            j++;
        }
        return res - 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

} 