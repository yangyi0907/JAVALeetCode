package leetcode.editor.cn;

import java.lang.invoke.CallSite;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 二叉树的层序遍历 II
 *
 * @author DY YANGYI
 * @date 2023-01-14 19:25:27
 */
public class BinaryTreeLevelOrderTraversalIi {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new BinaryTreeLevelOrderTraversalIi().new Solution();
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
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            List<List<Integer>> ans = new ArrayList<>();
            if (root == null) {
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
            Collections.reverse(ans);
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
