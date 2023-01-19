package leetcode.editor.cn;

/**
 * 题目Id：112
 * 题目：路径总和
 *
 * @author yangyi
 */
public class PathSum {
    public static void main(String[] args) {
        Solution solution = new PathSum().new Solution();
    }

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
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            if (root == null) {
                return false;
            }
            return dfs(root, 0, targetSum);
        }

        public boolean dfs(TreeNode root, int sum, int targetSum) {
            if (root == null) {
                return false;
            }
            sum += root.val;
            if (root.left == null && root.right == null) {
                if (sum == targetSum) {
                    return true;
                } else {
                    return false;
                }
            }
            boolean l = dfs(root.left, sum, targetSum);
            boolean r = dfs(root.right, sum, targetSum);
            return l || r;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 