package leetcode.editor.cn;

/**
 * 题目Id：1768
 * 题目：交替合并字符串
 *
 * @author yangyi
 */
public class MergeStringsAlternately {
    public static void main(String[] args) {
        Solution solution = new MergeStringsAlternately().new Solution();
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int i = 0,j = 0;
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                str.append(word1.charAt(i++));
            }
            if (j < word2.length()) {
                str.append(word2.charAt(j++));
            }
        }
        return str.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

} 