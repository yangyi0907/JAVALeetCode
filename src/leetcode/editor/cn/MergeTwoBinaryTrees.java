package leetcode.editor.cn;

/**
 * 题目Id：617
 * 题目：合并二叉树
 *
 * @author yangyi
 */
public class MergeTwoBinaryTrees {
    public static void main(String[] args) {
        Solution solution = new MergeTwoBinaryTrees().new Solution();
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
        public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
            return dfs(root1, root2);
        }

        private TreeNode dfs(TreeNode root1, TreeNode root2) {
            if (root1 == null) {
                return root2;
            }
            if (root2 == null) {
                return root1;
            }
            root1.val += root2.val;
            root1.left = dfs(root1.left, root2.left);
            root1.right = dfs(root1.right, root2.right);
            return root1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 