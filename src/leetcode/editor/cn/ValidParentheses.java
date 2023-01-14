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
            map.put('{', '}');
            map.put('[', ']');
            map.put('(', ')');
            for (int i = 0; i < s.length(); i++) {
                if (isLeft(s.charAt(i))) {
                    stack.addLast(s.charAt(i));
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    Character c = stack.removeLast();
                    if (map.get(c) != s.charAt(i)) {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }

        public boolean isLeft(char c) {
            if (c == '(' || c == '{' || c == '[') {
                return true;
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 