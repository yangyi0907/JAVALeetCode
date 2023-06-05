package leetcode.editor.cn;

/**
 * 题目Id：4
 * 题目：寻找两个正序数组的中位数
 *
 * @author yangyi
 */
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Solution solution = new MedianOfTwoSortedArrays().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int n = nums1.length;
            int m = nums2.length;
            int[] nums = new int[n + m];
            int p1 = 0, p2 = 0;
            for (int i = 0; i < nums.length; i++) {
                int n1 = Integer.MAX_VALUE;
                int n2 = Integer.MAX_VALUE;
                if (p1 < n) {
                    n1 = nums1[p1];
                }
                if (p2 < m) {
                    n2 = nums2[p2];
                }
                if (n1 <= n2) {
                    nums[i] = n1;
                    p1++;
                } else {
                    nums[i] = n2;
                    p2++;
                }
            }
            double res = 0;
            if ((m + n) % 2 == 0) {
                res = (nums[(m + n) / 2 - 1] + nums[(m + n) / 2]) / 2.0;
            } else {
                res = nums[(m + n) / 2];
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 