package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * 题目Id：1
 * 题目：两数之和
 *
 * @author yangyi
 */
public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new TwoSum().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int n = target - nums[i];
                if (map.containsKey(n)) {
                    return new int[]{map.get(n), i};
                }
                map.put(nums[i], i);
            }
            return new int[]{-1, -1};
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 