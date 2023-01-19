package leetcode.editor.cn;

/**
 * 题目Id：654
 * 题目：最大二叉树
 *
 * @author yangyi
 */
public class MaximumBinaryTree {
    public static void main(String[] args) {
        Solution solution = new MaximumBinaryTree().new Solution();
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
        public TreeNode constructMaximumBinaryTree(int[] nums) {
            return dfs(nums, 0, nums.length - 1);
        }

        private TreeNode dfs(int[] nums, int l, int r) {
            if (l > r) {
                return null;
            }
            int o = 0;
            int max = -1;
            for (int i = l; i <= r; i++) {
                if (nums[i] > max) {
                    o = i;
                    max = nums[i];
                }
            }
            TreeNode node = new TreeNode(max);
            node.left = dfs(nums, l, o - 1);
            node.right = dfs(nums, o + 1, r);
            return node;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 