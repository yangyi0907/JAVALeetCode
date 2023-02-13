package leetcode.editor.cn;

/**
 * 题目Id：701
 * 题目：二叉搜索树中的插入操作
 *
 * @author yangyi
 */
public class InsertIntoABinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new InsertIntoABinarySearchTree().new Solution();
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
        public TreeNode insertIntoBST(TreeNode root, int val) {
            return dfs(root, val);
        }

        private TreeNode dfs(TreeNode root, int val) {
            if (root == null) {
                return new TreeNode(val);
            }
            if (val > root.val) {
                root.right = dfs(root.right, val);
            } else {
                root.left = dfs(root.left, val);
            }
            return root;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 