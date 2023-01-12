package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目Id：202
 * 题目：快乐数
 *
 * @author yangyi
 */
public class HappyNumber {
    public static void main(String[] args) {
        Solution solution = new HappyNumber().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isHappy(int n) {
            List<Integer> list = new ArrayList<>();
            while (n != 1) {
                if (list.contains(n)){
                    return false;
                }
                list.add(n);
                n = sum(n);
            }
            return true;
        }

        public int sum(int n) {
            int ans = 0;
            while (n != 0) {
                int a = n % 10;
                n /= 10;
                ans += Math.pow(a, 2);
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 