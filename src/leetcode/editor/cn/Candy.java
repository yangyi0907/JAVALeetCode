package leetcode.editor.cn;

import java.util.Arrays;

/**
 * 题目Id：135
 * 题目：分发糖果
 *
 * @author yangyi
 */
public class Candy {
    public static void main(String[] args) {
        Solution solution = new Candy().new Solution();
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int candy(int[] ratings) {
        int res = 0;
        int[] sum = new int[ratings.length];
        Arrays.fill(sum, 1);
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                sum[i] = sum[i - 1] + 1;
            }
        }
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                sum[i] = Math.max(sum[i], sum[i + 1] + 1);
            }
        }
        for (int i = 0; i < sum.length; i++) {
            res += sum[i];
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

} 