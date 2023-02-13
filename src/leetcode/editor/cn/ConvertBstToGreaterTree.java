package leetcode.editor.cn;

/**
 * 题目Id：538
 * 题目：把二叉搜索树转换为累加树
 *
 * @author yangyi
 */
public class ConvertBstToGreaterTree {
    public static void main(String[] args) {
        Solution solution = new ConvertBstToGreaterTree().new Solution();
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
        int pre = 0;
        public TreeNode convertBST(TreeNode root) {
            dfs(root);
            return root;
        }
        public void dfs(TreeNode root) {
            if (root == null) {
                return;
            }
            dfs(root.right);
            root.val += pre;
            pre = root.val;
            dfs(root.left);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 