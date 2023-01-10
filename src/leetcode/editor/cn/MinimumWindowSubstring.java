package leetcode.editor.cn;


/**
 * 题目Id：76
 * 题目：最小覆盖子串
 *
 * @author yangyi
 */
public class MinimumWindowSubstring {
    public static void main(String[] args) {
        Solution solution = new MinimumWindowSubstring().new Solution();
        solution.minWindow("bba", "ab");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /*public String minWindow(String s, String t) {
            if (s.length() < t.length()) {
                return "";
            }
            int[] nums = new int[128];
            int[] flag = new int[128];
            int count = t.length();
            for (int i = 0; i < t.length(); i++) {
                nums[t.charAt(i)]++;
                flag[t.charAt(i)]++;
            }
            int start = 0;
            int res = -1;
            int min = Integer.MAX_VALUE;
            //bba ab
            for (int i = 0; i < s.length(); i++) {
                if (flag[s.charAt(i)] > 0) {
                    count--;
                    nums[s.charAt(i)]--;
                }
                while (count == 0) {
                    if (i - start + 1 < min) {
                        min = i - start + 1;
                        res = i;
                    }
                    if (flag[s.charAt(start)] > 0) {
                        count++;
                        nums[s.charAt(start)]++;
                    }
                    start++;
                }
            }
            if (res == -1){
                return "";
            }
            return s.substring(res + 1 - min, res + 1);
        }*/
        public String minWindow(String s, String t) {
            int[] need = new int[128];
            for (int i = 0; i < t.length(); i++) {
                need[t.charAt(i)]++;
            }
            int count = t.length();
            int l = 0;
            int start = 0;
            int size = Integer.MAX_VALUE;
            for (int i = 0; i < s.length(); i++) {
                if (need[s.charAt(i)] > 0) {
                    count--;
                }
                need[s.charAt(i)]--;
                if (count == 0) {
                    while (l < i && need[s.charAt(l)] < 0) {
                        need[s.charAt(l)]++;
                        l++;
                    }
                    if (size > i - l + 1) {
                        size = i - l + 1;
                        start = l;
                    }
                    need[s.charAt(l)]++;
                    l++;
                    count++;
                }
            }
            return size == Integer.MAX_VALUE ? "" : s.substring(start, start + size);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}