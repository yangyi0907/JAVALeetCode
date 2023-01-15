package leetcode.editor.cn;

/**
 * 题目Id：222
 * 题目：完全二叉树的节点个数
 *
 * @author yangyi
 */
public class CountCompleteTreeNodes {
    public static void main(String[] args) {
        Solution solution = new CountCompleteTreeNodes().new Solution();
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

        public int countNodes(TreeNode root) {
            dfs(root);
            return ans;
        }

        public void dfs(TreeNode root) {
            if (root == null) {
                return;
            }
            ans++;
            dfs(root.left);
            dfs(root.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 