package leetcode.editor.cn;

import java.util.LinkedList;

/**
 * 题目Id：1047
 * 题目：删除字符串中的所有相邻重复项
 *
 * @author yangyi
 */
public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        Solution solution = new RemoveAllAdjacentDuplicatesInString().new Solution();
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String removeDuplicates(String s) {
        LinkedList<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if(!stack.isEmpty() && stack.peekLast().equals(c)){
                stack.removeLast();
            }else {
                stack.addLast(c);
            }
        }
        StringBuilder str = new StringBuilder();
        while (!stack.isEmpty()) {
            str.append(stack.removeFirst());
        }
        return str.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

} 