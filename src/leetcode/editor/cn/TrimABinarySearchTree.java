package leetcode.editor.cn;

/**
 * 题目Id：669
 * 题目：修剪二叉搜索树
 *
 * @author yangyi
 */
public class TrimABinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new TrimABinarySearchTree().new Solution();
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
        public TreeNode trimBST(TreeNode root, int low, int high) {
            return dfs(root, low, high);
        }

        private TreeNode dfs(TreeNode root, int low, int high) {
            if (root == null) {
                return null;
            }
            if (root.val < low) {
                return dfs(root.right, low, high);
            } else if (root.val > high) {
                return dfs(root.left, low, high);
            } else {
                root.left = dfs(root.left, low, high);
                root.right = dfs(root.right, low, high);
            }
            return root;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 