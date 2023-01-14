package leetcode.editor.cn;

import java.util.LinkedList;

/**
 * 题目Id：150
 * 题目：逆波兰表达式求值
 *
 * @author yangyi
 */
public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        Solution solution = new EvaluateReversePolishNotation().new Solution();
        solution.evalRPN(new String[]{"2","1","+","3","*"});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int evalRPN(String[] tokens) {
            LinkedList<String> nums = new LinkedList<>();
            for (int i = 0; i < tokens.length; i++) {
                if (isChars(tokens[i])) {
                    String n2 = nums.removeLast();
                    String n1 = nums.removeLast();
                    String c = tokens[i];
                    String n = sum(n1, n2, c);
                    nums.addLast(n);
                } else {
                    nums.addLast(tokens[i]);
                }
            }
            return Integer.parseInt(nums.removeLast());
        }

        public String sum(String a, String b, String c) {
            int n1 = Integer.parseInt(a);
            int n2 = Integer.parseInt(b);
            int res;
            switch (c) {
                case "+":
                    res = n1 + n2;
                    break;
                case "-":
                    res = n1 - n2;
                    break;
                case "*":
                    res = n1 * n2;
                    break;
                case "/":
                    res = n1 / n2;
                    break;
                default:
                    res = 0;
            }
            return String.valueOf(res);
        }

        public boolean isChars(String s) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                return true;
            } else {
                return false;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 