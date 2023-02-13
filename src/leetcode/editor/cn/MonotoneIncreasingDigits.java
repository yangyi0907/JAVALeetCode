package leetcode.editor.cn;

/**
 * 题目Id：738
 * 题目：单调递增的数字
 *
 * @author yangyi
 */
public class MonotoneIncreasingDigits {
    public static void main(String[] args) {
        Solution solution = new MonotoneIncreasingDigits().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int monotoneIncreasingDigits(int n) {
            String s = String.valueOf(n);
            char[] chars = s.toCharArray();
            int start = s.length();
            for (int i = s.length() - 2; i >= 0; i--) {
                if (chars[i] > chars[i + 1]) {
                    chars[i]--;
                    start = i + 1;
                }
            }
            for (int i = start; i < s.length(); i++) {
                chars[i] = '9';
            }
            return Integer.parseInt(String.valueOf(chars));
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 