package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目Id：22
 * 题目：括号生成
 *
 * @author yangyi
 */
public class GenerateParentheses {
    public static void main(String[] args) {
        Solution solution = new GenerateParentheses().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<String> ans;

        public List<String> generateParenthesis(int n) {
            ans = new ArrayList<>();
            backward(n, 0, 0, new StringBuilder());
            return ans;
        }

        public void backward(int n, int l, int r, StringBuilder str) {
            if (r == n && n == l) {
                ans.add(str.toString());
                return;
            }
            if (l > n || r > n || l < r) {
                return;
            }
            for (int i = 0; i < 2; i++) {
                if (i == 0) {
                    l++;
                    str.append("(");
                    backward(n, l, r, str);
                    l--;
                    str.deleteCharAt(str.length() - 1);
                } else {
                    r++;
                    str.append(")");
                    backward(n, l, r, str);
                    r--;
                    str.deleteCharAt(str.length() - 1);
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 