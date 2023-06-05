package leetcode.editor.cn;

/**
 * 题目Id：605
 * 题目：种花问题
 *
 * @author yangyi
 */
public class CanPlaceFlowers {
    public static void main(String[] args) {
        Solution solution = new CanPlaceFlowers().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            int sum = 0;
            int i = 0;
            while (i < flowerbed.length) {
                if (flowerbed[i] == 1) {
                    i += 2;
                } else if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                    sum++;
                    i += 2;
                } else {
                    i += 3;
                }
            }
            return sum >= n;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 