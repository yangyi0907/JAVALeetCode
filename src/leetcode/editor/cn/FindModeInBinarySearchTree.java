package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目Id：501
 * 题目：二叉搜索树中的众数
 *
 * @author yangyi
 */
public class FindModeInBinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new FindModeInBinarySearchTree().new Solution();
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
        List<Integer> ans = new ArrayList<>();
        int pre = -1;
        int count = 0;
        int maxCount = 0;

        public int[] findMode(TreeNode root) {
            dfs(root);
            int[] res = new int[ans.size()];
            for (int i = 0; i < ans.size(); i++) {
                res[i] = ans.get(i);
            }
            return res;
        }

        private void dfs(TreeNode root) {
            if (root == null) {
                return;
            }
            dfs(root.left);
            if (pre == -1) {
                count++;
            } else if (pre == root.val) {
                count++;
            }else{
                count = 1;
            }
            pre = root.val;
            if (maxCount == 0) {
                maxCount = count;
                ans.add(root.val);
            } else if (count == maxCount) {
                ans.add(root.val);
            } else if (count > maxCount) {
                maxCount = count;
                ans.clear();
                ans.add(root.val);
            }
            dfs(root.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 