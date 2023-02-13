package leetcode.editor.cn;

import java.awt.color.CMMException;
import java.util.List;
import java.util.Objects;

/**
 * 题目Id：55
 * 题目：跳跃游戏
 *
 * @author yangyi
 */
public class JumpGame {
    public static void main(String[] args) {
        Solution solution = new JumpGame().new Solution();
        solution.canJump(new int[]{2, 3, 1, 1, 4});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean canJump(int[] nums) {
            int cover = 0;
            for (int i = 0; i <= cover; i++) {
                 cover = Math.max(nums[i] + i, cover) ;
                 if (cover >= nums.length - 1) {
                     return true;
                 }
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 