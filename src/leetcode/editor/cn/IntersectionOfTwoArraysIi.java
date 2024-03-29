package leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 题目Id：350
 * 题目：两个数组的交集 II
 *
 * @author yangyi
 */
public class IntersectionOfTwoArraysIi {
    public static void main(String[] args) {
        Solution solution = new IntersectionOfTwoArraysIi().new Solution();
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
        class Solution {
            public int[] intersect(int[] nums1, int[] nums2) {
                if (nums1.length > nums2.length) {
                    return intersect(nums2, nums1);
                }
                Map<Integer, Integer> map = new HashMap<Integer, Integer>();
                for (int num : nums1) {
                    int count = map.getOrDefault(num, 0) + 1;
                    map.put(num, count);
                }
                int[] intersection = new int[nums1.length];
                int index = 0;
                for (int num : nums2) {
                    int count = map.getOrDefault(num, 0);
                    if (count > 0) {
                        intersection[index++] = num;
                        count--;
                        if (count > 0) {
                            map.put(num, count);
                        } else {
                            map.remove(num);
                        }
                    }
                }
                return Arrays.copyOfRange(intersection, 0, index);

            }
        }

//leetcode submit region end(Prohibit modification and deletion)

} 