package leetcode.editor.cn;

/**
 * 题目Id：106
 * 题目：从中序与后序遍历序列构造二叉树
 *
 * @author yangyi
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public static void main(String[] args) {
        Solution solution = new ConstructBinaryTreeFromInorderAndPostorderTraversal().new Solution();
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
        public TreeNode buildTree(int[] inorder, int[] postorder) {
            return dfs(inorder, 0, inorder.length - 1, postorder, 0, inorder.length - 1);
        }

        public TreeNode dfs(int[] inorder, int iL, int iR, int[] postorder, int pL, int pR) {
            if (iL > iR || pL > pR) {
                return null;
            }
            int r = postorder[pR];
            TreeNode node = new TreeNode(r);
            int o = -1;
            for (int i = iL; i <= iR; i++) {
                if (inorder[i] == r) {
                    o = i;
                    break;
                }
            }
            //o-1-iL =x-pL
            node.left = dfs(inorder, iL, o - 1, postorder, pL, pL + o - 1 - iL);
            node.right = dfs(inorder, o + 1, iR, postorder, pL + o - iL, pR - 1);
            return node;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 