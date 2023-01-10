package leetcode.editor.cn;

/**
 * 题目Id：35
 * 题目：搜索插入位置
 * @author yangyi
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        Solution solution = new SearchInsertPosition().new Solution();
        solution.searchInsert(new int[]{1, 3, 5, 6}, 2);
        System.out.println("Hello world");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int l = 0, r = nums.length - 1;
            int mid = l + (r - l) / 2;
            while (l <= r) {
                mid = l + (r - l) / 2;
                if (nums[mid] > target) {
                    r = mid - 1;
                } else if (nums[mid] < target) {
                    l = mid + 1;
                } else {
                    return mid;
                }
            }
            return r + 1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 