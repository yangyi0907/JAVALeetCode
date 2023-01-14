package leetcode.editor.cn;

/**
 * 题目Id：344
 * 题目：反转字符串
 *
 * @author yangyi
 */
public class ReverseString {
    public static void main(String[] args) {
        Solution solution = new ReverseString().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void reverseString(char[] s) {
            int i = 0, j = s.length - 1;
            char temp;
            while (i < j) {
                temp = s[j];
                s[j] = s[i];
                s[i] = temp;
                i++;
                j--;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 