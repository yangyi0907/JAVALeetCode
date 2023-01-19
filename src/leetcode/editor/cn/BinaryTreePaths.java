package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目Id：257
 * 题目：二叉树的所有路径
 *
 * @author yangyi
 */
public class BinaryTreePaths {
    public static void main(String[] args) {
        Solution solution = new BinaryTreePaths().new Solution();
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
        List<String> ans = new ArrayList<>();

        public List<String> binaryTreePaths(TreeNode root) {
            dfs(root, new StringBuilder());
            return ans;
        }

        public void dfs(TreeNode root, StringBuilder s) {
            if (root == null) {
                return;
            }
            if (root.left == null && root.right == null) {
                s.append(root.val);
                ans.add(String.valueOf(s));
            } else {
                s.append(root.val).append("->");
            }
            dfs(root.left, new StringBuilder(s));
            dfs(root.right, new StringBuilder(s));
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

} 