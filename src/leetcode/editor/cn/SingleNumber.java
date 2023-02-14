package leetcode.editor.cn;

/**
 * 题目Id：136
 * 题目：只出现一次的数字
 *
 * @author yangyi
 */
public class SingleNumber {
    public static void main(String[] args) {
        Solution solution = new SingleNumber().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int singleNumber(int[] nums) {
            int res = 0;
            for (int i = 0; i < nums.length; i++) {
                res ^= nums[i];
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 