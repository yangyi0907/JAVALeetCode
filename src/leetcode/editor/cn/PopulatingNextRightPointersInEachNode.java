package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 题目Id：116
 * 题目：填充每个节点的下一个右侧节点指针
 *
 * @author yangyi
 */
public class PopulatingNextRightPointersInEachNode {
    public static void main(String[] args) {
        Solution solution = new PopulatingNextRightPointersInEachNode().new Solution();
    }

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    class Solution {
        public Node connect(Node root) {
            if (root == null){
                return root;
            }
            LinkedList<Node> queue = new LinkedList<>();
            queue.addLast(root);
            while (queue.size() != 0) {
                int n = queue.size();
                Node pre = new Node();
                while (n-- != 0) {
                    Node node = queue.removeFirst();
                    pre.next = node;
                    pre = node;
                    if (node.left != null) {
                        queue.addLast(node.left);
                    }
                    if (node.right != null) {
                        queue.addLast(node.right);
                    }
                }
            }
            return root;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 