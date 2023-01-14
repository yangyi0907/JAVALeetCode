package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 二叉树的层序遍历
 *
 * @author DY YANGYI
 * @date 2023-01-14 19:10:27
 */
public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new BinaryTreeLevelOrderTraversal().new Solution();
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


    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> ans = new ArrayList<>();
            if (root == null){
                return ans;
            }
            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.addLast(root);
            while (queue.size() != 0) {
                int n = queue.size();
                List<Integer> list = new ArrayList<>();
                while (n-- != 0) {
                    TreeNode node = queue.removeFirst();
                    list.add(node.val);
                    if (node.left != null) {
                        queue.addLast(node.left);
                    }
                    if (node.right != null) {
                        queue.addLast(node.right);
                    }
                }
                ans.add(list);
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
