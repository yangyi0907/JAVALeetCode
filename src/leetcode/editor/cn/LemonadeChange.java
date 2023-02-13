package leetcode.editor.cn;

/**
 * 题目Id：860
 * 题目：柠檬水找零
 *
 * @author yangyi
 */
public class LemonadeChange {
    public static void main(String[] args) {
        Solution solution = new LemonadeChange().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean lemonadeChange(int[] bills) {
            int[] money = new int[3];
            for (int i = 0; i < bills.length; i++) {
                if (bills[i] == 5) {
                    money[0]++;
                } else if (bills[i] == 10) {
                    if (money[0] > 0) {
                        money[0]--;
                        money[1]++;
                    } else {
                        return false;
                    }
                } else {
                    if (money[0] > 0 && money[1] > 0) {
                        money[0]--;
                        money[1]--;
                        money[2]++;
                    } else if (money[0] > 2) {
                        money[0] -= 3;
                        money[2]++;
                    } else {
                        return false;
                    }
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 