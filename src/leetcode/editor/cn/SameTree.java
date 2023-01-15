package leetcode.editor.cn;

/**
 * 题目Id：100
 * 题目：相同的树
 *
 * @author yangyi
 */
public class SameTree {
    public static void main(String[] args) {
        Solution solution = new SameTree().new Solution();
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
        public boolean isSameTree(TreeNode left, TreeNode right) {
            if (left == null && right == null) {
                return true;
            }
            if (left == null || right == null) {
                return false;
            }
            if (left.val != right.val) {
                return false;
            }
            return isSameTree(left.left, right.left) && isSameTree(left.right, right.right);
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

} 