package leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 题目Id：496
 * 题目：下一个更大元素 I
 *
 * @author yangyi
 */
public class NextGreaterElementI {
    public static void main(String[] args) {
        Solution solution = new NextGreaterElementI().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            Map<Integer, Integer> map = new HashMap<>();
            int[] res = new int[nums1.length];
            LinkedList<Integer> stack = new LinkedList<>();
            for (int i = 0; i < nums2.length; i++) {
                while (!stack.isEmpty() && nums2[stack.peekLast()] < nums2[i]) {
                    int t = stack.removeLast();
                    map.put(nums2[t], nums2[i]);
                }
                stack.addLast(i);
            }
            for (int i = 0; i < nums1.length; i++) {
                res[i] = map.getOrDefault(nums1[i], -1);
            }

            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 