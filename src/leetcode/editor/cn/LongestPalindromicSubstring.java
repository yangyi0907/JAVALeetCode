package leetcode.editor.cn;

/**
 * 题目Id：5
 * 题目：最长回文子串
 *
 * @author yangyi
 */
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Solution solution = new LongestPalindromicSubstring().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestPalindrome(String s) {
            String res = new String();
            for (int i = 0; i < s.length(); i++) {
                String r1 = func(s, i, i);
                String r2 = func(s, i, i + 1);
                if (r1.length() > res.length()) {
                    res = r1;
                }
                if (r2.length() > res.length()) {
                    res = r2;
                }
            }
            return res;
        }

        public String func(String s, int l, int r) {
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            }
            return s.substring(l + 1, r);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 