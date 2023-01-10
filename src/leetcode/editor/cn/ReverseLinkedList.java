package leetcode.editor.cn;

/**
 * 题目Id：206
 * 题目：反转链表
 *
 * @author yangyi
 */
public class ReverseLinkedList {
    public static void main(String[] args) {
        Solution solution = new ReverseLinkedList().new Solution();
    }

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

    //leetcode submit region begin(Prohibit modification and deletion)

    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode h = new ListNode(-1);
            ListNode p = h;
            while (head != null) {
                ListNode next = head.next;
                head.next = p.next;
                p.next = head;
                head = next;
            }
            return h.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 