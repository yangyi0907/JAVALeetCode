package leetcode.editor.cn;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 题目Id：503
 * 题目：下一个更大元素 II
 *
 * @author yangyi
 */
public class NextGreaterElementIi {
    public static void main(String[] args) {
        Solution solution = new NextGreaterElementIi().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] nextGreaterElements(int[] nums) {
            int n = nums.length;
            int[] res = new int[nums.length];
            Arrays.fill(res, -1);
            LinkedList<Integer> stack = new LinkedList<>();
            for (int i = 0; i < nums.length * 2; i++) {
                while (!stack.isEmpty() && nums[stack.peekLast()] < nums[i % n]) {
                    int t = stack.removeLast();
                    res[t] = nums[i % n];
                }
                stack.addLast(i % n);
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 