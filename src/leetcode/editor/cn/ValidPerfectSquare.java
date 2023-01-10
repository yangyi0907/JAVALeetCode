package leetcode.editor.cn;
/**
 * 题目Id：367
 * 题目：有效的完全平方数
 * @author yangyi
 */
public class ValidPerfectSquare {
    public static void main(String[] args) {
        Solution solution = new ValidPerfectSquare().new Solution();
        System.out.println("Hello world");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPerfectSquare(int x) {
        long l = 1, r = x;
        while (l <= r) {
            long mid = l + (r - l) / 2;
            if (x == mid * mid){
                return true;
            }else if (x < mid * mid) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

} 