package leetcode.editor.cn;

/**
 * 题目Id：108
 * 题目：将有序数组转换为二叉搜索树
 *
 * @author yangyi
 */
public class ConvertSortedArrayToBinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new ConvertSortedArrayToBinarySearchTree().new Solution();
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
        public TreeNode sortedArrayToBST(int[] nums) {
            return buildTree(nums, 0, nums.length - 1);
        }

        public TreeNode buildTree(int[] nums, int l, int r) {
            if (r < l) {
                return null;
            }
            int mid = l + (r - l) / 2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = buildTree(nums, l, mid - 1);
            node.right = buildTree(nums, mid + 1, r);
            return node;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 