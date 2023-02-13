package leetcode.editor.cn;

/**
 * 题目Id：450
 * 题目：删除二叉搜索树中的节点
 *
 * @author yangyi
 */
public class DeleteNodeInABst {
    public static void main(String[] args) {
        Solution solution = new DeleteNodeInABst().new Solution();
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
        public TreeNode deleteNode(TreeNode root, int key) {
            return dfs(root, key);
        }

        private TreeNode dfs(TreeNode root, int key) {
            if (root == null) {
                return null;
            }
            if (key > root.val) {
                root.right = dfs(root.right, key);
            } else if (key < root.val) {
                root.left = dfs(root.left, key);
            } else {
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                } else {
                    TreeNode n = root.right;
                    while (n.left != null) {
                        n = n.left;
                    }
                    n.left = root.left;
                    return root.right;
                }
            }
            return root;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 