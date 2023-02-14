package leetcode.editor.cn;

/**
 * 题目Id：121
 * 题目：买卖股票的最佳时机
 *
 * @author yangyi
 */
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Solution solution = new BestTimeToBuyAndSellStock().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxProfit(int[] prices) {
            int min = prices[0];
            int res = 0;
            for (int i = 1; i < prices.length; i++) {
                res = Math.max(res, prices[i] - min);
                min = Math.min(min, prices[i]);
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 