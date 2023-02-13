package leetcode.editor.cn;

/**
 * 题目Id：968
 * 题目：监控二叉树
 *
 * @author yangyi
 */
public class BinaryTreeCameras {
    public static void main(String[] args) {
        Solution solution = new BinaryTreeCameras().new Solution();
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
        int res;

        public int minCameraCover(TreeNode root) {
            if(dfs(root)==0){
                res++;
            }
            return res;
        }

        public int dfs(TreeNode root) {
            if (root == null) {
                return 2;
            }
            int l = dfs(root.left);
            int r = dfs(root.right);
            if (l == 2 && r == 2) {
                return 0;
            }
            if (l == 0 || r == 0) {
                res++;
                return 1;
            }
            if (l == 1 || r == 1) {
                return 2;
            }
            return 0;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 