package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * 题目Id：151
 * 题目：反转字符串中的单词
 *
 * @author yangyi
 */
public class ReverseWordsInAString {
    public static void main(String[] args) {
        Solution solution = new ReverseWordsInAString().new Solution();
        solution.reverseWords("hello world dsf  sd ");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseWords(String s) {
            List<String> list = new ArrayList<>();
            String[] s1 = s.split(" ");
            for (int i = 0; i < s1.length; i++) {
                String t = s1[i].trim();
                if (Objects.equals(t, "")) {
                    continue;
                }
                list.add(t);
            }
            StringBuffer str = new StringBuffer();
            for (int i = list.size() - 1; i >= 0; i--) {
                String s2 = list.get(i);
                str.append(s2).append(" ");
            }
            return str.substring(0,str.length() - 1);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 