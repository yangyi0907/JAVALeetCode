package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 题目Id：111
 * 题目：二叉树的最小深度
 *
 * @author yangyi
 */
public class MinimumDepthOfBinaryTree {
    public static void main(String[] args) {
        Solution solution = new MinimumDepthOfBinaryTree().new Solution();
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
        public int minDepth(TreeNode root) {
            int ans = 0;
            if (root == null) {
                return ans;
            }
            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.addLast(root);
            while (queue.size() != 0) {
                int n = queue.size();
                ans++;
                while (n-- != 0) {
                    TreeNode node = queue.removeFirst();
                    if (node.left == null && node.right == null) {
                        return ans;
                    }
                    if (node.left != null) {
                        queue.addLast(node.left);
                    }
                    if (node.right != null) {
                        queue.addLast(node.right);

                    }

                }
            }
            return ans;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}