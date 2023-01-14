package leetcode.editor.cn;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的后序遍历
 *
 * @author DY YANGYI
 * @date 2023-01-14 18:35:20
 */
public class BinaryTreePostorderTraversal {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new BinaryTreePostorderTraversal().new Solution();
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
        List<Integer> ans = new ArrayList<Integer>();
        public List<Integer> postorderTraversal(TreeNode root) {
            dfs(root);
            return ans;
        }

        private void dfs(TreeNode root) {
            if (root == null) {
                return;
            }
            dfs(root.left);
            dfs(root.right);
            ans.add(root.val);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
