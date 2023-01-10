package leetcode.editor.cn;

/**
 * 题目Id：904
 * 题目：水果成篮
 *
 * @author yangyi
 */
public class FruitIntoBaskets {
    public static void main(String[] args) {
        Solution solution = new FruitIntoBaskets().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int totalFruit(int[] fruits) {
            int n = fruits.length;
            int[] nums = new int[n];
            int count = 0;
            int start = 0;
            int res = 0;
            for (int i = 0; i < fruits.length; i++) {
                if (nums[fruits[i]] == 0) {
                    count++;
                }
                nums[fruits[i]]++;
                while (count > 2){
                    nums[fruits[start]]--;
                    if (nums[fruits[start]] == 0){
                        count--;
                    }
                    start++;
                }
                res = Math.max(res, i - start + 1);
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 