package leetcode.editor.cn;

/**
 * 题目Id：844
 * 题目：比较含退格的字符串
 *
 * @author yangyi
 */
public class BackspaceStringCompare {
    public static void main(String[] args) {
        Solution solution = new BackspaceStringCompare().new Solution();
        System.out.println(solution.backspaceCompare("ab#c", "ad#c"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean backspaceCompare(String s, String t) {
            char[] cs = s.toCharArray();
            char[] ct = t.toCharArray();
            int sl = -1;
            for (int i = 0; i < cs.length; i++) {
                if (cs[i] == '#') {
                    if (sl >= 0) {
                        sl--;
                    }
                } else {
                    sl++;
                    cs[sl] = cs[i];
                }
            }
            int tl = -1;
            for (int i = 0; i < ct.length; i++) {
                if (ct[i] == '#') {
                    if (tl >= 0) {
                        tl--;
                    }
                } else {
                    tl++;
                    ct[tl] = ct[i];
                }
            }
            if (sl != tl) {
                return false;
            }
            for (int i = 0; i < sl + 1; i++) {
                if (cs[i] != ct[i]) {
                    return false;
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 