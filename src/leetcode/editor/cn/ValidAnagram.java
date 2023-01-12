package leetcode.editor.cn;

/**
 * 题目Id：242
 * 题目：有效的字母异位词
 *
 * @author yangyi
 */
public class ValidAnagram {
    public static void main(String[] args) {
        Solution solution = new ValidAnagram().new Solution();
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] records = new int[26];
        for (int i = 0; i < s.length(); i++) {
            records[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            records[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < records.length; i++) {
            if (records[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

} 