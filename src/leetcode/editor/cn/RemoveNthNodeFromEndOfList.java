package leetcode.editor.cn;

/**
 * 题目Id：19
 * 题目：删除链表的倒数第 N 个结点
 *
 * @author yangyi
 */
public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        Solution solution = new RemoveNthNodeFromEndOfList().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 