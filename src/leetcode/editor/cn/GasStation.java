package leetcode.editor.cn;

/**
 * 题目Id：134
 * 题目：加油站
 *
 * @author yangyi
 */
public class GasStation {
    public static void main(String[] args) {
        Solution solution = new GasStation().new Solution();
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalSum = 0;
        for (int i = 0; i < gas.length; i++) {
            totalSum += gas[i] - cost[i];
        }
        if (totalSum < 0) {
            return -1;
        }
        int sum = 0;
        int res = 0;
        for (int i = 0; i < gas.length; i++) {
            sum += gas[i] - cost[i];
            if (sum < 0) {
                sum = 0;
                res = i + 1;
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

} 