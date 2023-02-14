package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 题目Id：139
 * 题目：单词拆分
 *
 * @author yangyi
 */
public class WordBreak {
    public static void main(String[] args) {
        Solution solution = new WordBreak().new Solution();
        ArrayList<String> list = new ArrayList<>();
        list.add("leet");
        list.add("code");
        solution.wordBreak("leetcode",list);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean wordBreak(String s, List<String> wordDict) {
            HashSet<String> set = new HashSet<>(wordDict);
            boolean[] valid = new boolean[s.length() + 1];
            valid[0] = true;

            for (int i = 1; i <= s.length(); i++) {
                for (int j = 0; j < i && !valid[i]; j++) {
                    if (set.contains(s.substring(j, i)) && valid[j]) {
                        valid[i] = true;
                    }
                }
            }

            return valid[s.length()];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 