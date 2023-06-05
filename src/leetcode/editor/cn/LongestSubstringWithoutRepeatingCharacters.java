package leetcode.editor.cn;

/**
 * 题目Id：3
 * 题目：无重复字符的最长子串
 *
 * @author yangyi
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Solution solution = new LongestSubstringWithoutRepeatingCharacters().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int res = 0;
            int[] nums = new int[128];
            int l = 0;
            for (int i = 0; i < s.length(); i++) {
                int c = s.charAt(i);
                nums[c]++;
                while (nums[c] > 1) {
                    nums[s.charAt(l)]--;
                    l++;
                }
                res = Math.max(res,i - l + 1);
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 