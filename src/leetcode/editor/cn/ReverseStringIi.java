package leetcode.editor.cn;

import java.util.Arrays;

/**
 * 题目Id：541
 * 题目：反转字符串 II
 *
 * @author yangyi
 */
public class ReverseStringIi {
    public static void main(String[] args) {
        Solution solution = new ReverseStringIi().new Solution();
        solution.reverseStr("abcdefg", 2);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseStr(String s, int k) {
            StringBuffer ans = new StringBuffer();
            int i = 0;
            while (i + 2 * k < s.length()) {
                ans.append(helper(s.substring(i, i + k)));
                ans.append(s, i + k, i + 2 * k);
                i += 2 * k;
            }
            if (i + k > s.length()) {
                ans.append(helper(s.substring(i)));
                return ans.toString();
            }
            ans.append(helper(s.substring(i, i + k)));
            ans.append(s.substring(i + k));
            return ans.toString();
        }

        public String helper(String s) {
            StringBuilder ans = new StringBuilder();
            for (int i = s.length() - 1; i >= 0; i--) {
                ans.append(s.charAt(i));
            }
            return ans.toString();
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

} 