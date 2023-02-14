package leetcode.editor.cn;

/**
 * 题目Id：647
 * 题目：回文子串
 *
 * @author yangyi
 */
public class PalindromicSubstrings {
    public static void main(String[] args) {
        Solution solution = new PalindromicSubstrings().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    class Solution {
        public int countSubstrings(String s) {
            int len, ans = 0;
            if (s == null || (len = s.length()) < 1) return 0;
            //总共有2 * len - 1个中心点
            for (int i = 0; i < 2 * len - 1; i++) {
                //通过遍历每个回文中心，向两边扩散，并判断是否回文字串
                //有两种情况，left == right，right = left + 1，这两种回文中心是不一样的
                int left = i / 2, right = left + i % 2;
                while (left >= 0 && right < len && s.charAt(left) == s.charAt(right)) {
                    //如果当前是一个回文串，则记录数量
                    ans++;
                    left--;
                    right++;
                }
            }
            return ans;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

} 