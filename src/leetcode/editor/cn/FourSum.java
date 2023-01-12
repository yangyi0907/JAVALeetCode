package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 题目Id：18
 * 题目：四数之和
 *
 * @author yangyi
 */
public class FourSum {
    public static void main(String[] args) {
        Solution solution = new FourSum().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> ans = new ArrayList<>();
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 1; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                for (int j = i + 1; j < nums.length; j++) {
                    if (j - 1 != i && nums[j] == nums[j - 1]) {
                        continue;
                    }
                    int left = j + 1, right = nums.length - 1;
                    while (left < right) {
                        long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];
                        if (sum > target) {
                            right--;
                        } else if (sum < target) {
                            left++;
                        } else {
                            ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                            while (left < right && nums[left] == nums[left + 1]) {
                                left++;
                            }
                            while (left < right && nums[right] == nums[right - 1]) {
                                right--;
                            }
                            left++;
                            right--;
                        }
                    }

                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 