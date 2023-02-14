package leetcode.editor.cn;

import java.util.HashMap;

/**
 * 题目Id：337
 * 题目：打家劫舍 III
 *
 * @author yangyi
 */
public class HouseRobberIii {
    public static void main(String[] args) {
        Solution solution = new HouseRobberIii().new Solution();
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
        public int rob(TreeNode root) {
            HashMap<TreeNode, Integer> memo = new HashMap<>();
            return robInternal(root, memo);
        }

        public int robInternal(TreeNode root, HashMap<TreeNode, Integer> memo) {
            if (root == null) return 0;
            if (memo.containsKey(root)) return memo.get(root);
            int money = root.val;

            if (root.left != null) {
                money += (robInternal(root.left.left, memo) + robInternal(root.left.right, memo));
            }
            if (root.right != null) {
                money += (robInternal(root.right.left, memo) + robInternal(root.right.right, memo));
            }
            int result = Math.max(money, robInternal(root.left, memo) + robInternal(root.right, memo));
            memo.put(root, result);
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 