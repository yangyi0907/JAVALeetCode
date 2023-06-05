package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目Id：1431
 * 题目：拥有最多糖果的孩子
 *
 * @author yangyi
 */
public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        Solution solution = new KidsWithTheGreatestNumberOfCandies().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> res = new ArrayList<>(candies.length);
            int max = 0;
            for (int i : candies) {
                max = Math.max(max, i);
            }
            for (int i : candies) {
                if (i + extraCandies >= max) {
                    res.add(true);
                } else {
                    res.add(false);
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 