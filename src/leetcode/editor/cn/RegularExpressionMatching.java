package leetcode.editor.cn;

/**
 * 题目Id：10
 * 题目：正则表达式匹配
 *
 * @author yangyi
 */
public class RegularExpressionMatching {
    public static void main(String[] args) {
        Solution solution = new RegularExpressionMatching().new Solution();
        solution.isMatch("aab", "c*a*b");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isMatch(String s, String p) {
            char[] str1 = s.toCharArray();
            char[] str2 = p.toCharArray();
            int n1 = str1.length;
            int n2 = str2.length;
            boolean[][] dp = new boolean[n1 + 1][n2 + 1];
            dp[0][0] = true;
            for (int j = 1; j <= n2; j++) {
                if (str2[j - 1] == '*') {
                    dp[0][j] = dp[0][j - 2];
                }
            }
            for (int i = 1; i <= str1.length; i++) {
                for (int j = 1; j <= str2.length; j++) {
                    if (str1[i - 1] == str2[j - 1] || str2[j - 1] == '.') {
                        dp[i][j] = dp[i - 1][j - 1];
                    } else if (str2[j - 1] == '*') {
                        // 模式串*的前一个字符能够跟文本串的末位匹配上
                        if (str1[i - 1] == str2[j - 2] || str2[j - 2] == '.') {
                            dp[i][j] = dp[i][j - 2]      // *匹配0次的情况
                                    || dp[i - 1][j];     // *匹配1次或多次的情况
                        } else { // 模式串*的前一个字符不能够跟文本串的末位匹配
                            dp[i][j] = dp[i][j - 2];     // *只能匹配0次
                        }
                    }
                }
            }
            return dp[n1][n2];

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}