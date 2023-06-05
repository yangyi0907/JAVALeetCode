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
            int size = nums.length;
            Map<Integer, Integer> map = new HashMap<>(size);
            for (int i = 0; i < size; i++) {
                if (map.containsKey(target - nums[i])) {
                    return new int[]{i, map.get(target - nums[i])};
                } else {
                    map.put(nums[i], i);
                }
            }
            return new int[]{0, 0};
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 