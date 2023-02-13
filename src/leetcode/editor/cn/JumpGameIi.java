package leetcode.editor.cn;

import java.util.Arrays;

/**
 * 题目Id：45
 * 题目：跳跃游戏 II
 *
 * @author yangyi
 */
public class JumpGameIi {
    public static void main(String[] args) {
        Solution solution = new JumpGameIi().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int jump(int[] nums) {
            int[] res = new int[nums.length];
            Arrays.fill(res, Integer.MAX_VALUE);
            res[0] = 0;
            for (int i = 0; i < nums.length; i++) {
                if (res[i] == Integer.MAX_VALUE) {
                    return -1;
                }
                for (int j = i; j <= nums[i] + i && j < nums.length; j++) {
                    res[j] = Math.min(res[j], res[i] + 1);
                }
            }
            return res[nums.length - 1];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 