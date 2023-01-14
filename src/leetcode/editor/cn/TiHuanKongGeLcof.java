package leetcode.editor.cn;

/**
 * 题目Id：剑指 Offer 05
 * 题目：替换空格
 *
 * @author yangyi
 */
public class TiHuanKongGeLcof {
    public static void main(String[] args) {
        Solution solution = new TiHuanKongGeLcof().new Solution();
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String replaceSpace(String s) {
        StringBuffer ans = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){
                ans.append("%20");
            }else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

} 