package leetcode.editor.cn;

/**
 * 题目Id：700
 * 题目：二叉搜索树中的搜索
 *
 * @author yangyi
 */
public class SearchInABinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new SearchInABinarySearchTree().new Solution();
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
        public TreeNode searchBST(TreeNode root, int val) {
            if (root == null) {
                return null;
            }
            return dfs(root, val);
        }

        private TreeNode dfs(TreeNode root, int val) {
            if (root == null) {
                return null;
            }
            TreeNode ans;
            if (root.val == val) {
                ans = root;
            } else if (val > root.val) {
                ans = dfs(root.right, val);
            } else {
                ans = dfs(root.left, val);
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 