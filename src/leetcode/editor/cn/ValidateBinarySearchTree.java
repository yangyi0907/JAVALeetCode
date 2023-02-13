package leetcode.editor.cn;

/**
 * 题目Id：98
 * 题目：验证二叉搜索树
 *
 * @author yangyi
 */
public class ValidateBinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new ValidateBinarySearchTree().new Solution();
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
        private long pre = Long.MIN_VALUE;

        public boolean isValidBST(TreeNode root) {
            return dfs(root);
        }

        private boolean dfs(TreeNode root) {
            if (root == null) {
                return true;
            }
            boolean l = dfs(root.left);
            if (root.val <= pre) {
                return false;
            }
            pre = root.val;
            boolean r = dfs(root.right);
            return l && r;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 