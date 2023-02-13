package leetcode.editor.cn;

import java.util.LinkedList;

/**
 * 题目Id：739
 * 题目：每日温度
 *
 * @author yangyi
 */
public class DailyTemperatures {
    public static void main(String[] args) {
        Solution solution = new DailyTemperatures().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] dailyTemperatures(int[] temperatures) {
            int[] res = new int[temperatures.length];
            LinkedList<Integer> stack = new LinkedList<>();
            for (int i = 0; i < temperatures.length; i++) {
                while (!stack.isEmpty() && temperatures[stack.peekLast()] < temperatures[i]) {
                    int t = stack.removeLast();
                    res[t] = i - t;
                }
                stack.addLast(i);
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 