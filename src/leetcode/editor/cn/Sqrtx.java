package leetcode.editor.cn;

/**
 * 题目Id：69
 * 题目：x 的平方根
 *
 * @author yangyi
 */
public class Sqrtx {
    public static void main(String[] args) {
        Solution solution = new Sqrtx().new Solution();
        solution.mySqrt(8);
        System.out.println("Hello world");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int mySqrt(int x) {
            long l = 1, r = x;
            while (l <= r) {
                long mid = l + (r - l) / 2;
                if (x < mid * mid) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            return (int)r;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 