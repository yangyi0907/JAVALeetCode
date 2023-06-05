package leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 题目Id：334
 * 题目：递增的三元子序列
 *
 * @author yangyi
 */
public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        Solution solution = new IncreasingTripletSubsequence().new Solution();
        solution.increasingTriplet(new int[]{0, 4, 2, 1, 0, -1, -3});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean increasingTriplet(int[] nums) {
            int n = nums.length;
            int[] lMin = new int[n];
            int[] rMax = new int[n];
            Arrays.fill(lMin, Integer.MAX_VALUE);
            lMin[0] = nums[0];
            Arrays.fill(rMax, Integer.MAX_VALUE);
            rMax[n - 1] = nums[n - 1];
            for (int i = 1; i < n; i++) {
                lMin[i] = Math.min(lMin[i - 1], nums[i]);
            }
            for (int i = n - 2; i >= 0; i--) {
                rMax[i] = Math.max(rMax[i + 1], nums[i]);
            }
            for (int i = 1; i < nums.length - 1; i++) {
                if (nums[i] > lMin[i - 1] && nums[i] < rMax[i + 1]){
                    return true;
                }
            }
            return false;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

} 