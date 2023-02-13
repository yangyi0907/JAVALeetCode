package leetcode.editor.cn;

/**
 * 题目Id：236
 * 题目：二叉树的最近公共祖先
 *
 * @author yangyi
 */
public class LowestCommonAncestorOfABinaryTree {
    public static void main(String[] args) {
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            return dfs(root, p, q);
        }

        public TreeNode dfs(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null) {
                return null;
            }
            if (root == p || root == q) {
                return root;
            }
            TreeNode l = dfs(root.left, p, q);
            TreeNode r = dfs(root.right, p, q);
            if (l != null && r != null) {
                return root;
            } else if (l != null) {
                return l;
            } else {
                return r;
            }

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 