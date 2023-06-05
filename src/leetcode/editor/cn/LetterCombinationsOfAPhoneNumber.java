package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 题目Id：17
 * 题目：电话号码的字母组合
 *
 * @author yangyi
 */
public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        Solution solution = new LetterCombinationsOfAPhoneNumber().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<String> res = new ArrayList<>();
        Map<Character, String> map = new HashMap<>();

        public List<String> letterCombinations(String digits) {
            if (digits.length() == 0) {
                return res;
            }
            map.put('2', "abc");
            map.put('3', "def");
            map.put('4', "ghi");
            map.put('5', "jkl");
            map.put('6', "mno");
            map.put('7', "pqrs");
            map.put('8', "tuv");
            map.put('9', "wxyz");
            back(digits, 0, new StringBuilder());
            return res;
        }

        public void back(String digits, int start, StringBuilder str) {
            if (digits.length() == start) {
                res.add(str.toString());
                return;
            }
            char c = digits.charAt(start);
            String s = map.get(c);
            for (int i = 0; i < s.length(); i++) {
                str.append(s.charAt(i));
                back(digits,start + 1,str);
                str.deleteCharAt(str.length() - 1);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 