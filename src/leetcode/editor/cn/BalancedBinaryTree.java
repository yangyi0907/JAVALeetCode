package leetcode.editor.cn;

/**
 * 题目Id：110
 * 题目：平衡二叉树
 *
 * @author yangyi
 */
public class BalancedBinaryTree {
    public static void main(String[] args) {
        Solution solution = new BalancedBinaryTree().new Solution();
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
        /**
         * 递归法
         */
        public boolean isBalanced(TreeNode root) {
            return getHeight(root) != -1;
        }

        private int getHeight(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int l = getHeight(root.left);
            if (l == -1) {
                return -1;
            }
            int r = getHeight(root.right);
            if (r == -1) {
                return -1;
            }
            if (Math.abs(l - r) > 1) {
                return -1;
            }
            return Math.max(l, r) + 1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 