package leetcode.editor.cn;

/**
 * 题目Id：34
 * 题目：在排序数组中查找元素的第一个和最后一个位置
 *
 * @author yangyi
 */
public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        Solution solution = new FindFirstAndLastPositionOfElementInSortedArray().new Solution();
        System.out.println("Hello world");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int l = searchLRange(nums, target);
            int r = searchRRange(nums, target);
            // 情况一
            if (l == -2 || r == -2){
                return new int[]{-1, -1};
            }
            // 情况三
            if (r - l > 1){
                return new int[]{l + 1, r - 1};
            }
            // 情况二
            return new int[]{-1, -1};
        }

        public int searchRRange(int[] nums, int target) {
            int result = -2;
            int l = 0, r = nums.length - 1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (nums[mid] > target) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                    result = l;
                }
            }
            return result;
        }

        public int searchLRange(int[] nums, int target) {
            int result = -2;
            int l = 0, r = nums.length - 1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (nums[mid] >= target) {
                    r = mid - 1;
                    result = r;
                } else {
                    l = mid + 1;
                }
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 