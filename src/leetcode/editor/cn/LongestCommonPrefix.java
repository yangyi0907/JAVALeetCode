package leetcode.editor.cn;

/**
 * 题目Id：14
 * 题目：最长公共前缀
 *
 * @author yangyi
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        Solution solution = new LongestCommonPrefix().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs.length == 0) {
                return "";
            }
            String res = strs[0];
            for (int i = 1; i < strs.length; i++) {
                res = common(res, strs[i]);
            }
            return res;
        }

        public String common(String str1, String str2) {
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < str1.length() && i < str2.length(); i++) {
                if (str1.charAt(i) == str2.charAt(i)) {
                    res.append(str1.charAt(i));
                } else {
                    break;
                }
            }
            return res.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 