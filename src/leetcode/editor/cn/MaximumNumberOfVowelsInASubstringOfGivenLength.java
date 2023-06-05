package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 题目Id：1456
 * 题目：定长子串中元音的最大数目
 *
 * @author yangyi
 */
public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public static void main(String[] args) {
        Solution solution = new MaximumNumberOfVowelsInASubstringOfGivenLength().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxVowels(String s, int k) {
            List<Character> list = Arrays.asList('a', 'e', 'i', 'o', 'u');
            int n = 0;
            int max = 0;
            char[] chars = s.toCharArray();
            for (int i = 0; i < k; i++) {
                if (list.contains(chars[i])) {
                    n++;
                }
            }
            max = Math.max(max, n);
            for (int i = k; i < chars.length; i++) {
                if (list.contains(chars[i])) {
                    n++;
                }
                if (list.contains(chars[i - k])) {
                    n--;
                }
                max = Math.max(max, n);
            }
            return max;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 