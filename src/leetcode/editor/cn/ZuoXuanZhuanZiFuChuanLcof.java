package leetcode.editor.cn;

import java.security.Key;

/**
 * 题目Id：剑指 Offer 58 - II
 * 题目：左旋转字符串
 *
 * @author yangyi
 */
public class ZuoXuanZhuanZiFuChuanLcof {
    public static void main(String[] args) {
        Solution solution = new ZuoXuanZhuanZiFuChuanLcof().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseLeftWords(String s, int n) {
            char[] c = s.toCharArray();
            reverse(c, 0, n - 1);
            reverse(c, n, s.length() - 1);
            reverse(c, 0, s.length() - 1);
            return String.valueOf(c);
        }

        public char[] reverse(char[] c, int i, int j) {
            char temp;
            while (i < j) {
                temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;
            }
            return c;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

} 