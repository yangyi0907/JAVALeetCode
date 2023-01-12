package leetcode.editor.cn;

/**
 * 题目Id：383
 * 题目：赎金信
 *
 * @author yangyi
 */
public class RansomNote {
    public static void main(String[] args) {
        Solution solution = new RansomNote().new Solution();
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] records = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            records[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            records[ransomNote.charAt(i) - 'a']--;
        }
        for (int i = 0; i < records.length; i++) {
            if (records[i] < 0) {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

} 