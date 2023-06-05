package leetcode.editor.cn;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 题目Id：20
 * 题目：有效的括号
 *
 * @author yangyi
 */
public class ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new ValidParentheses().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isValid(String s) {
            LinkedList<Character> stack = new LinkedList<>();
            Map<Character, Character> map = new HashMap<>();
            map.put('(', ')');
            map.put('{', '}');
            map.put('[', ']');
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (isLeft(c)) {
                    stack.addLast(c);
                } else {
                    if (!stack.isEmpty() && map.get(stack.peekLast()) == c) {
                        stack.removeLast();
                    } else {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }

        private boolean isLeft(char c) {
            return c == '(' || c == '{' || c == '[';
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 