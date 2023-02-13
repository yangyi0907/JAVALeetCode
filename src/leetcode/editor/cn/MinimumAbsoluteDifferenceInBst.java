package leetcode.editor.cn;

/**
 * 题目Id：530
 * 题目：二叉搜索树的最小绝对差
 *
 * @author yangyi
 */
public class MinimumAbsoluteDifferenceInBst {
    public static void main(String[] args) {
        Solution solution = new MinimumAbsoluteDifferenceInBst().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        int pre = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;

        public int getMinimumDifference(TreeNode root) {
            dfs(root);
            return ans;
        }

        private void dfs(TreeNode root) {
            if (root == null) {
                return;
            }
            dfs(root.left);
            ans = Math.min(ans, Math.abs(pre - root.val));
            pre = root.val;
            dfs(root.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 