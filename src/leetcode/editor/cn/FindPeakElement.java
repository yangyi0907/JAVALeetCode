package leetcode.editor.cn;

/**
 * 题目Id：162
 * 题目：寻找峰值
 *
 * @author yangyi
 */
public class FindPeakElement {
    public static void main(String[] args) {
        Solution solution = new FindPeakElement().new Solution();
        solution.findPeakElement(new int[]{1,2});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findPeakElement(int[] nums) {
            int i = 0, j = nums.length - 1;
            while (i < j) {
                int mid = i + (j - i) / 2;
                if ( (mid == 0 || nums[mid] > nums[mid - 1]) && (mid == nums.length - 1 || nums[mid] > nums[mid + 1])){
                    return mid;
                }else if (mid == 0 || nums[mid] > nums[mid - 1]) {
                    i = mid + 1;
                }else {
                    j = mid - 1;
                }
            }
            return i;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 