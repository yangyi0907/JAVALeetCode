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
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode p1 = new ListNode(-1);
            p1.next = head;
            head = p1;
            while (n-- != 0) {
                p1 = p1.next;
            }
            ListNode p2 = head;
            while (p1.next != null){
                p1 = p1.next;
                p2 = p2.next;
            }
            p2.next = p2.next.next;
            return head.next;

        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}