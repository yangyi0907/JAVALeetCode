package leetcode.editor.cn;
/**
 * 题目Id：26
 * 题目：删除有序数组中的重复项
 * @author yangyi
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Solution solution = new RemoveDuplicatesFromSortedArray().new Solution();
        System.out.println("Hello world");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0, r = 1;
        while (r < nums.length){
            if (nums[r] != nums[r - 1]){
                l++;
                nums[l] = nums[r];
            }
            r++;
        }
        return l + 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

} 