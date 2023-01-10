package leetcode.editor.cn;
/**
 * 题目Id：27
 * 题目：移除元素
 * @author yangyi
 */
public class RemoveElement {
    public static void main(String[] args) {
        Solution solution = new RemoveElement().new Solution();
        solution.removeElement(new int[]{3,2,2,3},3);
        System.out.println("Hello world");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int l = -1, r = 0;
        while (r < n){
            if (nums[r] != val) {
                nums[++l] = nums[r];
            }
            r++;
        }
        return l + 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

} 