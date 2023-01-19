package leetcode.editor.cn;

/**
 * 题目Id：404
 * 题目：左叶子之和
 *
 * @author yangyi
 */
public class SumOfLeftLeaves {
    public static void main(String[] args) {
        Solution solution = new SumOfLeftLeaves().new Solution();
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
        int ans = 0;

        public int sumOfLeftLeaves(TreeNode root) {
            dfs(root, false);
            return ans;
        }

        public void dfs(TreeNode root, boolean isLeaf) {
            if (root == null) {
                return;
            }
            if (isLeaf && root.left == null && root.right == null) {
                ans += root.val;
                return;
            }
            dfs(root.left, true);
            dfs(root.right, false);

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 