package leetcode.editor.cn;

import java.security.MessageDigest;

/**
 * 题目Id：704
 * 题目：二分查找
 *
 * @author yangyi
 */
public class BinarySearch {
    public static void main(String[] args) {
        Solution solution = new BinarySearch().new Solution();
        System.out.println("Hello world");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int search(int[] nums, int target) {
            int l = 0, r = nums.length - 1;
            while (l <= r ) {
                int mid = l + (r - l) / 2;
                if (nums[mid] > target){
                    r = mid - 1;
                }else if(nums[mid] < target){
                    l = mid + 1;
                }else{
                    return mid;
                }
            }
            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 