package leetcode.editor.cn;

import java.util.LinkedList;

/**
 * 题目Id：239
 * 题目：滑动窗口最大值
 *
 * @author yangyi
 */
public class SlidingWindowMaximum {
    public static void main(String[] args) {
        Solution solution = new SlidingWindowMaximum().new Solution();
        solution.maxSlidingWindow(new int[]{1}, 1);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            LinkedList<Integer> stack = new LinkedList<>();
            int[] ans = new int[nums.length - k + 1];
            int index = 0;
            for (int i = 0; i < k - 1; i++) {
                while (!stack.isEmpty() && nums[i] > nums[stack.peekLast()]) {
                    stack.removeLast();
                }
                stack.addLast(i);
            }
            for (int i = k - 1; i < nums.length; i++) {
                if (!stack.isEmpty() && stack.peekFirst() + k <= i) {
                    stack.removeFirst();
                }
                while (!stack.isEmpty() && nums[i] > nums[stack.peekLast()]) {
                    stack.removeLast();
                }
                stack.addLast(i);
                ans[index++] = nums[stack.peekFirst()];
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 