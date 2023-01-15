package leetcode.editor.cn;

/**
 * 题目Id：572
 * 题目：另一棵树的子树
 *
 * @author yangyi
 */
public class SubtreeOfAnotherTree {
    public static void main(String[] args) {
        Solution solution = new SubtreeOfAnotherTree().new Solution();
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
        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            boolean dfs = dfs(root, subRoot);
            return dfs;
        }

        public boolean dfs(TreeNode root, TreeNode subRoot) {
            if (root == null) {
                return false;
            }
            boolean ans = isSameTree(root, subRoot);
            if (ans) {
                return true;
            }
            return dfs(root.left, subRoot) || dfs(root.right, subRoot);
        }

        public boolean isSameTree(TreeNode left, TreeNode right) {
            if (left == null && right == null) {
                return true;
            }
            if (left == null || right == null) {
                return false;
            }
            if (left.val != right.val) {
                return false;
            }
            return isSameTree(left.left, right.left) && isSameTree(left.right, right.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 