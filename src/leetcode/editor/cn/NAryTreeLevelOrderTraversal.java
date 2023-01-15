package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 题目Id：429
 * 题目：N 叉树的层序遍历
 *
 * @author yangyi
 */
public class NAryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        Solution solution = new NAryTreeLevelOrderTraversal().new Solution();
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    //leetcode submit region begin(Prohibit modification and deletion)

// Definition for a Node.

    class Solution {
        public List<List<Integer>> levelOrder(Node root) {
            List<List<Integer>> ans = new ArrayList<>();
            if (root == null) {
                return ans;
            }
            LinkedList<Node> queue = new LinkedList<>();
            queue.addLast(root);
            while (queue.size() != 0) {
                int n = queue.size();
                List<Integer> list = new ArrayList<>();
                while (n-- != 0) {
                    Node node = queue.removeFirst();
                    list.add(node.val);
                    List<Node> child = node.children;
                    for (Node c : child) {
                        if (c != null) {
                            queue.addLast(c);
                        }
                    }
                }
                ans.add(list);
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 