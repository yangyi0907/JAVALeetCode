package leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

/**
 * 题目Id：349
 * 题目：两个数组的交集
 *
 * @author yangyi
 */
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Solution solution = new IntersectionOfTwoArrays().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<>();
            for (int i : nums1) {
                set1.add(i);
            }
            Set<Integer> set2 = new HashSet<>();
            for (int i : nums2) {
                if (set1.contains(i)){
                    set2.add(i);
                }
            }
            int[] ans = new int[set2.size()];
            int i = 0;
            for (int a : set2){
                ans[i++] = a;
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 