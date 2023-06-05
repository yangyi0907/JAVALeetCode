package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * 题目Id：345
 * 题目：反转字符串中的元音字母
 *
 * @author yangyi
 */
public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        Solution solution = new ReverseVowelsOfAString().new Solution();
        solution.reverseVowels("hello");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseVowels(String s) {
            char[] chars = s.toCharArray();
            List<Character> list = Arrays.asList('a', 'e', 'i', 'o', 'u','A','E','I','O','U');
            int l = 0, r = s.length() - 1;
            while (l < r) {
                while (l < r && !list.contains(chars[l])) {
                    l++;
                }
                while (l < r && !list.contains(chars[r])) {
                    r--;
                }
                if (l < r) {
                    char t = chars[r];
                    chars[r] = chars[l];
                    chars[l] = t;
                }
                l++;
                r--;
            }
            return new String(chars);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 