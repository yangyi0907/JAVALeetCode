package leetcode.editor.cn;

/**
 * 题目Id：1071
 * 题目：字符串的最大公因子
 *
 * @author yangyi
 */
public class GreatestCommonDivisorOfStrings {
    public static void main(String[] args) {
        Solution solution = new GreatestCommonDivisorOfStrings().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String gcdOfStrings(String str1, String str2) {
            if (!(str1 + str2).equals(str2 + str1)) {
                return "";
            }
            return str1.substring(0, gcd(str1.length(), str2.length()));
        }

        private int gcd(int a, int b) {
            return b == 0 ? a : gcd(b, a % b);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 