package leetcode.editor.cn;

/**
 * 题目Id：443
 * 题目：压缩字符串
 *
 * @author yangyi
 */
public class StringCompression {
    public static void main(String[] args) {
        Solution solution = new StringCompression().new Solution();
        solution.compress(new char[] {'a','b','b','b','b','b','b','b','b','b','b','b',});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int compress(char[] cs) {
            int n = cs.length;
            int i = 0, j = 0;
            while (i < n) {
                int idx = i;
                while (idx < n && cs[idx] == cs[i]) idx++;
                int cnt = idx - i;
                cs[j++] = cs[i];
                if (cnt > 1) {
                    int start = j, end = start;
                    while (cnt != 0) {
                        cs[end++] = (char)((cnt % 10) + '0');
                        cnt /= 10;
                    }
                    reverse(cs, start, end - 1);
                    j = end;
                }
                i = idx;
            }
            return j;
        }
        void reverse(char[] cs, int start, int end) {
            while (start < end) {
                char t = cs[start];
                cs[start] = cs[end];
                cs[end] = t;
                start++; end--;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 