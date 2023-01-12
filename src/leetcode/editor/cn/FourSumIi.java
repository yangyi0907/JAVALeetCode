package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * 题目Id：454
 * 题目：四数相加 II
 *
 * @author yangyi
 */
public class FourSumIi {
    public static void main(String[] args) {
        Solution solution = new FourSumIi().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
            int ans = 0;
            Map<Integer, Integer> map1 = new HashMap<>();
            Map<Integer, Integer> map2 = new HashMap<>();
            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    int sum = nums1[i] + nums2[j];
                    map1.put(sum, map1.getOrDefault(sum, 0) + 1);
                }
            }
            for (int i = 0; i < nums3.length; i++) {
                for (int j = 0; j < nums4.length; j++) {
                    int sum = nums3[i] + nums4[j];
                    map2.put(sum, map2.getOrDefault(sum, 0) + 1);
                }
            }
            for (Map.Entry<Integer, Integer> m1 : map1.entrySet()) {
                for (Map.Entry<Integer, Integer> m2 : map2.entrySet()) {
                    if (m1.getKey() + m2.getKey() == 0) {
                        ans += m1.getValue() * m2.getValue();
                    }
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 